package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.utils.AudioPlayer;
import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayerAdapter;

public class Client {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AdvancedAudioPlayerAdapter();
        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("vlc", "movie.vlc");
        audioPlayer.play("avi", "file.avi");

    }

}