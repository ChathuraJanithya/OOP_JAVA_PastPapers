public class SatalliteLocation implements IGeoLocation {
    String location;

    public SatalliteLocation(String location){
        this.location = location;
    }
  
    @Override
    public void displayLocation() {
       SatalliteCenter.locationService();
    }
 
    
}
