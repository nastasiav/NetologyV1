package ru.netology.oop.lvl2.l2;

/**
 * @author: Baeva Nastasia
 */
public class Main {
    public static void main(String[] args) {
        SimpleLogger simpleLogger = new SimpleLogger();
        SmartLogger smartLogger = new SmartLogger();

        simpleLogger.log("234");
        smartLogger.log("234");
        smartLogger.log("2error34");
    }
}
