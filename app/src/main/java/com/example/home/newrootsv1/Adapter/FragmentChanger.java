package com.example.home.newrootsv1.Adapter;


public interface FragmentChanger {


    //for sales section
    void switchToEquipSales();


    //for article section
    void switchToPicPost();
    void switchToVideoPost();
    void switchToArticlePost();
    void switchToAudioPost();


    //picPostFunctions
    void capturePic();
    void choosePic();

    //audioPostFunctions
    void captureAudio();
    void chooseAudio();

    //videoPostFunctions
    void captureVideo();
    void chooseVideo();





}
