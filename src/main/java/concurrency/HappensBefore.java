package concurrency;

import java.util.concurrent.CountDownLatch;

public class HappensBefore {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(" Using CountDownLatch");

        CountDownLatch latch = new CountDownLatch(1);

        var vol = new HappensBeforeVisibility();

        var worker1 = new WorkerWithCountDownLatch("Worker with latch 1", latch, vol::prepareVariables);
        Thread.sleep(10);
        var worker2 = new WorkerWithCountDownLatch("Worker with latch 2", latch, vol::printVariables);

        worker1.start();
        worker2.start();

        Thread.sleep(10); //simulation of some actual work

        System.out.println(" Now release the latch:");
        latch.countDown();
    }
}
