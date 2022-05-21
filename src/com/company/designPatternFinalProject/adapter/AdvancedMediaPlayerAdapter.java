package com.company.designPatternFinalProject.adapter;

public class AdvancedMediaPlayerAdapter implements MediaPlayerInterface {
    AdvancedMediaPlayerInterface advancedMusicPlayer;
    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayerInterface myMediaPlayer) {
        this.advancedMusicPlayer = myMediaPlayer;
    }

    @Override
    public void play(String audioType, String filename) {
        advancedMusicPlayer.loadFileName(filename);
        advancedMusicPlayer.listen();
    }
}
