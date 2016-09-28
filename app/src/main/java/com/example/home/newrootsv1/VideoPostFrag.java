package com.example.home.newrootsv1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class VideoPostFrag extends android.support.v4.app.Fragment {


    private View view;

    public static VideoPostFrag newInstance(){

        return new VideoPostFrag();
    }

    public VideoPostFrag(){


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.article_video_post,container,false);
        return view;
    }





}
