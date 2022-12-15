import java.util.ArrayList;

public class TCalculation<T extends Number> {

    ArrayList<T> numList = new ArrayList<>();

    public void append(T list){
        numList.add(list);
    }

    public double average(){

        double tot = 0;
        
        for(T nList: numList){
           tot  += nList.doubleValue();
        }
        double avg = tot / numList.size();
        return avg;
    }
    
}
