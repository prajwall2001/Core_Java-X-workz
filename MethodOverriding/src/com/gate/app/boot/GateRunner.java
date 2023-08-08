package com.gate.app.boot;

import com.gate.app.Gate;
import com.gate.app.IronGate;

public class GateRunner {

    public static void main(String[] args) {
        System.out.println("Invoking main in GateRunner");

        Gate ironGate = new IronGate();
        ironGate.open();
}
}