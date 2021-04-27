package net.wedocode.creational.builder;

// Different levels of orchestration can take place here.
public class FrameDirector {


    public void MakeFrame(FrameBuilder frameBuilder){
        frameBuilder.configureCaption();
        frameBuilder.configureSizing();
        frameBuilder.configureLocks();
    }

    public void MakeSimpleFrame(FrameBuilder frameBuilder){
        frameBuilder.configureCaption();
    }

}
