package net.wedocode.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class UnitFactory {

    private final Map<String, Unit> _units = new HashMap<>();

    public Unit GetUnit(String type){

        if (_units.containsKey(type)){
            return _units.get(type);
        }
        else{
           Unit unit;

           switch (type){
               case "Infantry":
                   unit = new Soldier("Standard Infantry", 5, 4, 180, 5, 100, 5);
                   break;

               case "Marine":
                   unit = new Soldier("Marine", 25, 4, 180, 3, 200, 10);
                   break;

               case "Tank":
                   unit = new Tank("Tank", 1000, 25, 5, 3, 200, 10);
                   break;

               default:
                   throw new IllegalStateException("given " + type + "is unknown");
           }

           _units.put(type, unit);
           return unit;
        }
    }

}
