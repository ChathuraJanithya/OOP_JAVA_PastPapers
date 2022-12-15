public class nissanCar implements car {

    carAirBag airBag;
    
    public nissanCar(carAirBag airBag){
        this.airBag = airBag;
    }
    @Override
    public void assembleLight() {
        System.out.println("Assembling for Nissan ");
        airBag.airBagLightIndicator();
    }
    
    @Override
    public void assembleMotionDetector() {
        System.out.println("Assembling for Nissan ");
        airBag.airBagMotionDetection();
    }
    
}
