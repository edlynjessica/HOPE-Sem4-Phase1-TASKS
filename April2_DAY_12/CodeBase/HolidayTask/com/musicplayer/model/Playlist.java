package com.musicplayer.model;

import java.util.*;

public class Playlist {
    private String name;
    private List<Song> songs = new ArrayList<>();

    // Constructor to initialize the playlist with a name
    public Playlist(String name) {
        this.name = name;
    }
    
    // Method to add a song to the playlist
    public void addSong(Song song) {
        songs.add(song);
    }

    // Getter methods for songs and name
    public List<Song> getSongs() {
        return songs;
    }
    public String getName() {
        return name;
    }
}
