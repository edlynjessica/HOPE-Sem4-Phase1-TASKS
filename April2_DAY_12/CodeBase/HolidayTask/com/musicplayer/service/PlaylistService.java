package com.musicplayer.service;

import com.musicplayer.model.*;
import com.musicplayer.util.ShuffleUtil;

public class PlaylistService {
    
    // Method to add a song to a playlist
    public void addSong(Playlist p, Song s) {
        p.addSong(s);
    }
    // Method to shuffle the playlist
    public void shuffle(Playlist p) {
        ShuffleUtil.shuffle(p.getSongs());
    }
    // Method to display the songs in the playlist
    public void display(Playlist p) {
        for(Song s : p.getSongs()) {
            System.out.println(s.getTitle());
        }
    }
}
