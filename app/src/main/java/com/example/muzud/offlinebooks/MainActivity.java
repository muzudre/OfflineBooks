package com.example.muzud.offlinebooks;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Animation one = AnimationUtils.loadAnimation(this, R.anim.drop_dow);
//        ImageView imageView = (ImageView) findViewById(R.id.imageView);
//        imageView.setAnimation(one);

//        Animation two = AnimationUtils.loadAnimation(this, R.anim.drop_dow);
//        ImageView imageView1 = (ImageView) findViewById(R.id.imageView2);
//        imageView1.setAnimation(two);

//        Animation tree = AnimationUtils.loadAnimation(this, R.anim.drop_dow);
//        ImageView imageView2 = (ImageView) findViewById(R.id.imageView3);
//        imageView2.setAnimation(tree);
//
//        Animation fore = AnimationUtils.loadAnimation(this, R.anim.drop_dow);
//        ImageView imageView3 = (ImageView) findViewById(R.id.imageView4);
//        imageView3.setAnimation(fore);
//
//        Animation five = AnimationUtils.loadAnimation(this, R.anim.drop_dow);
//        ImageView imageView4 = (ImageView) findViewById(R.id.imageView5);
//        imageView4.setAnimation(five);
//
//        Animation six = AnimationUtils.loadAnimation(this, R.anim.drop_dow);
//        ImageView imageView5 = (ImageView) findViewById(R.id.imageView6);
//        imageView5.setAnimation(six);
//
//        Animation seven = AnimationUtils.loadAnimation(this, R.anim.drop_dow);
//        ImageView imageView6 = (ImageView) findViewById(R.id.imageView9);
//        imageView6.setAnimation(seven);
//
//        Animation eight = AnimationUtils.loadAnimation(this, R.anim.drop_dow);
//        ImageView imageView7 = (ImageView) findViewById(R.id.imageView10);
//        imageView7.setAnimation(eight);
    }

    public void javaPro(View view) {
        Intent java = new Intent(MainActivity.this, JavaPage.class);
        startActivity(java);
    }

    public void cssPro(View view) {
        Intent css = new Intent(MainActivity.this, CssPage.class);
        startActivity(css);
    }
    public void off(View view) {
        finish();
    }
    public void htmlPro(View view) {
        Intent html = new Intent(MainActivity.this, HtmlPage.class);
        startActivity(html);
    }

    public void javascript(View view) {
        Intent javascript = new Intent(MainActivity.this, JsPage.class);
        startActivity(javascript);
    }

    public void ruby(View view) {
        Intent ruby = new Intent(MainActivity.this, RubyPage.class);
        startActivity(ruby);
    }

    public void cplus(View view){
        Intent cplus = new Intent(MainActivity.this, CplusPage.class);
        startActivity(cplus);
    }

    public void php(View view){
        Intent php = new Intent(MainActivity.this, PhpPage.class);
        startActivity(php);
    }

    public void andro(View view){
        Intent andro = new Intent(MainActivity.this, AndroidPage.class);
        startActivity(andro);
    }


    public void python(View view) {
        Intent python = new Intent(MainActivity.this, PythonPage.class);
        startActivity(python);
    }

//    double click to go back start
    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }



    //    finish

}
