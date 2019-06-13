package com.example.suitsponsor;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity implements TabHost.TabContentFactory{

    public static final String MAIN_PAGE = "MainPage";
    public static final String PERSON_PAGE = "Person";
    public static final String DESIGN = "Design";
    private ViewPager viewPager;
    private TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().hide();   //隐藏标题栏

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_viewpager);


        tabHost = findViewById(R.id.tabhost);
        tabHost.setup();

        final int[] tabIDs={

                R.string.main,
                R.string.design,
                R.string.person
        };

        int [] drawables={
                R.drawable.tab_main_choose,
                R.drawable.tab_design_choose,
                R.drawable.tab_person_choose
        };

        for (int index = 0; index < drawables.length; index++) {
            View view= getLayoutInflater().inflate(R.layout.tab_layout,null);
            ImageView imageView=view.findViewById(R.id.tab_icon);
            View tab=view.findViewById(R.id.tab_background);

            imageView.setImageResource(drawables[index]);
            tab.setBackgroundColor(getResources().getColor(R.color.white));

            tabHost.addTab(
                    tabHost.newTabSpec(getString(tabIDs[index]))
                    .setIndicator(view)
                    .setContent(this)

            );

        }





        //Fragement初始化
        final Fragment[] fragments=new Fragment[]{
                PageFragment.newInstance(MAIN_PAGE),
                PageFragment.newInstance(DESIGN),
                PageFragment.newInstance(PERSON_PAGE)
        };



        viewPager = findViewById(R.id.viewpager);

        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return fragments[i];
            }

            @Override
            public int getCount() {
                return fragments.length;
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                if(tabHost!=null){
                    tabHost.setCurrentTab(i);
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });


        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                int position=tabHost.getCurrentTab();
                viewPager.setCurrentItem(position);
            }
        });



    }

    @Override
    public View createTabContent(String tag) {
        View view =new View(this);

        return view;
    }
}
