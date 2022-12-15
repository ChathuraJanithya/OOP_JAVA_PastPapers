public class parrot extends pet {

    private String command;

    public parrot(String command){
        super();
        this.command = command;
    }

    @Override
    public void feed() {
        System.out.println("Feeding thr parrot");
        setter(getter() +5);
    }
    
    @Override
    public void clean() {
        System.out.println("Cleaning thr parrot");
        setter(getter()+10);
        
    }
    
    @Override
    public void cuddle() {
        System.out.println("Cuddling thr parrot");
        setter(getter()+15);
    }

    @Override
    public void getTotalPoints() {

    }
    
}
