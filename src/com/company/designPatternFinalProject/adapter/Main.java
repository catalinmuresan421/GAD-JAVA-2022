package com.company.designPatternFinalProject.adapter;

public class Main {
    public static void main(String[] args) {
        MediaPlayerInterface audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "Carefree.mp3");

        AdvancedMediaPlayerInterface mp4Player = new Mp4Player();
        MediaPlayerInterface advancedMediaPlayerAdapter1 = new AdvancedMediaPlayerAdapter(mp4Player);
        advancedMediaPlayerAdapter1.play("mp4", "Courses,mp4");

        AdvancedMediaPlayerInterface vlcPlayer = new VlcPlayer();
        MediaPlayerInterface advancedMediaPlayerAdapter2 = new AdvancedMediaPlayerAdapter(vlcPlayer);
        advancedMediaPlayerAdapter2.play("vlc", "home alone.vlc");

        audioPlayer.play("vlc", "testing.vlc");
    }
}
