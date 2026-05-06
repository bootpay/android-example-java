package kr.co.bootpay.android_example_java;

public class BootpayConfig {
    // 권장 방식: 예제는 client_key/server_key를 .env 또는 local.properties에서 읽습니다.
    public static String clientKey = BuildConfig.BOOTPAY_CLIENT_KEY;

    // server_key는 예제 토큰 발급 시연용입니다. 실서비스 클라이언트 앱에 포함하지 말고 서버사이드에서만 사용하세요.
    public static String serverKey = BuildConfig.BOOTPAY_SERVER_KEY;

    // Legacy 호환용. 기존 application_id/private_key 방식 테스트가 필요할 때만 사용하세요.
    public static String applicationId = BuildConfig.BOOTPAY_APPLICATION_ID;
    public static String restApplicationId = BuildConfig.BOOTPAY_REST_APPLICATION_ID;
    public static String privateKey = BuildConfig.BOOTPAY_PRIVATE_KEY;
}
