public class Rent implements IEmployee{
    private String rentNumber;
    private String shopId;
    private String tenentName;
    private String rentAmount;
    private String rentPerMonth;
    private String rentPaidDate;

    public Rent(String rentNumber, String shopId, String tenentName, String rentAmount, String rentPerMonth, String rentPaidDate) {
        this.rentNumber = rentNumber;
        this.shopId = shopId;
        this.tenentName = tenentName;
        this.rentAmount = rentAmount;
        this.rentPerMonth = rentPerMonth;
        this.rentPaidDate = rentPaidDate;
    }

    public String getRentNumber() {
        return rentNumber;
    }

    public void setRentNumber(String rentNumber) {
        this.rentNumber = rentNumber;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getTenentName() {
        return tenentName;
    }

    public void setTenentName(String tenentName) {
        this.tenentName = tenentName;
    }

    public String getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(String rentAmount) {
        this.rentAmount = rentAmount;
    }

    public String getRentPerMonth() {
        return rentPerMonth;
    }

    public void setRentPerMonth(String rentPerMonth) {
        this.rentPerMonth = rentPerMonth;
    }

    public String getRentPaidDate() {
        return rentPaidDate;
    }

    public void setRentPaidDate(String rentPaidDate) {
        this.rentPaidDate = rentPaidDate;
    }

    public void details(){
        System.out.println("===============================");
        System.out.println("Rent number    : "+rentNumber);
        System.out.println("Shop id        : "+shopId);
        System.out.println("Tenent name    : "+tenentName);
        System.out.println("Rent amount    : "+rentAmount);
        System.out.println("Rent per month : "+rentPerMonth);
        System.out.println("Rent paid date : "+rentPaidDate);
        System.out.println("===============================");
    }
}
