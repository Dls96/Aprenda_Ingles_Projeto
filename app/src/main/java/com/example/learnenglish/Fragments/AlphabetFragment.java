package com.example.learnenglish.Fragments;


import android.media.Image;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.learnenglish.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlphabetFragment extends Fragment {

    private VideoView videoView;

    public AlphabetFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_alphabet, container, false);
        final ImageView play = view.findViewById(R.id.imagePlay);
        videoView = view.findViewById(R.id.videoView);
        videoView.setMediaController(new MediaController(getContext()));

        play.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                View decorView = getActivity().getWindow().getDecorView();
                int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
                decorView.setSystemUiVisibility( uiOptions );

                play.setImageResource(R.drawable.empty);
                videoView.setVideoPath("android.resource://" + getActivity().getPackageName() + "/" + R.raw.alphabet);
                videoView.start();
            }
        });
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        videoView.pause();
    }
}
