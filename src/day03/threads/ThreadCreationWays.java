package day03.threads;

public class ThreadCreationWays {
    public static void main(String[] args) {
        //her Java programinda 1 tane thread dafault olarak calistirilir.
        System.out.println("Mevcut thread:" + Thread.currentThread().getName());

        MyThread thread1 = new MyThread();
        thread1.start();//Threadi baslatir ardindan run methodunu cagirir
        //thread1.run(); -->sadece run icindeki kodlari calistirir fakat yeni bir thread basltmaz ..bu sebepten start methodunu kullanirizz
        thread1.setName("threadcikk :)");

//2.yol:Runnable : functional interface

        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();//-->3.threadimiz calismis oluyor

        //anonymous class: isimzsiz.bilinmeyen class,3.yolu pratik bir sekilde yapmanin yolu
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonim thread :" + Thread.currentThread().getName());
                System.out.println("Anonim sinif ile thread olustu.");
            }
        });
        thread3.start();
        //Runnable:functional interface : sadece run implemente edilecek : lambda exp.
        Thread thread4 = new Thread(()->{
            System.out.println("lambda ile run methodunu override ettik ve rnnable parametresi verdik.  ");
        });
        thread4.start();
    }
}

//thread olusturmanin sadece 2 tane yolu var.
//1.YOL: Thread classini exend ederek
class MyThread extends Thread {

    @Override
    public void run() {
        //threads yaptirmak istedgimiz islemler
        System.out.println("Calisan thread :" + Thread.currentThread().getName());
        System.out.println("MyThread threadi calisiyor. HARIKA * :)");
    }

}

//2.YOL: Runnable interfacini implement etme
class MyRunnable implements Runnable {

    @Override
    public void run() {
        //threads yaptirmak istedgimiz islemler
        System.out.println("Calisan thread runnable:" + Thread.currentThread().getName());
        System.out.println("Runnable interface ile olusturulan thread calisiyor. HARIKA * :)");
    }
}

