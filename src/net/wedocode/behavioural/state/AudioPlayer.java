package net.wedocode.behavioural.state;

public class AudioPlayer {
    private AudioPlayerState _state;

    public AudioPlayer(AudioPlayerState state)
    {
        _state = state;
    }

    public void pressPlay()
    {
        _state.pressPlay(this);
    }

    public void pressAudioSource()
    {
        _state.pressAudioSource(this);
    }


    public AudioPlayerState getCurrentState() {
        return _state;
    }

    public void setCurrentState(AudioPlayerState currentState) {
        _state = currentState;
    }


}
