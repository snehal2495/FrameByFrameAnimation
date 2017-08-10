package com.example.admin.framebyframeanimation;

import android.content.DialogInterface;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    ImageView imageView;
    Button button_start,button_stop;
    AnimationDrawable waveAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=(ImageView)findViewById(R.id.imagewave);

        button_start=(Button)findViewById(R.id.start);
        button_stop=(Button)findViewById(R.id.stop);

        button_start.setEnabled(true);
        button_stop.setEnabled(false);

        button_start.setOnClickListener(this);
        button_stop.setOnClickListener(this);

        imageView.setBackgroundResource(R.drawable.wave);
        waveAnimation=(AnimationDrawable)imageView.getBackground();
    }


    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch(id){
            case R.id.start:
                waveAnimation.start();
                button_start.setEnabled(false);
                button_stop.setEnabled(true);
                break;

            case R.id.stop:
                waveAnimation.stop();
                button_start.setEnabled(true);
                button_stop.setEnabled(false);
                break;
            default:
                break;
        }





    }
}
