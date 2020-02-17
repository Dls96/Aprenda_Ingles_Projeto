package com.example.learnenglish.Fragments;


import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.learnenglish.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumbersFragment extends Fragment implements View.OnClickListener {

    private MediaPlayer mediaPlayer;

    public NumbersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_numbers, container, false);

        ImageView one = view.findViewById(R.id.imageOne);
        ImageView two = view.findViewById(R.id.imageTwo);
        ImageView three = view.findViewById(R.id.imageThree);
        ImageView four = view.findViewById(R.id.imageFour);
        ImageView five = view.findViewById(R.id.imageFive);
        ImageView six = view.findViewById(R.id.imageSix);
        ImageView seven = view.findViewById(R.id.imageSeven);
        ImageView eight = view.findViewById(R.id.imageEight);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageOne:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.one);
                play();
                Toast.makeText(getContext(),"Diga: Uam", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageTwo:
                mediaPlayer = MediaPlayer.create(getContext(),R.raw.two);
                play();
                Toast.makeText(getContext(), "Diga: Tchu", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageThree:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.three);
                play();
                Toast.makeText(getContext(), "Diga: Tur-wii", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageFour:
                mediaPlayer = MediaPlayer.create(getContext(),R.raw.four );
                play();
                Toast.makeText(getContext(), "Diga: Fôr", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageFive:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.five);
                play();
                Toast.makeText(getContext(), "Diga: Fáiv", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageSix:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.six);
                play();
                Toast.makeText(getContext(), "Diga: Siquis", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageSeven:
                mediaPlayer = MediaPlayer.create(getContext(),R.raw.seven);
                play();
                Toast.makeText(getContext(), "Diga: Sévan", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageEight:
                mediaPlayer = MediaPlayer.create(getContext(),R.raw.eight);
                play();
                Toast.makeText(getContext(), "Diga: Eite", Toast.LENGTH_LONG).show();
                break;
        }
    }

    private void play(){
        if (mediaPlayer != null){
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release();
                }
            });
        }
    }
}
