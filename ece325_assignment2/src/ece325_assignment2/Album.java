package ece325_assignment2;

public class Album extends SongCollection {
    private SongCollection album;
    private String albumName;

    public Album(){
        album = new SongCollection();
        albumName = "";
    }

    public Album(String albumName){
        album = new SongCollection();
        this.albumName = albumName;
    }

    @Override
    public void addSongToCollection(Song s){
        if(!this.contains(s)){
            this.album.addSongToCollection(s);
        }
    }
    
    @Override
    public int getNumberOfSongs(){
        return album.getNumberOfSongs();
    }

    public void setAlbumName(String albumName){
        this.albumName = albumName;
    }

    public String getAlbumName (){
        return this.albumName;
    }

}