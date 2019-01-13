package com.dennis.sk.smartkitchen;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static WebView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        v = findViewById(R.id.webV1);
        v.setWebChromeClient(new MyWebChromeClient());
        v.setWebViewClient(new WebViewClient());
        v.getSettings().setJavaScriptEnabled(true);

        String url = "http://192.168.178.95/mainWindow.php"; /* Free to replace this url with your own */
        v.loadUrl(url);
    }
}
