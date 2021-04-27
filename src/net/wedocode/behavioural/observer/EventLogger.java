package net.wedocode.behavioural.observer;

public class EventLogger extends EventMonitor{

    private EventReceiver _receiver;

    public EventLogger(EventReceiver receiver)
    {
        _receiver = receiver;
    }


    @Override
    public void update() {
        String message = _receiver.getLastMessage();
        System.out.println(String.format("Logging: %s", message));
    }
}
