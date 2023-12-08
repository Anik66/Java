public class Shop implements IEmployee{
    private String shopId;
    private String floorNumber;
    private String shopNumber;
    private String rentPerMonth;
    private String shopName;
    private String amount;

    public Shop(){

    }

    public Shop(String shopId, String floorNumber, String shopNumber, String rentPerMonth, String shopName, String amount) {
        this.shopId = shopId;
        this.floorNumber = floorNumber;
        this.shopNumber = shopNumber;
        this.rentPerMonth = rentPerMonth;
        this.shopName = shopName;
        this.amount = amount;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(String shopNumber) {
        this.shopNumber = shopNumber;
    }

    public String getRentPerMonth() {
        return rentPerMonth;
    }

    public void setRentPerMonth(String rentPerMonth) {
        this.rentPerMonth = rentPerMonth;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    public void details(){
        System.out.println("===============================");
        System.out.println("Shop name      : "+shopName);
        System.out.println("Shop id        : "+shopId);
        System.out.println("Floor number   : "+floorNumber);
        System.out.println("Shop number    : "+shopNumber);
        System.out.println("Rent per month : "+rentPerMonth);
        System.out.println("Amount         : "+amount);
        System.out.println("===============================");
    }
}
