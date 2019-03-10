package com.example.novel;

public class ModelNovel {
    String name;
    int gambar;
    String overview;

    public ModelNovel(String name,  int gambar, String overview){
        this.name = name;
        this.gambar = gambar;
        this.overview = overview;

    }

    public int getGambar() {
        return gambar;
    }

    public String getName() {
        return name;
    }
    public String getOverview(){
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}
