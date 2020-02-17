package com.example.learnenglish.Fragments;


import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.learnenglish.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AnimalsFragment extends Fragment implements View.OnClickListener{
    private MediaPlayer mediaPlayer;

    public AnimalsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_animals, container, false);

        ImageView dog = view.findViewById(R.id.imageDog);
        ImageView cat = view.findViewById(R.id.imageCat);
        ImageView cow = view.findViewById(R.id.imageCow);
        ImageView elephant = view.findViewById(R.id.imageElephant);
        ImageView horse = view.findViewById(R.id.imageHorse);
        ImageView lion = view.findViewById(R.id.imageLion);
        ImageView sheep = view.findViewById(R.id.imageSheep);
        ImageView tiger = view.findViewById(R.id.imageTiger);

        dog.setOnClickListener(this);
        cat.setOnClickListener(this);
        cow.setOnClickListener(this);
        elephant.setOnClickListener(this);
        horse.setOnClickListener(this);
        lion.setOnClickListener(this);
        sheep.setOnClickListener(this);
        tiger.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageDog:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.dog);
                play();
                Toast.makeText(getContext(), "Diga: Dôg", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageCat:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cat);
                play();
                Toast.makeText(getContext(), "Diga: Kat", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageCow:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cow);
                play();
                Toast.makeText(getContext(), "Diga: Kál", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageElephant:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.elephant);
                play();
                Toast.makeText(getContext(), "Diga: Elafant", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageHorse:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.horse);
                play();
                Toast.makeText(getContext(), "Diga: Rôrs", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageSheep:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.sheep);
                play();
                Toast.makeText(getContext(), "Diga: Chip", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageLion:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.lion);
                play();
                Toast.makeText(getContext(), "Diga: Laian", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageTiger:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.tiger);
                play();
                Toast.makeText(getContext(), "Diga: Táiguer", Toast.LENGTH_LONG).show();
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

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}


