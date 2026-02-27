package threads;

public class ATMTransaction  extends Thread{
    public void run(){
        System.out.println("Processing ATM Transaction");
    }
    public static void main(String[] args){
        ATMTransaction t = new ATMTransaction();
        System.out.println("Thread state : "+ t.getState());
        t.start();
        System.out.println("Thread state after start : "+t.getState());
    }
}
/*
initially the thread is in the NEW state.After calling start(),it moves to runnable and executes the run() method.
the exact timing of state changes depend on the JVM scheduler
Points to remember
Thread is created once
start() changes state
Thread cannot be restarted
final state is TERMINATED or DEAD
 */
