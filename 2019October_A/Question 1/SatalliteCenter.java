public class SatalliteCenter {

    public static int option;
    public static int size;

    static ISatallite[] iSatallites = new ISatallite[size];
 static IGeoLocation[] iGeoLocations = new IGeoLocation[size];
    //public ISatallite iSatallite[];

    //public IGeoLocation iGeoLocation[];
 
    public SatalliteCenter(int option,ISatallite[] isatallites,IGeoLocation[] igeoLocations){
        SatalliteCenter.option = option;
        SatalliteCenter.iSatallites = isatallites;
        SatalliteCenter.iGeoLocations = igeoLocations;
    }

    public static void startService(){
      
        switch(option){
            case 1:
            System.out.println(SatalliteCenter.iSatallites +" activate drone satallite");
            break;
            case 0:
            System.out.println(SatalliteCenter.iSatallites +" activate navigation satallite");
            break;
            default:
            System.out.println("error");
        }
    }
    public static void stopService(){
        switch(option){
            case 1:
            System.out.println(SatalliteCenter.iSatallites +" deactivate drone satallite");
            break;
            case 0:
            System.out.println(SatalliteCenter.iSatallites+" deactivate navigation satallite");
            break;
            default:
            System.out.println("error");
        }
    }

    public static void locationService(){
        System.out.println("Satallite location is  " +SatalliteCenter.iGeoLocations);
    }
}
