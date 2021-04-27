package net.wedocode.behavioural.observer;

import java.util.ArrayList;

public abstract class EventReceiverBase
{
    private ArrayList<EventMonitor> _monitors = new ArrayList();

    public void Attach(EventMonitor monitor)
    {
        _monitors.add(monitor);
    }

    public void Detach(EventMonitor monitor)
    {
        _monitors.remove(_monitors);
    }

    public void notifyMonitors()
    {
        for (EventMonitor monitor :_monitors)
        {
            monitor.update();
        }
    }
}
