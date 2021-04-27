package net.wedocode.behavioural.state;

public class RadioState extends AudioPlayerState{

    public RadioState()
    {
        System.out.println("RADIO");
    }

    @Override
    public void pressPlay(AudioPlayer player) {
        System.out.println("Play pressed: New station selected");
    }

    @Override
    public void pressAudioSource(AudioPlayer player) {
        player.setCurrentState(new StandbyState());
    }
}
