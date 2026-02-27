package threads;

public class TicketTask implements Runnable {
    String task;
    TicketTask(String task){
        this.task = task;
    }
    public void run(){
        System.out.println(task + " Task in progress.");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TicketTask("Seat Assignment"));
        Thread t2 = new Thread(new TicketTask("Payment Precessing"));
        Thread t3 = new Thread(new TicketTask("SMS Notification"));
        t1.start();
        t2.start();
        t3.start();
    }
}

/*
Each Runnable object is a job,and the Thread class is responsible only for execution,
which makes the approach cleaner and more flexible.
implements Runnable
Better design
Interviewers mostly ask this
Supports multiple inheritance via interfaces
 */
