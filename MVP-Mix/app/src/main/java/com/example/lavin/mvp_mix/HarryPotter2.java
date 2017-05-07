package com.example.lavin.mvp_mix;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.io.IOException;

/**
 * Created by lavin on 06/05/2017.
 */

public class HarryPotter2 extends AppCompatActivity {
    private MediaPlayer player;
    private AssetFileDescriptor afd;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harry_potter2);
        try {
            // Read the music file from the asset folder
            afd = getAssets().openFd("BatidaDePortaLeve.mp3");
            // Creation of new media player;
            player = new MediaPlayer();
            // Set the player music source.
            player.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(),afd.getLength());
            // Set the looping and play the music.
            player.setLooping(false);
            player.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void onResume() {
        super.onResume();
        player.start();
    }

   public void callSeconSound(View view) {
       player.stop();

       try {
           // Read the music file from the asset folder
           afd = getAssets().openFd("????????????.mp3"); /* ESCREVER AQUI O NOME DO SEGUNDO ARQUIVO */
           // Creation of new media player;
           player = new MediaPlayer();
           // Set the player music source.
           player.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(),afd.getLength());
           // Set the looping and play the music.
           player.setLooping(false);
           player.prepare();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

}
