public class demo {
    public static void main(String args[]){
        carAirBag fAirBag = new frontAirBag();
        carAirBag sAirBag = new sideAirBag();

        new nissanCar(fAirBag).assembleLight();
        new nissanCar(fAirBag).assembleMotionDetector();
        
        new toyotaCar(sAirBag).assembleLight();
        new toyotaCar(sAirBag).assembleMotionDetector();
    }
}
