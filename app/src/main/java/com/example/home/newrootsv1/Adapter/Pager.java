package com.example.home.newrootsv1.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.home.newrootsv1.AboutUsFrag;
import com.example.home.newrootsv1.EntrepreneurFrag;
import com.example.home.newrootsv1.FromMagFrag;
import com.example.home.newrootsv1.HumanResFrag;
import com.example.home.newrootsv1.LandActivityFrag;
import com.example.home.newrootsv1.NaturalResFrag;

/**
 * Created by home on 17/9/16.
 */
public class Pager extends FragmentStatePagerAdapter {

    int tabCount;//no of tabs in the toolbar

    public Pager(FragmentManager fm,int tabCount){

        super(fm);
        //initializing the no of tabs
        this.tabCount = tabCount;

    }


    @Override
    public Fragment getItem(int position) {

        switch(position){

            case 0:
                return  new LandActivityFrag();
            case 1:
                return new NaturalResFrag();
            case 2:
                return new HumanResFrag();
            case 3:
                return new EntrepreneurFrag();
            case 4:
                return new FromMagFrag();
            case 5:
                return new AboutUsFrag();

            default:
                return null;

        }

    }

    @Override
    public int getCount() {

        return tabCount;

    }
}
