package Concurrency;

public class DiningPhilospherRunner {
    public static void main(String[] args) throws Exception{
        DiningPhilospher diningPhilospher = new DiningPhilospher();
        Thread t1 = new Thread(()->{
            diningPhilospher.wantsToEat(0, ()->{
                System.out.println("Philospher 0 picking left spoon");
            }, ()->{
                System.out.println("Philospher 0 picking right spoon");
            }, ()->{
                System.out.println("Philospher 0 eating");
            }, ()->{
                System.out.println("Philospher 0 putting left spoon");
            }, ()->{
                System.out.println("Philospher 0 putting right spoon");
            });
        });
        Thread t2 = new Thread(()->{
            diningPhilospher.wantsToEat(1, ()->{
                System.out.println("Philospher 1 picking left spoon");
            }, ()->{
                System.out.println("Philospher 1 picking right spoon");
            }, ()->{
                System.out.println("Philospher 1 eating");
            }, ()->{
                System.out.println("Philospher 1 putting left spoon");
            }, ()->{
                System.out.println("Philospher 1 putting right spoon");
            });
        });
        Thread t3 = new Thread(()->{
            diningPhilospher.wantsToEat(2, ()->{
                System.out.println("Philospher 2 picking left spoon");
            }, ()->{
                System.out.println("Philospher 2 picking right spoon");
            }, ()->{
                System.out.println("Philospher 2 eating");
            }, ()->{
                System.out.println("Philospher 2 putting left spoon");
            }, ()->{
                System.out.println("Philospher 2 putting right spoon");
            });
        });
        Thread t4 = new Thread(()->{
            diningPhilospher.wantsToEat(3, ()->{
                System.out.println("Philospher 3 picking left spoon");
            }, ()->{
                System.out.println("Philospher 3 picking right spoon");
            }, ()->{
                System.out.println("Philospher 3 eating");
            }, ()->{
                System.out.println("Philospher 3 putting left spoon");
            }, ()->{
                System.out.println("Philospher 3 putting right spoon");
            });
        });
        Thread t5 = new Thread(()->{
            diningPhilospher.wantsToEat(4, ()->{
                System.out.println("Philospher 4 picking left spoon");
            }, ()->{
                System.out.println("Philospher 4 picking right spoon");
            }, ()->{
                System.out.println("Philospher 4 eating");
            }, ()->{
                System.out.println("Philospher 4 putting left spoon");
            }, ()->{
                System.out.println("Philospher 4 putting right spoon");
            });
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
