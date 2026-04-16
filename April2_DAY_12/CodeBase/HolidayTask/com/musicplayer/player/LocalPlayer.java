package com.musicplayer.player;

import com.musicplayer.model.Song;

public class LocalPlayer extends AudioPlayer {
    public void play(Song song) {
        System.out.println("Playing local: " + song.getTitle());
    }

    public void pause() {
        System.out.println("Paused local");
    }

    public void stop() {
        System.out.println("Stopped local");
    }
}
