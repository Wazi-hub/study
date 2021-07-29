package com.concurrent;

import java.util.concurrent.*;

public class MulthreadDemo {
    public static void main(String[] args) {
        for(int i =0; i<20;i++) {
            System.out.println("这是主线程在运行");
        }
//        Thread t1 = new ThreadDemo();
//        t1.start();
//        Thread t2 = new Thread(new RunnableDemo());
//        t2.start();
//        FutureTask<String> tar = new FutureTask<>(new CallableDemo());
//        Thread t3 = new Thread(tar);
//        t3.start();


        //线程池
        ThreadPoolExecutor tPool = new ThreadPoolExecutor(5,6,80, TimeUnit.SECONDS,new ArrayBlockingQueue<>(100),new ThreadPoolExecutor.CallerRunsPolicy());
                tPool.execute(new RunnableDemo());
                tPool.execute(new FutureTask<>(new CallableDemo()));
    }
}

class ThreadDemo extends Thread{
    @Override
    public void run(){
        for(int i =0; i<10; i++) {
            System.out.println("这是继承线程类的线程");
        }
    }
}
class RunnableDemo implements Runnable{
    @Override
    public void run(){
        for(int i =0; i<2000; i++){
            System.out.println("这是实现Runnable的线程");
        }
    }
}
class CallableDemo implements Callable<String> {
      @Override
    public String call(){
          for(int i = 0; i<20; i++){
              System.out.println("callable");
          }
          return "这是一个实现callable的线程";
    }
}
