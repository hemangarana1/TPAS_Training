package a_oops;

// Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.

import java.util.ArrayList;
import java.util.Random;

class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return title + " by " + artist;
    }
}

public class MusicLibrary {
    private ArrayList<Song> songs;
    private Random random;

    public MusicLibrary() {
        songs = new ArrayList<>();
        random = new Random();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public void playRandomSong() {
        if (songs.size() > 0) {
            int index = random.nextInt(songs.size());
            Song song = songs.get(index);
            System.out.println("Playing: " + song);
        } else {
            System.out.println("No songs in the library.");
        }
    }

    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();
        library.addSong(new Song("Song1", "Artist1"));
        library.addSong(new Song("Song2", "Artist2"));
        library.addSong(new Song("Song3", "Artist3"));
        library.addSong(new Song("Song4", "Artist4"));


        library.playRandomSong();

        library.removeSong(new Song("Song2", "Artist2"));

        library.playRandomSong();

    }
}
