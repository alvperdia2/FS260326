/*
 * clase principal
 */
package org.example;

public class App {
    public String getGreeting() {
        return "Hola mundo me llamo alvperdia2";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
