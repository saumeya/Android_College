package com.saumeya.audio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;



public class MainActivity extends AppCompatActivity {


    VideoView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v = (VideoView) findViewById(R.id.videoView);
        String path = "android.resource://com.saumeya.audio/"+R.raw.video_s;
        Uri uri = Uri.parse(path);
        v.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(v);
        v.setMediaController(mediaController);
        v.start();
        /*button = (Button)findViewById(R.id.button);
         button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view) {
                Video(v);
            }
        });*/

    }
    /*public void Video(View view){

        String path = "android.resource://com.saumeya.audio/"+R.raw.video_s;
        Uri uri = Uri.parse(path);
        v.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(v);
        v.setMediaController(mediaController);
        //v.requestFocus();
        v.start();
        //v.seekTo(100);

    }*/
}
