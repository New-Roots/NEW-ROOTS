package com.example.home.newrootsv1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.home.newrootsv1.Adapter.FragmentChanger;

/**
 * Created by home on 30/9/16.
 */
public class SingleProductView extends Fragment {

    View view;
    FragmentChanger fragmentChanger;
    Button orderOnline;
    Button orderByPhone;


    public static SingleProductView newInstance(){

        return new SingleProductView();

    }

    public SingleProductView(){

    }

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
        view = inflater.inflate(R.layout.single_product_details_view,container,false);


        orderByPhone= (Button) view.findViewById(R.id.order_by_phone);
        orderOnline = (Button) view.findViewById(R.id.order_online_button);

        orderOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.changeToOrderOnline();
            }
        });

        orderByPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.changeToOrderByPhone();
            }
        });



        return view;
    }
}
