package com.mouse.app;

public class Mouse {
    public void click() {
        System.out.println("Invoking click in Mouse");
        click("Left");
        click(2);
    }

    public void click(String button) {
        System.out.println("Invoking String in click");
        System.out.println("Mouse button clicked: " + button);
    }

    public void click(int times) {
        System.out.println("Invoking int in click");
        System.out.println("Mouse clicked " + times + " times");
    }

    public void click(String button, int times) {
        System.out.println("Invoking String,int in click");
        click(button);
        click(times);
    }
}
