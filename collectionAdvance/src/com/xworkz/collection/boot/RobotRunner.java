package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.collection.dto.RobotDTO;

public class RobotRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main in RobotRunner");

        RobotDTO robot1 = new RobotDTO("RoboGuard", 500, true, "TechBot Inc.");
        RobotDTO robot2 = new RobotDTO("AutoCleaner", 350, true, "RoboMasters");
        RobotDTO robot3 = new RobotDTO("FactoryBot", 800, false, "TechGenius");
        RobotDTO robot4 = new RobotDTO("MiniBot", 200, true, "TinyRobots Ltd.");
        RobotDTO robot5 = new RobotDTO("HeavyDutyBot", 1000, false, "MegaMachines Corp.");

        Collection<RobotDTO> robots = new LinkedList<>();
        robots.add(robot1);
        robots.add(robot2);
        robots.add(robot3);
        robots.add(robot4);
        robots.add(robot5);

        robots.stream().sorted().forEach(p -> System.out.println(p));
    }
}
