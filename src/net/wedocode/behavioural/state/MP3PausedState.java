package net.wedocode.behavioural.state;

public class MP3PausedState extends AudioPlayerState{
    public MP3PausedState()
    {
        System.out.println("MP3 PAUSED");
    }

    @Override
    public void pressPlay(AudioPlayer player)
    {
        player.setCurrentState(new MP3PlayingState());
    }

    @Override
    public  void pressAudioSource(AudioPlayer player)
    {
        player.setCurrentState(new RadioState());
    }
}
