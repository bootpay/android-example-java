//package kr.co.bootpay.android_example_java;
//
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import kr.co.bootpay.android.constants.BootpayBuildConfig;
//import kr.co.bootpay.android.events.BootpayEventListener;
//import kr.co.bootpay.android.models.BootExtra;
//import kr.co.bootpay.android.models.BootItem;
//import kr.co.bootpay.android.models.BootUser;
//import kr.co.bootpay.android_example_java.deprecated.BootpayRest;
//import kr.co.bootpay.android_example_java.deprecated.BootpayRestImplement;
//import kr.co.bootpay.android_example_java.deprecated.EasyPayUserTokenData;
//import kr.co.bootpay.android_example_java.deprecated.TokenData;
//import kr.co.bootpay.bio.BootpayBio;
//import kr.co.bootpay.bio.models.BioExtra;
//import kr.co.bootpay.bio.models.BioPayload;
//import kr.co.bootpay.bio.models.BioPrice;
//
//public class PasswordUIPaymentActivity extends AppCompatActivity implements BootpayRestImplement {
//    @Deprecated
//    String restApplicationId = "5b8f6a4d396fa665fdc2b5ea"; //production
//    @Deprecated
//    String privateKey = "rm6EYECr6aroQVG2ntW0A6LpWnkTgP4uQ3H18sDDUYw="; //production
//    String applicationId = "5b8f6a4d396fa665fdc2b5e8";
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_password_ui_payment);
//
//        if(BootpayBuildConfig.DEBUG) {
//            restApplicationId = "59b731f084382614ebf72215";
//            privateKey = "WwDv0UjfwFa04wYG0LJZZv1xwraQnlhnHE375n52X0U=";
//            applicationId = "5b9f51264457636ab9a07cdc";
//        }
//    }
//
//
//    public void PaymentTest(View v) {
//
//        BootpayRest.getRestToken(this, this, restApplicationId, privateKey);
//    }
//
//    public BootUser getBootUser() {
//        String userId = "123411aaaaaaaaaaaabd4ss121";
//
//        BootUser user = new BootUser();
//        user.setId(userId);
//        user.setArea("서울");
//        user.setGender(1); //1: 남자, 0: 여자
//        user.setEmail("test1234@gmail.com");
//        user.setPhone("010-1234-4567");
//        user.setBirth("1988-06-10");
//        user.setUsername("홍길동");
//        return user;
//    }
//
//    void BootpayTest(String userToken) {
//        BootUser user = new BootUser().setPhone("010-1234-5678"); // 구매자 정보
//
//        BioExtra extra = new BioExtra();
//
//
//        List<BootItem> items = new ArrayList<>();
//        BootItem item1 = new BootItem().setName("마우's 스").setId("ITEM_CODE_MOUSE").setQty(1).setPrice(500d);
//        BootItem item2 = new BootItem().setName("키보드").setId("ITEM_KEYBOARD_MOUSE").setQty(1).setPrice(500d);
//        items.add(item1);
//        items.add(item2);
//
//        BioPayload payload = new BioPayload();
//        payload.setApplicationId(applicationId)
//                .setOrderName("부트페이 결제테스트")
//                .setPg("나이스페이")
//                .setOrderId("1234")
//                .setOrderName("플리츠레이어 카라숏원피스")
//                .setUserToken(userToken)
//                .setPrice(1000d)
//                .setUser(user)
//                .setExtra(extra)
//                .setItems(items)
//                .setNames(Arrays.asList("블랙 (COLOR)", "55 (SIZE)")) //결제창에 나타날 상품목록
//                .setPrices(Arrays.asList(new BioPrice("상품가격", 89000.0),  //결제창에 나타날 가격목록
//                        new BioPrice("쿠폰적용", -25000.0),
//                        new BioPrice("배송비", 2500.0)));
//
////        Map<String, Object> map = new HashMap<>();
////        map.put("1", "abcdef");
////        map.put("2", "abcdef55");
////        map.put("3", 1234);
////        payload.setMetadata(map);
//
//        BootpayBio.init(getApplicationContext())
//                .setBioPayload(payload)
//                .setEventListener(new BootpayEventListener() {
//                    @Override
//                    public void onCancel(String data) {
//                        Log.d("bootpay", "cancel: " + data);
//                    }
//
//                    @Override
//                    public void onError(String data) {
//                        Log.d("bootpay", "error: " + data);
//                    }
//
//                    @Override
//                    public void onClose() {
//                        BootpayBio.removePaymentWindow();
//                    }
//
//                    @Override
//                    public void onIssued(String data) {
//                        Log.d("bootpay", "issued: " +data);
//                    }
//
//                    @Override
//                    public boolean onConfirm(String data) {
//                        Log.d("bootpay", "confirm: " + data);
////                        Bootpay.transactionConfirm(data); //재고가 있어서 결제를 진행하려 할때 true (방법 1)
//                        return true; //재고가 있어서 결제를 진행하려 할때 true (방법 2)
////                        return false; //결제를 진행하지 않을때 false
//                    }
//
//                    @Override
//                    public void onDone(String data) {
//                        Log.d("done", data);
//                    }
//                }).requestPassword();
//    }
//
//    @Override
//    public void callbackRestToken(TokenData token) {
//        BootpayRest.getEasyPayUserToken(this, this, token.access_token, getBootUser());
//    }
//
//    @Override
//    public void callbackEasyPayUserToken(EasyPayUserTokenData userToken) {
//        BootpayTest(userToken.user_token);
//    }
//}