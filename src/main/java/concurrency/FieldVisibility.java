package concurrency;

import java.util.concurrent.CountDownLatch;

public class FieldVisibility {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("===============================================");
        System.out.println("        >>> Using CountDownLatch <<<<");
        System.out.println("===============================================");

        CountDownLatch latch = new CountDownLatch(1);

        var vol = new VolatileVisibility();

        var worker1 = new WorkerWithCountDownLatch("Worker with latch 1", latch,
                () -> {
                    vol.setV(1);
                    System.out.println("Print from worker1 set 1");
                });

        var worker2 = new WorkerWithCountDownLatch("Worker with latch 2", latch,
                () -> {
                    System.out.println("Print from worker2 :" + vol.getV());
                });

        worker1.start();
        Thread.sleep(10);//simulation of some actual work

        worker2.start();
        Thread.sleep(10);//simulation of some actual work

        System.out.println("-----------------------------------------------");
        System.out.println(" Now release the latch:");
        System.out.println("-----------------------------------------------");
        latch.countDown();
    }
}
