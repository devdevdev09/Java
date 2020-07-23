package com.example.java.thread;

public class RunThreadTest {
    public void threadTestFn(){
        ThreadTest threadTest1 = new ThreadTest();
        ThreadTest threadTest2 = new ThreadTest();

        Thread thread1 = new Thread(threadTest1, "~~~~~~~~~~~~");
        Thread thread2 = new Thread(threadTest2, "************");
        thread1.start();
        thread2.start();
    }

    public void forThreadFn(String threadName){
        ThreadTest threadTs = new ThreadTest();

        Thread thread = new Thread(threadTs, threadName);

        thread.start();
    }

    public static void main(String[] args){
        RunThreadTest rtt = new RunThreadTest();
        // rtt.threadTestFn();

        // rtt.forThreadFn("11");

        for(int i = 0 ; i < 10; i++){
            rtt.forThreadFn(Integer.toString(i));
        }
    }
    
}