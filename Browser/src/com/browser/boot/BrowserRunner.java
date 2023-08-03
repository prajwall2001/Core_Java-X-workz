package com.browser.boot;

import com.browser.app.Browser;
import com.browser.app.Chrome;
import com.browser.app.Edge;
import com.browser.app.Opera;
import com.browser.app.Firefox;
import com.browser.util.UtilRunner;

public class BrowserRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main in BrowserRunner\n");

        Browser browser = new Browser();  

        Chrome chrome = new Chrome();

        Edge edge = new Edge();

        Opera opera = new Opera();

        Firefox firefox = new Firefox();

        UtilRunner.run(browser);
        System.out.println();

        UtilRunner.run(chrome);
        System.out.println();

        UtilRunner.run(edge);
        System.out.println();

        UtilRunner.run(opera);
        System.out.println();

        UtilRunner.run(firefox);
    }
}
