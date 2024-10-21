package ru.itsjava.threads.threadsHW;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor              //Alt+Insert-->
                                 // Override methods
public class PrinterThread extends Thread {

    private final String message;
    private final long delay;
    //чтобы пробросить sleep
    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(delay);
            System.out.print(message + " ");
        }
    }
}

