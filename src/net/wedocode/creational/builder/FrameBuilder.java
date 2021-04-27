package net.wedocode.creational.builder;

public abstract class FrameBuilder {

    public abstract void configureSizing();
    public abstract void configureCaption();
    public abstract void configureLocks();
    public abstract Frame getFrame();
}
