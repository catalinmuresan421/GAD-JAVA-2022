package com.company.designPatternFinalProject.adapter;

public interface AdvancedMediaPlayerInterface {
    void loadFileName(String fileName);

    void listen();
}

class VlcPlayer implements AdvancedMediaPlayerInterface {
    String myFile;

    @Override
    public void loadFileName(String fileName) {
        myFile = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc file. Name: " + myFile);
    }
}

class Mp4Player implements AdvancedMediaPlayerInterface {
    String myFile;

    @Override
    public void loadFileName(String fileName) {
        myFile = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing mp4 file. Name: " + myFile);
    }
}
