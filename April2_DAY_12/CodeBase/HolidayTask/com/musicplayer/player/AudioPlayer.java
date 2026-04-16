package com.musicplayer.player;

import com.musicplayer.model.Song;

public abstract class AudioPlayer {
    public abstract void play(Song song);
    public abstract void pause();
    public abstract void stop();
}
