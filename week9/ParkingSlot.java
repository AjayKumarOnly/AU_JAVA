    import java.util.concurrent.Semaphore;
    class Car implements Runnable{
        private Semaphore sem;
        private String name;
        public Car(Semaphore sem, String name){
            this.sem = sem;
            this.name = name;
        }
        public void run(){
            boolean acquired = false;
            try{
                sem.acquire();
                acquired = true;
                System.out.println(name + " is parking");
                Thread.sleep(10000);
                System.out.println(name + " is leaving");
            } catch(InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println(name + " was interrupted");
            } finally{
                if(acquired){
                    sem.release();
                }
            }
        }
    }

    public class ParkingSlot {
        public static void main(String[] args) {
            System.out.println("Name : Ajay Kumar");
            System.out.println("Roll no : 2024503701");

            Semaphore sem = new Semaphore(3);
            Thread t1 = new Thread(new Car(sem,"Car 1"));
            Thread t2 = new Thread(new Car(sem,"Car 2"));
            Thread t3 = new Thread(new Car(sem,"Car 3"));
            Thread t4 = new Thread(new Car(sem,"Car 4"));
            Thread t5 = new Thread(new Car(sem,"Car 5"));
            
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            
            try{
                t1.join();
                t2.join();
                t3.join();
                t4.join();
                t5.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("All cars have parked");
        }
    }
