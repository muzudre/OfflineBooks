package com.example.muzud.offlinebooks.AllBooks.java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.muzud.offlinebooks.R;
import com.github.barteksc.pdfviewer.PDFView;

public class two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);

        pdfView.fromAsset("java/two.pdf")
                .enableSwipe(true)
//                .swipeHorizontal(true)
                .enableDoubletap(true)
                .defaultPage(0)
                .enableAnnotationRendering(false)
                .password(null)
                .scrollHandle(null)
                .load();
        pdfView.useBestQuality(true);
    }
}
