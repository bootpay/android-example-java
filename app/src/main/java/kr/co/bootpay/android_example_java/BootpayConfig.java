package kr.co.bootpay.android_example_java;

public class BootpayConfig {
    // 권장 방식: 예제는 client_key를 .env 또는 local.properties에서 읽습니다.
    public static String clientKey = BuildConfig.BOOTPAY_CLIENT_KEY;

    // 주의: server_key (secret) 는 클라이언트에 절대 포함하지 말 것 — 서버 SDK 에서만 사용

    // Legacy 호환용. 기존 application_id/private_key 방식 테스트가 필요할 때만 사용하세요.
    public static String applicationId = BuildConfig.BOOTPAY_APPLICATION_ID;
    public static String restApplicationId = BuildConfig.BOOTPAY_REST_APPLICATION_ID;
    public static String privateKey = BuildConfig.BOOTPAY_PRIVATE_KEY;
}
