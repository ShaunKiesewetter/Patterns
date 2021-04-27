package net.wedocode.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class ConcreteAggregate implements Iterator<Object> {

    private ArrayList items = new ArrayList();

    private Integer position = 0;

    public Integer count(){
        return items.size();
    }

    public void add(Object object)
    {
        items.add(object);
    }

    public Object get(Integer index){
        return items.get(index);
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Object next() {
        if (this.hasNext())
            return items.get(position++);
        else
            return null;
    }

}
