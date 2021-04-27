package net.wedocode.behavioural.mediator;

public abstract class PresentationMember {

    protected Mediator Mediator;

    public String Name;

    public PresentationMember(Mediator mediator){
        this.Mediator = mediator;
    }

    public void receiveAnswer(String answer){
        System.out.println(String.format("%s received answer. \n %s", Name, answer));
    }
}
