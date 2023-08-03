package com.browser.util;
import com.browser.app.Opera;
import com.browser.app.Browser;
import com.browser.app.Chrome;
import com.browser.app.Edge;
import com.browser.app.Firefox;

public class UtilRunner {
    public static void run(Browser browser) {
        System.out.println("Running browser: " + browser.name);
        browser.open();

        if (browser instanceof Chrome) {
            System.out.println("Browser is Chrome");
            Chrome chrome = (Chrome) browser;
            System.out.println("Extensions: " + chrome.extensions);
            chrome.sync();
        }

        if (browser instanceof Edge) {
            System.out.println("Browser is Edge");
            Edge edge = (Edge) browser;
            System.out.println("Compatibility: " + edge.compatibility);
            edge.annotate();
        }

        if (browser instanceof Opera) {
            System.out.println("Browser is Opera");
            Opera opera = (Opera) browser;
            System.out.println("Speed Dial: " + opera.speedDial);
            opera.customize();
        }

        if (browser instanceof Firefox) {
            System.out.println("Browser is Firefox");
            Firefox firefox = (Firefox) browser;
            System.out.println("Add-ons: " + firefox.addons);
            firefox.debug();
        }
    }
}
