package com.realtime.database.fragmenternani;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout container1;
    FrameLayout container2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container1 = findViewById(R.id.container1);
        container2 = findViewById(R.id.container2);

        Fragment1 f1 = new Fragment1();
        Fragment2 f2 = new Fragment2();

        FragmentManager fm = getSupportFragmentManager();

        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.container1, f1);
        ft.add(R.id.container2, f2);
        ft.commit();

    }
}
