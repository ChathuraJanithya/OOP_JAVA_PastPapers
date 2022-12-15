public abstract class Meal {

    IPrepareDeliciously iPrepareDeliciously;
    IPrepareQuickly iPrepareQuickly;

    public void setFavour(ChickenFlavour chickenFlavour){
         iPrepareDeliciously.addFlavour();
    }

    public void setDuration(){
        iPrepareQuickly.deliveryTime();
    }

    public void mealWithFavour(){
        
    }
    public void mealInDuration(){
        setDuration();
    }

    public abstract void displayMeal();
    public abstract void displayCost();

}
