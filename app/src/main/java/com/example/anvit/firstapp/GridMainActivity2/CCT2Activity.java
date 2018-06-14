package com.example.anvit.firstapp.GridMainActivity2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.example.anvit.firstapp.R;

public class CCT2Activity extends AppCompatActivity {

    WebView webview;
    ProgressBar progressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cct2);
        webview =(WebView)findViewById(R.id.webviewcct2);
        progressbar = (ProgressBar) findViewById(R.id.progressbarcct2);
        webview.getSettings().setJavaScriptEnabled(true);
        String filename = "https://irregular-election.000webhostapp.com/sample.pdf";
        webview.loadUrl("http://docs.google.com/gview?embedded=true&url=" + filename);
        webview.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView view, String url) {
                progressbar.setVisibility(View.GONE);
            }
        });

    }
}
