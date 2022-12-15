public class cat extends pet{

    @Override
    public void feed() {
        System.out.println("Feeding the cat");
        setter(getter()+5);
  
    }

    @Override
    public void clean() {
   
        System.out.println("Cleaning the cat");
        setter(getter()+10);
    }

    @Override
    public void cuddle() {
        System.out.println("Cuddling the cat");
        setter(getter()+15);
    }

    @Override
    public void getTotalPoints() {
        System.out.println("Total points : " +getter());
    }
    
}
