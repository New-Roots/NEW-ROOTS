package com.example.home.newrootsv1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.home.newrootsv1.Adapter.FragmentChanger;

/**
 * Created by home on 17/9/16.
 */
public class ArticlesFrag extends Fragment {

    View view;

    //image buttons for posting the contents
    ImageButton picPostButton;
    ImageButton videoPostButton;
    ImageButton audoiPostButton;
    ImageButton articlePostButton;

    //interface for fragment jumping
    FragmentChanger fragmentChanger;



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if(context instanceof FragmentChanger){
            fragmentChanger = (FragmentChanger)context;
        }
        else{
            throw new ClassCastException(context.toString()+" must implement listener");

        }

    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //inflating the view and returning
        view = inflater.inflate(R.layout.activity_articles_frag, container, false);

        picPostButton = (ImageButton) view.findViewById(R.id.pic_post_button);
        videoPostButton = (ImageButton) view.findViewById(R.id.video_post_button);
        audoiPostButton = (ImageButton) view.findViewById(R.id.audoi_post_button);
        articlePostButton = (ImageButton) view.findViewById(R.id.article_post_button);


        picPostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.switchToPicPost();
            }
        });

        videoPostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.switchToVideoPost();
            }
        });


        audoiPostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.switchToAudioPost();
            }
        });


        articlePostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.switchToArticlePost();
            }
        });


        return view;
    }









}
