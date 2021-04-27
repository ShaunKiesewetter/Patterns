package net.wedocode.behavioural.templatemethod;

public abstract class ToolHiringProcess {

    public abstract Boolean testEquipment();
    public abstract Boolean validateId();
    public abstract Integer numberOfPreviousHires();

    public Boolean CheckOut(){
        if (testEquipment() && validateId()){
            if (numberOfPreviousHires() > 10){
                System.out.println("Tool needs servicing when returned");
            }
            return  true;

        }
        return false;
    }
}
