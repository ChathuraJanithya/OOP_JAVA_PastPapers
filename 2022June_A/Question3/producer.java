import java.util.ArrayList;

public class producer extends Thread{

    private ArrayList<Integer> array;

    public producer(ArrayList<Integer> array){
        super();
        this.array = array;
    }

    public void run(){
        int x = 10;
        while(true){
                synchronized(array){
                try {

                        System.out.println("Producer started");
                        array.add(x);

                        System.out.println("Producer adding values = " +x + " to queue");
                        x += 10;

                        sleep(1000);
                        array.wait();
                        array.notify();
                        
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        
    }
}
