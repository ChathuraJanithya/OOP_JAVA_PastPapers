public class frontAirBag implements carAirBag{

    @Override
    public void airBagMotionDetection() {
    System.out.println("Motion detection on for front-Air-Bag");
}

    @Override
    public void airBagLightIndicator() {
        System.out.println("Light Indicator on for front-Air-Bag");    
    }
    
}
