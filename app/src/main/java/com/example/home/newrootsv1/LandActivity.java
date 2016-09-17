package com.example.home.newrootsv1;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.home.newrootsv1.Adapter.Pager;


public class LandActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener{

    private int tabCount = 6;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private String[] topics = {"1","2","3","4","5","6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land);

        //adding tabs to the toolbar
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_home_black_48dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_local_florist_black_48dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_group_black_48dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_nature_people_black_48dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_local_library_black_48dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_contacts_black_48dp));


        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //initilizing pageviewer
        viewPager = (ViewPager) findViewById(R.id.pager);

        //new pager adapter
        Pager adapter = new Pager(getSupportFragmentManager(),tabLayout.getTabCount());

        //adding adapter
        viewPager.setAdapter(adapter);

        //adding listner to tab click
        tabLayout.setOnTabSelectedListener(this);

        //adding listner to swipe
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


    }




    @Override
    public void onTabSelected(TabLayout.Tab tab) {

        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
