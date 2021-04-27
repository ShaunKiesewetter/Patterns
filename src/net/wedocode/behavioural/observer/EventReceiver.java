package net.wedocode.behavioural.observer;

public class EventReceiver extends EventReceiverBase{
    private String _lastMessage;

    public String getLastMessage()
    {
        return _lastMessage;
    }

    public void logMessage(String message)
    {
        _lastMessage = message;
        notifyMonitors();
    }
}
