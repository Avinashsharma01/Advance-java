# There are two way to create a thread in java
# 1. By extending Thread class
# 2. By implementing Runnable interface

# 1. By extending Thread class
# ----------------------------- 
    class MyThread extends Thread{
        public void run(){
         System.out.println("Thread is running");
    }

    public static void main(String[] args){
        MyThread t = new MyThread();
        t.start();
    }
}


# 2. By implementing Runnable interface
# --------------------------------------
    class MyThread implements Runnable{
        public void run(){
            System.out.println("Thread is running");
        }

        public static void main(String[] args){
            MyThread t = new MyThread();
            Thread t1 = new Thread(t);
            t1.start();
        }
    }
``` 

<summary>How to create a thread in java by extending Thread class?</summary>
    
```java
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args){
        MyThread t = new MyThread();
        t.start();
    }
}
```  