package org.example.DesignPattern.ProxyPattern;

public class ProxyImage implements Image{

    private RealImage realImage;
    private String Filename;

    public ProxyImage(String filename){
        this.Filename = filename;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(Filename);
        }
        realImage.display();
    }
}
