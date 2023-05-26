package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
private  TabLayout tabLayout;
private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tablelayout);
        viewPager = findViewById(R.id.viewpager);
        tabLayout.setupWithViewPager(viewPager);
        VPAdapter vpAdapter=new VPAdapter(getSupportFragmentManager());
        vpAdapter.addFragment(new Fragment1(),"chats");
        vpAdapter.addFragment(new Fragment2(),"status");
        vpAdapter.addFragment(new Fragment3(),"calls");
        viewPager.setAdapter(vpAdapter);
        int desiredFragmentPosition =2;
        tabLayout.setScrollPosition(desiredFragmentPosition,0f,true);
        viewPager.setCurrentItem(desiredFragmentPosition);


    }
}