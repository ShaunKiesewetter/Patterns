package net.wedocode.behavioural.observer;

public class EventEmailer extends EventMonitor{

    private EventReceiver _receiver;

    public EventEmailer(EventReceiver receiver)
    {
        _receiver = receiver;
    }

    @Override
    public void update() {
        String message = _receiver.getLastMessage();
        System.out.println(String.format("Emailing: %s", message));
    }
}
