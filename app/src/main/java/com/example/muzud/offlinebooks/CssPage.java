package com.example.muzud.offlinebooks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CssPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_css_page);

//        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
//
//        pdfView.fromAsset("css.pdf")
////                .enableSwipe(true)
//                .swipeHorizontal(true)
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
}
