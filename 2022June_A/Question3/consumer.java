import java.util.ArrayList;

public class consumer extends Thread {

    private ArrayList<Integer> array;

    public consumer(ArrayList<Integer> array){
        super();
        this.array = array;
    }
    
    public void run(){
        
        while(true){
                synchronized(array){
                    try {
                        System.out.println("consumer started");
                        System.out.println("consumer thread consumes " + array.get(0));
                        array.remove(0);
                        System.out.println("Elements in queue " + array);
                        sleep(1000);
                        array.notify();
                        array.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
