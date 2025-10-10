public class DeadLock {
    public static void main(String[] args) {
        System.out.println("Name : Ajay Kumar");
        System.out.println("Roll no : 2024503701");

        Object obj1 = new Object();
        Object obj2 = new Object();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(obj1) {
                    System.out.println("Thread 1 has acquired obj1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Thread 1 is waiting to acquire obj2");
                    synchronized(obj2) {
                        System.out.println("Thread 1 has acquired obj2");
                    }
                }
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(obj2) {
                    System.out.println("Thread 2 has acquired obj2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Thread 2 is waiting to acquire obj1");
                    synchronized(obj1) {
                        System.out.println("Thread 2 has acquired obj1");
                    }
                }
            }
        });

        t1.start();
        t2.start();

        System.out.println("Both threads started; a deadlock is likely to occur.");
    }
}
