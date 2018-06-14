package com.example.anvit.firstapp.CseSem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.example.anvit.firstapp.R;

public class Csesem11 extends AppCompatActivity {
    WebView webview;
    ProgressBar progressbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesem11);
        webview =(WebView)findViewById(R.id.webviewcsesem11);
        progressbar = (ProgressBar) findViewById(R.id.progressbarcssem11);
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
