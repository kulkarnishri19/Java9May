package Association;

public class Address {
    String cityName;
    String rodeName;

    String ownerName;
    Pincode pincode;
    HouseName houseName;

    public Address(String cityName,String rodeName,String ownerName ,Pincode pincode, HouseName houseName ){
        this.cityName = cityName;
        this.rodeName=rodeName;
        this.ownerName=ownerName;
        this.pincode = pincode;
        this. houseName= houseName;
    }
    void display(){
        System.out.println("City Name :" +cityName);
        System.out.println("Rode Name :" +rodeName);
        System.out.println("OwnerName :" +ownerName);
        System.out.println("PinCode   :" + pincode);
        System.out.println("HouseName :" +houseName);
    }
}
class Pincode {
    String colonyName;
    int societyNo;
    Pincode(String colonyName,int societyNo ){
        this.colonyName=colonyName;
        this.societyNo=societyNo;
    }
}
class HouseName{
     String xyz;
    HouseName(String xyz ){
     this.xyz = xyz;

    }
}
class AddressIMPL{
    public static void main(String[] args) {
        Pincode pincode = new  Pincode("SSSS",1234);
        HouseName houseName =  new HouseName( "Shri");
        Address address = new Address("Pune","Kothrud ","Sk" ,pincode,houseName);
        address.display();

    }
}