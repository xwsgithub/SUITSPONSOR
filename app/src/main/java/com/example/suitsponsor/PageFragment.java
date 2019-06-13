package com.example.suitsponsor;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.suitsponsor.Adapter.MainAdAdapter;

import java.util.ArrayList;
import java.util.List;

public class PageFragment extends Fragment {


    public static final String PAGE_ID = "PageID";
    public static final String MAIN_PAGE = "MainPage";
    public static final String DESIGN = "Design";
    public static final String PERSON = "Person";
    private String myID;
    private View view;
    private int[] textViews_id={
            R.drawable.ad1,
            R.drawable.ad2,
            R.drawable.ad3

    };

    public static PageFragment newInstance(String StringID) {
        PageFragment fragment = new PageFragment();
        Bundle bundle = new Bundle();
        bundle.putString(PAGE_ID, StringID);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments()!=null){
            myID = getArguments().getString(PAGE_ID);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        switch (myID){

            case MAIN_PAGE:

                view=inflater.inflate(R.layout.fragment_main_page,null);


                return view;



            case DESIGN:

                view=inflater.inflate(R.layout.fragment_design_page,null);

                view.findViewById(R.id.Design_AI).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(),ai_styles_choose_Activity.class));
                    }
                });

                view.findViewById(R.id.Design_Diy).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(),ai_styles_recommend_double_no.class));
                    }
                });



                return view;





            case PERSON:
                view = inflater.inflate(R.layout.fragment_person_page,null);
                return view;






        }




        return super.onCreateView(inflater, container, savedInstanceState);


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        switch (myID){

            case MAIN_PAGE:
                List<TextView> textViews=new ArrayList<>();
                for (int i = 0; i <textViews_id.length; i++) {
                    TextView ad=new TextView(getActivity());
                    ad.setBackgroundResource(textViews_id[i]);
                    textViews.add(ad);
                }

                ViewPager mviewPager=view.findViewById(R.id.main_viewpager_ad);
                MainAdAdapter mainAdAdapter=new MainAdAdapter(getActivity(),textViews);
                mviewPager.setAdapter(mainAdAdapter);

                View ai_choose=view.findViewById(R.id.main_ai_choose);
                ai_choose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(),ai_styles_choose_Activity.class));
                    }
                });

                view.findViewById(R.id.main_diy_choose).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(),ai_styles_recommend_double_no.class));
                    }
                });

                view.findViewById(R.id.main_facetoface_choose).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(),order_liangti.class));
                    }
                });




            case DESIGN:

//                view.findViewById(R.id.Design_AI).setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        startActivity(new Intent(getActivity(),ai_styles_choose_Activity.class));
//                    }
//                });
//
//                view.findViewById(R.id.Design_Diy).setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        startActivity(new Intent(getActivity(),ai_styles_recommend_double_no.class));
//                    }
//                });





            case PERSON:








        }




        super.onActivityCreated(savedInstanceState);
    }
}
