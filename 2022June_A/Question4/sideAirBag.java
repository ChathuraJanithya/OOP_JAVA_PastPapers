public class sideAirBag implements carAirBag {

    @Override
    public void airBagMotionDetection() {
        System.out.println("Motion detection on for Side-Air-Bag");
    }

    @Override
    public void airBagLightIndicator() {
        System.out.println("Light Indicator on for Side-Air-Bag");
    }
    
}
