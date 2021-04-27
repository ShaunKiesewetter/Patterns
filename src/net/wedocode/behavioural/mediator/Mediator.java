package net.wedocode.behavioural.mediator;

import java.util.ArrayList;

public class Mediator {

    public Presenter Presenter;
    public ArrayList<Attendee> Attendees;


    public void updateImage(String url) {
        for (Attendee attendee : Attendees)
        {
            attendee.receiveImage(url);
        }
    }

    public void sendAnswer(String answer, Attendee attendee) {
        attendee.receiveAnswer(answer);
    }

    public void sendQuestion(String question, Attendee attendee) {
        Presenter.receiveQuestion(question, attendee);
    }
}
