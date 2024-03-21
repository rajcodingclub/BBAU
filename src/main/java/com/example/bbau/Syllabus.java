package com.example.bbau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Syllabus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        PDFView pdfView = findViewById(R.id.pdfView);

        pdfView.fromAsset("bcasyllabus.pdf").load();

    }
}