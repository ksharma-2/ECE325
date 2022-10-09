package ece325_assignment2;

public class Song {
    private String songName;

    public Song(String songName) {
        this.songName = songName;
    }

    public String getTitle() {
        return songName;
    }

    public void setTitle(String songName){
        this.songName = songName;
    }
}