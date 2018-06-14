package com.example.anvit.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CvSemActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv_sem);
        pdfView = (PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("sample.pdf").load();
    }
}
