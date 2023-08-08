package com.gate.app;
public class IronGate extends Gate {
    @Override
    public void open() {
        System.out.println("Iron gate is opening!");
        super.open();
}
}