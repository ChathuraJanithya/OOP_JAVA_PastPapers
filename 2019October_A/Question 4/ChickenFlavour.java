public class ChickenFlavour implements IPrepareDeliciously {

    @Override
    public void addFlavour() {
        System.out.println("Added chicken for the meal");
    }

    @Override
    public double getCost() {

        return 100.00;
    }
    
}
