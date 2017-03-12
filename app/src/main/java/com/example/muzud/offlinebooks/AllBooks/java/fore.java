package com.example.muzud.offlinebooks.AllBooks.java;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.muzud.offlinebooks.R;
import com.github.barteksc.pdfviewer.PDFView;

public class fore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fore2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finish();
            }
        });

            PDFView pdfView = (PDFView) findViewById(R.id.pdfView);

            pdfView.fromAsset("java/fore.pdf")
                .enableSwipe(true)
                    .swipeHorizontal(true)
//                    .enableDoubletap(true)
                    .defaultPage(0)
                    .enableAnnotationRendering(false)
                    .password(null)
                    .scrollHandle(null)
                    .load();
            pdfView.useBestQuality(true);
        }
    }


