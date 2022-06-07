package com.example.uts_10119088_if3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class Slider extends AppCompatActivity {

    ViewPager viewPager;
    Adapter adapter;

    //10119088, IF-3, Laurentius Bryan Hermanto
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);

        viewPager=findViewById(R.id.pager);
        adapter=new Adapter(this);
        viewPager.setAdapter(adapter);
        // inisialisasi view
        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        // Hide ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }


    public void onClick(View view){
        Intent intent = new Intent(Slider.this, MainActivity.class);
        startActivity(intent);
    }
}