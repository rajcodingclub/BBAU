package com.example.bbau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class SyllabusIT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus_it);
        PDFView pdfView = findViewById(R.id.pdfView);

        pdfView.fromAsset("bscit.pdf").load();
    }
}