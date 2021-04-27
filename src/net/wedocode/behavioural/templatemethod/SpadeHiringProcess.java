package net.wedocode.behavioural.templatemethod;

public class SpadeHiringProcess extends ToolHiringProcess{
    @Override
    public Boolean testEquipment() {
        return false; // does not to be tested
    }

    @Override
    public Boolean validateId() {
        return true;
    }

    @Override
    public Integer numberOfPreviousHires() {
        return -1; // does not matter spade is not serviced
    }
}
