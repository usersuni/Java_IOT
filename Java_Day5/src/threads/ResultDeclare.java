package threads;

public class ResultDeclare {
    synchronized void declareResult()throws Exception{
        System.out.println("Waiting for approval");
        wait();
        System.out.println("Result Declared");
    }
    synchronized void approve(){
        notify();
    }
    public static void main(String[] args) throws Exception{
        ResultDeclare r = new ResultDeclare();
        new Thread(() ->{
                    try{
                        r.declareResult();
                    }catch(Exception e){}
                }).start();
        Thread.sleep(2000);
        new Thread(()->
            r.approve()).start();
    }
}

/*
The declareresult() method waits until another Thread calls notify().
During wait(),the thread releases the lock,allowing other threads
to enter the synchronizes code.

Points to remember
Sleep() ->time based
wait() ->condition based
wait() -> release lock ->by checking the notify() method
wait() is used in inter-threaded communication
Order-Placed ->Preparing->Prepared -> Delivering - Delivered
 */
