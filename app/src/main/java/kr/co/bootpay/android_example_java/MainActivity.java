package kr.co.bootpay.android_example_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DefaultPayment(View v) {
        Intent intent = new Intent(getApplicationContext(), DefaultPaymentActivity.class);
        startActivity(intent);
    }

    public void TotalPayment(View v) {
        Intent intent = new Intent(getApplicationContext(), TotalPaymentActivity.class);
        startActivity(intent);
    }

    public void SubscriptionPayment(View v) {
        Intent intent = new Intent(getApplicationContext(), SubscriptionPaymentActivity.class);
        startActivity(intent);
    }

    public void SubscriptionBootpayPayment(View v) {
        Intent intent = new Intent(getApplicationContext(), SubscriptionBootpayPaymentActivity.class);
        startActivity(intent);
    }

    public void Authentication(View v) {
        Intent intent = new Intent(getApplicationContext(), AuthenticationActivity.class);
        startActivity(intent);
    }

    public void PasswordPayment(View v) {
        Intent intent = new Intent(getApplicationContext(), PasswordPaymentActivity.class);
        startActivity(intent);
    }

    public void WebAppPayment(View v) {
        Intent intent = new Intent(getApplicationContext(), WebAppActivity.class);
        startActivity(intent);
    }

//    public void BioPayment(View v) {
//        Intent intent = new Intent(getApplicationContext(), BioPaymentActivity.class);
//        startActivity(intent);
//    }

//    public void PasswordUIPayment(View v) {
//        Intent intent = new Intent(getApplicationContext(), PasswordUIPaymentActivity.class);
//        startActivity(intent);
//    }
}