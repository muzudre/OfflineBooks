package com.example.muzud.offlinebooks;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.muzud.offlinebooks.AllBooks.java.one;
import com.example.muzud.offlinebooks.AllBooks.java.two;
import com.example.muzud.offlinebooks.AllBooks.java.three;
import com.example.muzud.offlinebooks.AllBooks.java.fore;
import com.example.muzud.offlinebooks.AllBooks.java.five;


public class JavaPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_page);

//
//        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
//
//        pdfView.fromAsset("jQuery.pdf")
//                .enableSwipe(true)
////                .swipeHorizontal(true)
//                .enableDoubletap(true)
//                .defaultPage(0)
//                .enableAnnotationRendering(false)
//                .password(null)
//                .scrollHandle(null)
//                .load();
//        pdfView.useBestQuality(true);

        ImageView backButton = (ImageView)findViewById(R.id.imageView10);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void one(View view) {
        Intent ruby = new Intent(JavaPage.this, one.class);
        startActivity(ruby);
    }
    public void two(View view) {
        Intent ruby = new Intent(JavaPage.this, two.class);
        startActivity(ruby);
    }
    public void three(View view) {
        Intent ruby = new Intent(JavaPage.this, three.class);
        startActivity(ruby);
    }
    public void fore(View view) {
        Intent ruby = new Intent(JavaPage.this, fore.class);
        startActivity(ruby);
    }
    public void five(View view) {
        Intent ruby = new Intent(JavaPage.this, five.class);
        startActivity(ruby);
    }

}
