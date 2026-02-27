package threads;

public class Food extends Thread{
    String task;
    Food(String task){
        this.task = task;
    }
    public void run(){
        System.out.println(task + "Started");
    }

    public static void main(String[] args) {
        Food f = new Food("Cooking");
        Food p = new Food("Packing");
        Food d = new Food("Delivary");
        f.start();
        p.start();
        d.start();
    }
}

/*
Points to remember
Extend Thread
Override run()
Use start()
It is less flexible because of inheritance limitation
 */