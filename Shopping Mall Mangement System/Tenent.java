public class Tenent implements IEmployee{

    private String id;
    private String name;
    private String address;
    private String phoneNumber;
    private String floorNumber;

    public Tenent(String id, String name, String address, String phoneNumber, String floorNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.floorNumber = floorNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void details(){
        System.out.println("===============================");
        System.out.println("id           : "+id);
        System.out.println("name         : "+name);
        System.out.println("address      : "+address);
        System.out.println("phone number : "+phoneNumber);
        System.out.println("floor number : "+floorNumber);
        System.out.println("===============================");
    }
}
