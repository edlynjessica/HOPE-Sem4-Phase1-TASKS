package com.musicplayer.service;

import com.musicplayer.model.Song;
import com.musicplayer.player.AudioPlayer;

public class PlayerService {
    private AudioPlayer player;

    public PlayerService(AudioPlayer player) {
        this.player = player;
    }

    public void playSong(Song song) {
        if(song == null) {
            System.out.println("No song selected");
            return;
        }
        player.play(song);
    }

    public void pause() {
        player.pause();
    }

    public void stop() {
        player.stop();
    }
}
