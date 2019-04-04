package com.example.ravy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.ravy.popup_bridge.PopupBridge;

public class MainActivity extends AppCompatActivity {
    private WebView onlinepaymentbutton;
    private PopupBridge popupBridge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onlinepaymentbutton = findViewById(R.id.web_view);
        popupBridge = popupBridge.newInstance(this,onlinepaymentbutton);
        onlinepaymentbutton.loadUrl("https://braintree.github.io/popup-bridge-example/");

    }
}
