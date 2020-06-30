package com.devcon.sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DemoVar {
    public static void main(String[] args) {
        DemoVar dm = new DemoVar();

        var everyone = dm.getEveryone();

        System.out.println(everyone);

        //

        var exampleMap = new HashMap<Integer, String>();
        exampleMap.put(1, "DEVCON2020");

        Iterator<Integer> keyIterator = exampleMap.keySet().iterator();

        while (keyIterator.hasNext()) {
            Integer key = keyIterator.next();
            System.out.println(key);
        }
    }


















    public List<String> getEveryone(){
        return List.of();
    }
}
