package ru.itsjava.threads.lecture2;

public class ThreadPracticeHW {
    public static void main(String[] args) {
        Runnable anonymousRunnable = new Runnable(){

            @Override
            public void run() {
            }
        };

        anonymousRunnable.run();
        Thread thread = new Thread(anonymousRunnable);
        thread.start();

        //лямбда-выражения
        Runnable functionalRunnable = () -> System.out.println("Привет я Runnable");
        new Thread(functionalRunnable).start();

        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Привет я проснулся после 4 секунд");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.setDaemon(true);
        thread1.start();
    }
}

