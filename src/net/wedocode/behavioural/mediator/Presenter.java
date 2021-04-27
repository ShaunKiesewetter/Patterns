package net.wedocode.behavioural.mediator;

public class Presenter extends PresentationMember{

    public Presenter(Mediator mediator) {
        super(mediator);
    }

    public void sendNewImageUrl(String url)
    {
        System.out.println(String.format("Presenter changed image URL to '%s'.", url));
        Mediator.updateImage(url);
    }

    public void receiveQuestion(String question, Attendee attendee)
    {
        System.out.println(String.format("Presenter received question from %s.\n'%s'", attendee.Name, question));
    }

    public void answerQuestion(String answer, Attendee attendee)
    {
        System.out.println(String.format("Presenter answered question for %s.\n'%s'"
                , attendee.Name, answer));
        Mediator.sendAnswer(answer, attendee);
    }
}
