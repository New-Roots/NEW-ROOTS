package com.example.home.newrootsv1;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.home.newrootsv1.Adapter.FragmentChanger;


public class LandActivity extends AppCompatActivity implements FragmentChanger{


    public static final int CAPTURE_IMAGE = 1;
    public static final int PICK_IMAGE = 2;
    public static final int CAPTURE_AUDIO = 3;
    public static final int PICK_AUDIO = 4;
    public static final int CAPTURE_VIDEO = 5;
    public static final int PICK_VIDEO = 6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land);

        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.root_layout, TabbedFragManager.newInstance(), "Tabbed Frag").
                    addToBackStack(null).
                    commit();
        }
    }


    @Override
    public void switchToEquipSales() {


    }

    @Override
    public void switchToPicPost() {
        Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show();
        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.root_layout,PicPostFrag.newInstance(),"pic post page").
                addToBackStack(null).
                commit();
    }

    @Override
    public void switchToVideoPost() {
        Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show();
        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.root_layout,VideoPostFrag.newInstance(),"pic post page").
                addToBackStack(null).
                commit();


    }

    @Override
    public void switchToArticlePost() {
        Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show();
        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.root_layout,ArticlePostFrag.newInstance(),"pic post page").
                addToBackStack(null).
                commit();


    }

    @Override
    public void switchToAudioPost() {
        Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show();
        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.root_layout,AudioPostFrag.newInstance(),"pic post page").
                addToBackStack(null).
                commit();


    }




    @Override
    public void capturePic() {
        Toast.makeText(this,"camera button",Toast.LENGTH_SHORT).show();
        Intent camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(camera,CAPTURE_IMAGE);
    }


    @Override
    public void choosePic(){

        Intent choosePicture = new Intent();
        choosePicture.setType("image/*");
        choosePicture.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(choosePicture,"SELECT PICTURE"),PICK_IMAGE);
    }

    @Override
    public void captureAudio() {


    }

    @Override
    public void chooseAudio() {

        Intent chooseAudio = new Intent();
        chooseAudio.setType("audio/*");
        chooseAudio.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(chooseAudio,"SELECT AUDIO"),PICK_AUDIO);

    }

    @Override
    public void captureVideo() {
        Intent camera = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        startActivityForResult(camera,CAPTURE_VIDEO);

    }

    @Override
    public void chooseVideo() {
        Intent chooseVideo = new Intent();
        chooseVideo.setType("video/*");
        chooseVideo.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(chooseVideo,"SELECT VIDEO"),PICK_VIDEO);


    }

    @Override
    public void changeToSingleArticle(int imgID, String artHead, String artContent, String artDate) {
        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.root_layout,SingleTextArticleView.newInstance(imgID,artHead,artContent,artDate),"pic post page").
                addToBackStack(null).
                commit();



    }

    @Override
    public void changeToSingleProduct() {
        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.root_layout,SingleProductView.newInstance(),"single product page").
                addToBackStack(null).
                commit();

    }

    @Override
    public void changeToOrderOnline() {
        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.root_layout,ProductOrderOnline.newInstance(),"online order page").
                addToBackStack(null).
                commit();

    }

    @Override
    public void changeToOrderByPhone() {
        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.root_layout,ProductOrderByPhone.newInstance(),"order by phone page").
                addToBackStack(null).
                commit();

    }

    @Override
    public void changeToTravelFrag() {
        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.root_layout,TravelFrag.newInstance(),"travel frag").
                addToBackStack(null).
                commit();
    }

    @Override
    public void changeToServicesFrag() {

        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.root_layout,ServicesFrag.newInstance(),"services frag").
                addToBackStack(null).
                commit();

    }

    @Override
    public void changeToFullScreenTravel(String villageName, String placeName, String placeDesc, int imgId) {
        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.root_layout,SingleTravelDetailsFrag.newInstance(villageName,placeName,placeDesc,imgId),"pic post page").
                addToBackStack(null).
                commit();

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        switch (requestCode){

            case CAPTURE_IMAGE:
                Toast.makeText(this,"img captured",Toast.LENGTH_SHORT).show();
                break;
            case PICK_IMAGE:
                Toast.makeText(this,"img choosen",Toast.LENGTH_SHORT).show();
                break;
            case CAPTURE_AUDIO:
                Toast.makeText(this,"audio captured",Toast.LENGTH_SHORT).show();
                break;
            case PICK_AUDIO:
                Toast.makeText(this,"audio choosen",Toast.LENGTH_SHORT).show();
                break;

            case CAPTURE_VIDEO:
                Toast.makeText(this,"video captured",Toast.LENGTH_SHORT).show();
                break;
            case PICK_VIDEO:
                Toast.makeText(this,"video choosen",Toast.LENGTH_SHORT).show();
                break;


        }


    }



}
