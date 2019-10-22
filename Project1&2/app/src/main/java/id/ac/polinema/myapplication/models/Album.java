package id.ac.polinema.myapplication.models;

public class Album {
    public String albumName;
    public int image;

public Album(String albumName, int image) {

    this.albumName = albumName;
    this.image = image;
    }

    public String getAlbumName() {

    return albumName;
    }

    public  int getImage(){
    return image;
    }
    public void setImage(int image){
    this.image = image;
    }


}
