package debasishbarmandevoleper.com.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    Button next,play,prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prev=findViewById(R.id.button);
        play=findViewById(R.id.button2);
        next=findViewById(R.id.button3);
        mediaPlayer=new MediaPlayer();
        mediaPlayer=MediaPlayer.create(this,R.raw.beng);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()){
                    //stop playing
                    pause();

                }
                else{
                    play();
                }
            }
        });

    }
    public void play(){
        if(mediaPlayer!=null){
            mediaPlayer.start();
            //mediaPlayer.nex
            play.setText("pause");
        }
    }
    public void next(){

    }
    public void prev(){

    }
    public void pause(){
       if(mediaPlayer!=null){
           mediaPlayer.pause();
           play.setText("play");
       }
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mediaPlayer!=null){
            mediaPlayer.pause();
            mediaPlayer.release();
        }
    }
}