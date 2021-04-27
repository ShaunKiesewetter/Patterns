package net.wedocode.behavioural.state;

public class MP3PlayingState extends AudioPlayerState{
    public MP3PlayingState()
    {
        System.out.println("MP3 PLAYING");
    }

    @Override
    public void pressPlay(AudioPlayer player)
    {
        player.setCurrentState(new MP3PausedState());
    }

    @Override
    public void pressAudioSource(AudioPlayer player)
    {
        player.setCurrentState( new RadioState());
    }
}
