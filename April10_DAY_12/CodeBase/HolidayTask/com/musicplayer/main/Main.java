package com.musicplayer.main;

import com.musicplayer.model.*;
import com.musicplayer.player.*;
import com.musicplayer.service.*;

public class Main {
    public static void main(String[] args) {

        Song s1=new Song("DayLight", "Taylor Swift", 3.5);
        Song s2=new Song("I love you, I'm sorry", "Gracie Abrams", 4.0);
        Song s3=new Song("Attention", "Charlie Puth", 3.0);
        Song s4=new Song("Blue", "Yung Kai", 3.5);

        Playlist playlist=new Playlist("Favorites");

        PlaylistService ps=new PlaylistService();
        ps.addSong(playlist, s1);
        ps.addSong(playlist, s2);
        ps.addSong(playlist, s3);
        ps.addSong(playlist, s4);
        System.out.println("Playlist: " + playlist.getName());
        System.out.println("Songs:");
        System.out.println(s1.getTitle() + " by " + s1.getArtist());
        System.out.println(s2.getTitle() + " by " + s2.getArtist());
        System.out.println(s3.getTitle() + " by " + s3.getArtist());
        System.out.println(s4.getTitle() + " by " + s4.getArtist());
        System.out.println();

        System.out.println("Before Shuffle:");
        ps.display(playlist);

        ps.shuffle(playlist); //shuffle the playlist

        System.out.println("\nAfter Shuffle:");
        ps.display(playlist);
        System.out.println();

        // Polymorphism
        PlayerService player = new PlayerService(new LocalPlayer()); //local player
        player.playSong(s1);
        player = new PlayerService(new OnlinePlayer()); //online player
        player.playSong(s2);
    }
}
