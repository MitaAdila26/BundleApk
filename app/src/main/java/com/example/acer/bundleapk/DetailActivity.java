package com.example.acer.bundleapk;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {
    private ViewPager viewPager ;
    private TabLayout tabLayout;
    Pegawai pegawaiKu;
    TabFragmentAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        Intent intent = getIntent();
        pegawaiKu = (Pegawai) intent.getSerializableExtra("xxx");
        pagerAdapter=new TabFragmentAdapter(getSupportFragmentManager(),pegawaiKu);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setTabTextColors(getResources().getColor(R.color.color2),getResources().getColor(R.color.color3));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


    }
}
