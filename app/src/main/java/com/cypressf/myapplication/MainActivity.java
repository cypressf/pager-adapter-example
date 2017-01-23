package com.cypressf.myapplication;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimplePagerAdapter pagerAdapter = new SimplePagerAdapter(getSupportFragmentManager());
        final ScrollBlockingViewPager pager = (ScrollBlockingViewPager) findViewById(R.id.simple_pager);
        pager.setAdapter(pagerAdapter);
        pager.setCurrentItem(0);

        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final ToggleButton buttonBlockScrolling = (ToggleButton) findViewById(R.id.toggleButton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(0);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(1);
            }
        });

        buttonBlockScrolling.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                pager.setPagingEnabled(!isChecked);
            }
        });
    }
}
