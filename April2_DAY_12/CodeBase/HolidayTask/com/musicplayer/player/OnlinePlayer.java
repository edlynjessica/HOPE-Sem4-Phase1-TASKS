package com.musicplayer.player;

import com.musicplayer.model.Song;

public class OnlinePlayer extends AudioPlayer {
    public void play(Song song) {
        System.out.println("Streaming: " + song.getTitle());
    }

    public void pause() {
        System.out.println("Paused streaming");
    }

    public void stop() {
        System.out.println("Stopped streaming");
    }
}
