public class HelloWorld3 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": RunnableTest");
 
        // Anonymous Runnable
 
        Runnable task1 = new Runnable(){
 
          @Override
          public void run(){
            System.out.println(Thread.currentThread().getName() + " is running");
          }
        };
 
 
        // Passing a Runnable when creating a new thread
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName() + " is running");
            }
        });
 
        Thread thread1 = new Thread(task1);
        //starting a Thread normally.
        thread1.start();
        
        
        // Lambda Runnable -- creating a Thread using Lambdas
        Runnable task3 = () -> {
            System.out.println(Thread.currentThread().getName() + " is running");
        };
 
       
 
        new Thread(task3).start();
 
    }
}