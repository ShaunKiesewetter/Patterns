package net.wedocode.creational.builder;

// An example screen object that is used from an integrated development environment when the user creates a new screen
// they get to choose the initial defaults. The builder will make sure this is all set up correctly.
public class Frame {

    private Integer Width;
    private Integer Height;
    private String Caption;
    private Boolean Locked;

    public Integer getWidth() {
        return Width;
    }

    public void setWidth(Integer width) {
        Width = width;
    }

    public Integer getHeight() {
        return Height;
    }

    public void setHeight(Integer height) {
        Height = height;
    }

    public String getCaption() {
        return Caption;
    }

    public void setCaption(String caption) {
        Caption = caption;
    }


    public Boolean getLocked() {
        return Locked;
    }

    public void setLocked(Boolean locked) {
        Locked = locked;
    }

    @Override
    public String toString() {
        return "Frame{" +
                "Width=" + Width +
                ", Height=" + Height +
                ", Caption='" + Caption + '\'' +
                ", Locked=" + Locked +
                '}';
    }
}
