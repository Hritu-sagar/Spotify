package com.example.spotifyclone;

public class ChildModel {
  // private int songId;
    private  int song_image;
    private String songName;

    public ChildModel(int song_image, String songName) {
        this.song_image = song_image;
      this.songName = songName;
        //this.songId=songId;
    }

   // public int getSongId() {
     //   return songId;
    //}

    public int getSong_image() {
        return song_image;
    }

    public String getSongName() {
        return songName;
    }
}
