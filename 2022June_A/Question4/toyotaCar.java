public class toyotaCar implements car {

    carAirBag airBag;
    public toyotaCar(carAirBag airBag){
        this.airBag = airBag;
    }

    @Override
    public void assembleLight() {
        System.out.println("Assembling for Toyota");
        airBag.airBagLightIndicator();
    }
    
    @Override
    public void assembleMotionDetector() {
        System.out.println("Assembling for Toyota");
        airBag.airBagMotionDetection();
    }
    
}
