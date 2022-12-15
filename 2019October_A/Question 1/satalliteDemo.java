
public class satalliteDemo {
    public static void main(String args[])    {
        ISatallite navigationSatallite = new NavigationSatallite("Ravana-01");
        IGeoLocation locationTracker1 = new SatalliteLocation("Sri lanka");
        ISatallite droneSatallite = new DroneSattalite("Ravana-02");
        IGeoLocation locationTracker2 = new SatalliteLocation("Russia");

        ISatallite[] sataliteArray = new ISatallite[]{
            navigationSatallite,droneSatallite
        };
        
       IGeoLocation[] trackArray = new IGeoLocation[]{
        locationTracker1,locationTracker2
       };

       SatalliteCenter satalliteCenter = new SatalliteCenter(0,sataliteArray,trackArray);
       SatalliteCenter.startService();
       SatalliteCenter.stopService();
       SatalliteCenter.locationService();
       satalliteCenter.startService();

       
    }
    
}
