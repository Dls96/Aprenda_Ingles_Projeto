package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.learnenglish.Fragments.AnimalsFragment;
import com.example.learnenglish.Fragments.NumbersFragment;
import com.example.learnenglish.Fragments.AlphabetFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Removendo a action bar e a elevação.
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
            getSupportActionBar().setElevation(0);
        }


        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("Animais", AnimalsFragment.class)
                .add("Numeros", NumbersFragment.class)
                .add("Alfabeto", AlphabetFragment.class).create()
        );

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter( adapter );

        SmartTabLayout smartTabLayout = (SmartTabLayout) findViewById(R.id.viewpagertab);
        smartTabLayout.setViewPager(viewPager);

    }
}
