package net.wedocode.behavioural.state;

public class StandbyState extends AudioPlayerState
{
    public StandbyState()
    {
        System.out.println("STANDBY");
    }

    @Override
    public void pressPlay(AudioPlayer player) {
        System.out.println("Play pressed: No effect");
    }

    @Override
    public void pressAudioSource(AudioPlayer player) {
        player.setCurrentState(new MP3PlayingState());
    }
}