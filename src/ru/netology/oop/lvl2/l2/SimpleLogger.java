package ru.netology.oop.lvl2.l2;

import java.time.LocalDateTime;

/**
 * @author: Baeva Nastasia
 */
public class SimpleLogger implements Logger{
    @Override
    public void log(String msg) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("[" + time + "] " + msg);
    }
}
