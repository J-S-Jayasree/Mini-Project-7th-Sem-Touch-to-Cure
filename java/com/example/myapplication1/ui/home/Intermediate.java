package com.example.myapplication1.ui.home;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.os.Environment;
import android.view.Menu;
import android.widget.MediaController;
import android.widget.VideoView;
import com.example.myapplication1.R;
public class Intermediate extends Activity {
    VideoView mVideoView;
    MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intermediate);


        mediaController = new MediaController(this);
        mVideoView = findViewById(R.id.videoView1);
        mediaController.setAnchorView(mVideoView);
        Uri localUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video1);

        mVideoView.setVideoURI(localUri);
        mVideoView.setMediaController(mediaController);

        mVideoView.start();

    }


}
