public class FishFlavour implements IPrepareDeliciously {

    @Override
    public void addFlavour() {
        System.out.println("Added fish for the meal");
    }

    @Override
    public double getCost() {

        return 80.00;
    }
    
}
