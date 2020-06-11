package com.company;

public class Main {
    public static void main(String [] args) {

        /*ConsoleLogger consoleLogger=new ConsoleLogger();
        FileLogger writeFile=new FileLogger();

        SuperClass superClass=new SuperClass(consoleLogger);
        superClass.doWork();
        */

        FirstThread firstThread=new FirstThread("a");
        FirstThread firstThread1=new FirstThread("b");
        FirstThread firstThread2=new FirstThread("c");
        Thread thread=new Thread(firstThread);
        thread.start();
        //thread.sleep(2000);
        Thread thread1=new Thread(firstThread1);
        thread1.start();
        //thread1.sleep(2000);
        Thread thread2=new Thread(firstThread2);
        thread2.start();
       // thread2.sleep(2000);

    }


}
class FirstThread implements Runnable{
    String name;
    public FirstThread(String name){
        this.name=name;
    }
    public void run(){
        for (int i=1;i<=15;i++){

            System.out.println(i+". "+name);
            Thread thread=new Thread();
            try {
                thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




