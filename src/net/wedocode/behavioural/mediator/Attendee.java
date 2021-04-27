package net.wedocode.behavioural.mediator;

public class Attendee extends PresentationMember{
    public Attendee(Mediator mediator) {
        super(mediator);
    }

    public void askQuestion(String question)
    {
        System.out.println(String.format("%s asked question.\n'%s'", Name, question));
        Mediator.sendQuestion(question, this);
    }

    public void receiveImage(String url)
    {
        System.out.println(String.format("Image for %s updated to '%s'.", Name, url));

    }

}
