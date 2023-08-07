package com.mouse.boot;

import com.mouse.app.Mouse;

public class MouseRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main in MouseRunner");
        Mouse mouse = new Mouse();
        mouse.click();
        mouse.click("Right", 3);
    }
}
