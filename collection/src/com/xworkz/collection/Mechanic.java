package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Mechanic {
	public static void main(String[] args) {
        Collection<String> tools = new ArrayList<>();
        tools.add("Plier");
        tools.add("Spanner");
        tools.add("Hammer");
        tools.add("Saw");
        tools.add("Screw driver");
        tools.add("Jack");
        tools.add("Cutter");
        System.out.println("Total: " + tools.size());

        Collection<String> tools1 = new ArrayList<>();
        tools1.add("Flash light");
		tools1.add("Wrench");
        
		
		
        Iterator<String> itr = tools.iterator();
        while (itr.hasNext()) {
            String tool = itr.next();
            System.out.println("Name:"+tool);
        }
        
        
        tools.addAll(tools1);
        System.out.println("Added all tools");
        
        Iterator<String> itr1 = tools.iterator();
        while (itr1.hasNext()) {
            String tool = itr1.next();
            System.out.println("Name:"+tool);
        }
        tools.removeAll(tools1);
        System.out.println("Removed all tools");
        
  		}
	
	}

