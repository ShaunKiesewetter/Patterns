package net.wedocode.creational.builder;

public class EditableRectangleFrameBuilder extends FrameBuilder{

    private Frame frame = new Frame();

    @Override
    public void configureSizing() {
        frame.setHeight(400);
        frame.setWidth(800);
    }

    @Override
    public void configureCaption() {
        frame.setCaption("Editable rectangle frame");
    }

    @Override
    public void configureLocks() {
        frame.setLocked(false);
    }

    @Override
    public Frame getFrame() {
        return frame;
    }
}
