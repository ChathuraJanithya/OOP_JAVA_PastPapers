public class DemoApp {
    
    public static void main(String args[]){
        
            TCalculation <Integer> intVal = new TCalculation<>();
            TCalculation <Double> doubleVal = new TCalculation<>();

            intVal.append(100);
            intVal.append(130);
            intVal.append(232);
            intVal.append(600);
            intVal.append(780);
            intVal.append(891);

            doubleVal.append(34.5);
            doubleVal.append(44.5);
            doubleVal.append(34.66);
            doubleVal.append(65.5);
            doubleVal.append(348.5);
            doubleVal.append(345.675);

            System.out.println("Integer average : " +intVal.average());
            System.out.println("Double average : " +doubleVal.average());

    }
}
