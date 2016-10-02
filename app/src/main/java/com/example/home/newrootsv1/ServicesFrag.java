package com.example.home.newrootsv1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by home on 2/10/16.
 */
public class ServicesFrag extends Fragment {

    View view;

    public static ServicesFrag newInstance(){

        return new ServicesFrag();
    }

    public ServicesFrag(){

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.services_frag,container,false);

        return view;
    }
}

