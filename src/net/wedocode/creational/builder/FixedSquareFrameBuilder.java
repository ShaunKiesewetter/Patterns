package net.wedocode.creational.builder;

public class FixedSquareFrameBuilder extends FrameBuilder{

    private final Frame frame = new Frame();

    @Override
    public void configureSizing() {
        frame.setHeight(300);
        frame.setWidth(300);
    }

    @Override
    public void configureCaption() {
        frame.setCaption("Fixed square frame");
    }

    @Override
    public void configureLocks() {
        frame.setLocked(true);
    }


    @Override
    public Frame getFrame() {
        return frame;
    }
}
