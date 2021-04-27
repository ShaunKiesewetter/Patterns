package net.wedocode.structural.composite;
import java.util.ArrayList;
import java.util.Iterator;

public class Employee implements Worker, Iterable<Worker> {

    private final ArrayList<Worker> subordinates = new ArrayList<Worker>();
    private String Name = "";

    public void addSubOrdinate(Worker subordinate){
        subordinates.add(subordinate);
    }

    public Integer getCount(){
        return subordinates.toArray().length;
    }

    public void removeSubOrdinate(Worker subordinate){
        subordinates.remove(subordinate);
    }

    public Worker getSubOrdinate(int index){
        return subordinates.get(index);
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public void setName(String name) {
        this.Name = name;
    }


    @Override
    public Iterator<Worker> iterator() {
        return subordinates.iterator();
    }




}
