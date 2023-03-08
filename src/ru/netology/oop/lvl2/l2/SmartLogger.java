package ru.netology.oop.lvl2.l2;

import java.time.LocalDateTime;

/**
 * @author: Baeva Nastasia
 */
public class SmartLogger implements Logger {
    private static final String INFO = "INFO";
    private static final String ERROR = "ERROR";
    private int number;
    @Override
    public void log(String msg) {
        LocalDateTime time = LocalDateTime.now();
        String infoNum = INFO;
        if(msg.toLowerCase().contains("error")){
            infoNum = ERROR;
        }
        System.out.println(infoNum + "#" + number + " [" + time + "] " + msg);
        number++;
    }
}
