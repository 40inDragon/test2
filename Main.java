public class Main {
    static class MyThread extends Thread {

        MyThread(String name) {
            super(name);
            start();
        }

        @Override
        public void run() {
            try {
                sleep(2000);
                //method1() //throws Exception
            } catch (InterruptedException e) {

                interrupt();
                return;
            }
            System.out.println("Hello from " + getName());

        }
    }

    private static int a = 0;
    private static int b = 0;
    private static int c = 0;

    static final Object mon = new Object();
    static final Object mon2 = new Object();

    private synchronized static void increment() {
        for (int i = 0; i < 1000_000; i++) {
            a = a + 1;
            b = b + 1;
            c = c + 1;
        }
        String vars = String.format("a=%d, b=%d, c=%d\n", a, b, c);
        System.out.print(vars);
    }

    private synchronized static void increment2() {
        for (int i = 0; i < 1000_000; i++) {
            a = a + 1;
            b = b + 1;
            c = c + 1;
        }
        String vars = String.format("a=%d, b=%d, c=%d\n", a, b, c);
        System.out.print(vars);
    }

    public static void main(String[] args) {
        Runnable r = Main::increment;
        new Thread(r, "Thread#0").start();
        new Thread(r, "Thread#1").start();
        new Thread(r, "Thread#2").start();
    }

    private static void threadsExample() {
        MyThread t0 = new MyThread("MyThread");
        try {
            t0.join(); // while (t0.isAlive()) {}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hello from " + Thread.currentThread().getName());
    }

    private static void runnableExample() {
        new MyThread("MyThread");
        class MyRunnable implements Runnable {
            @Override
            public void run() {

            }
        }
        Thread t1 = new Thread(new MyRunnable());
        t1.setName("RunnableThread");
        t1.start();
    }
}
