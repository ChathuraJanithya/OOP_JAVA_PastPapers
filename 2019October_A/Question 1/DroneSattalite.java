public class DroneSattalite implements ISatallite{

    String satalliteName;
    public int option;

    //constructor
    public DroneSattalite(String satalliteName){
        this.satalliteName = satalliteName;
    }

    @Override
    public void activate() {
      
        SatalliteCenter.startService();
    }

    @Override
    public void deactivate() {
        SatalliteCenter.stopService();
    }
    
   
}
