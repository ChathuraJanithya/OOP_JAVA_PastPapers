public class EggFlavour implements IPrepareDeliciously {

    @Override
    public void addFlavour() {
        System.out.println("Added Egg for the meal");
    }

    @Override
    public double getCost() {

        return 60.00;
    }
    
}
