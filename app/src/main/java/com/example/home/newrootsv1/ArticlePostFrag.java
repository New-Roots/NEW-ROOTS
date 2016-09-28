package com.example.home.newrootsv1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by home on 27/9/16.
 */
public class ArticlePostFrag extends Fragment {

    private View view;

    public static ArticlePostFrag newInstance(){

        return new ArticlePostFrag();
    }

    public ArticlePostFrag(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.article_article_post,container,false);


        return view;
    }
}
