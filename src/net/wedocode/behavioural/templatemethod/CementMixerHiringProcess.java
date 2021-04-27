package net.wedocode.behavioural.templatemethod;

public class CementMixerHiringProcess extends ToolHiringProcess{
    @Override
    public Boolean testEquipment() {
        return true;
    }

    @Override
    public Boolean validateId() {
        // Some logic for ID validation
        return true;
    }

    @Override
    public Integer numberOfPreviousHires() {
        // Some logic to read into the records
        return 11;
    }
}
