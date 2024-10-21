package ru.itsjava.threads.threadsHW;

import ru.itsjava.threads.PrinterRunnable;
import ru.itsjava.threads.PrinterThread;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        PrinterThread printerThreadA = new PrinterThread("A", 2000L);
//        PrinterThread printerThreadB = new PrinterThread("B", 3000L);

        PrinterRunnable printerRunnable = new PrinterRunnable("B", 3000L);
        Thread threadB = new Thread(printerRunnable);
        //Запускаем метод start, и он запускает новые поток, но выполняет метод run
        System.out.println("start");

        printerThreadA.start();
        threadB.start();
        //используем этот метод, чтобы end выполнился в конце
        threadB.join();

        System.out.println("end");

        for (int i = 0; i < 5; i++) {
            Thread.sleep(3000L);
            System.out.println("Любое сообщение");
        }


    }
}


