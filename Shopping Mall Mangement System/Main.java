import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
        static List<Shop> shop=new ArrayList<>();
        static List<Employee> employee=new ArrayList<>();
        static List<Tenent> tenent=new ArrayList<>();
        static List<Rent> rent=new ArrayList<>();


        static Scanner scanner=new Scanner(System.in);

        public static void showShopDetails(String id){
            for (int i=0;i<shop.size();i++){
                if(shop.get(i).getShopId().equals(id)){
                    shop.get(i).details();
                    System.out.println("\n\nWant to go to main section press any key: ");
                    scanner.next();
                    mainSection();
                }
            }
        }

        public static void showEmployeeDetails(String id){
            for (int i=0;i<employee.size();i++){
                if(employee.get(i).getId().equals(id)){
                    employee.get(i).details();
                    System.out.println("\n\nWant to go to main section press any key: ");
                    scanner.next();
                    mainSection();
                }
            }
        }

        public static void showTenentDetails(String id){
            for (int i=0;i<tenent.size();i++){
                if(tenent.get(i).getId().equals(id)){
                    tenent.get(i).details();
                    System.out.println("\n\nWant to go to main section press any key: ");
                    scanner.next();
                    mainSection();
                }
            }
        }
        public static void showRentCollection(String id){
            for (int i=0;i<rent.size();i++){
                if(rent.get(i).getShopId().equals(id)){
                    rent.get(i).details();
                    System.out.println("\n\nWant to go to main section press any key: ");
                    scanner.next();
                    mainSection();
                }
            }
        }


        public static void addEmployee(){

            System.out.println("===============================");
            System.out.print("1..Employee ID: ");
            String employeeId=scanner.next();
            System.out.print("2..Name: ");
            String name=scanner.next();
            System.out.print("3..Date of birth: ");
            String dateOfBirth=scanner.next();
            System.out.print("4..Gender: ");
            String gender=scanner.next();
            System.out.print("5..Education: ");
            String education=scanner.next();
            System.out.print("6..Salary: ");
            String salary=scanner.next();
            System.out.print("7..Phone number: ");
            String phoneNumber=scanner.next();
            System.out.print("8..Post: ");
            String post=scanner.next();
            System.out.print("9..Join date: ");
            String joinDate=scanner.next();
            System.out.println("===============================");

            Employee e=new Employee(employeeId,name,dateOfBirth,gender,education,salary,phoneNumber,post,joinDate);
            employee.add(e);

            System.out.println("\n\nWant to go to main section press any key: ");
            scanner.next();
            mainSection();

        }
        public static void addTenent(){

            System.out.println("===============================");
            System.out.print("1..Tenent ID: ");
            String Id=scanner.next();
            System.out.print("2..Tenent Name: ");
            String name=scanner.next();
            System.out.print("3..Address: ");
            String address=scanner.next();
            System.out.print("4..Phone number: ");
            String phoneNumber=scanner.next();
            System.out.print("5..Floor Number: ");
            String floorNumber=scanner.next();
            System.out.println("===============================");

            Tenent t=new Tenent(Id,name,address,phoneNumber,floorNumber);
            tenent.add(t);

            System.out.println("\n\nWant to go to main section press any key: ");
            scanner.next();
            mainSection();
        }

        public static void addShop(){

            System.out.println("===============================");
            System.out.print("1..Shop ID: ");
            String shopId=scanner.next();
            System.out.print("2..Floor number: ");
            String floorNumber=scanner.next();
            System.out.print("3..Shop number: ");
            String shopNumber=scanner.next();
            System.out.print("4..Rent per Month: ");
            String rentPerMonth=scanner.next();
            System.out.print("5..Shop name: ");
            String shopName=scanner.next();
            System.out.print("6..Bonus Amount: ");
            String amount=scanner.next();
            System.out.println();
            System.out.println("Succesfully add a shop!");
            System.out.println("===============================");


            Shop s=new Shop(shopId,floorNumber,shopNumber,rentPerMonth,shopName,amount);
			shop.add(s);

            System.out.println("\n\nWant to go to main section press any key: ");
            scanner.next();
            mainSection();

        }

        public static void rentCollection(){
            System.out.println("===============================");
            System.out.print("1..Rent number: ");
            String rentNumber=scanner.next();
            System.out.print("2..Shop ID: ");
            String shopId=scanner.next();
            System.out.print("3..Tenent amount: ");
            String tenentName=scanner.next();
            System.out.print("4..Rent Amount: ");
            String rentAmount=scanner.next();
            System.out.print("5..rentPerMonth: ");
            String rentPerMonth=scanner.next();
            System.out.print("6..Rent paid date: ");
            String rentPaidDate=scanner.next();
            System.out.println("===============================");

            Rent r=new Rent(rentNumber,shopId,tenentName,rentAmount,rentPerMonth,rentPaidDate);
            rent.add(r);
            System.out.println("\n\nWant to go to main section press any key: ");
            scanner.next();
            mainSection();

        }


        public static void mainSection(){

            Scanner scanner1=new Scanner(System.in);
            System.out.println("===============================");
            System.out.println("1. Add shop ");
            System.out.println("2. Add employee");
            System.out.println("3. Add Tenent");
            System.out.println("4. Rent collection");
            System.out.println("5. show shop details");
            System.out.println("6. show employee details");
            System.out.println("7. show Tenent details");
            System.out.println("8. show Rent collection details ");
            System.out.println("9. Exit");
            System.out.println("===============================");
            int option=scanner.nextInt();
            if(option==1){
                addShop();
            }
            else if(option==2){
                addEmployee();
            }
            else if(option==3){
                addTenent();
            }
            else if(option==4){
                rentCollection();
            }
            else if(option==5){
                System.out.print("Enter shop id: ");
                showShopDetails(scanner.next());
            }
            else if(option==6){
                System.out.print("Enter Employee id: ");
                showEmployeeDetails(scanner.next());
            }
            else if(option==7){
                System.out.print("Enter Tenent id: ");
                showTenentDetails(scanner.next());
            }
            else if(option==8){
                System.out.print("Enter Shop id: ");
                showRentCollection(scanner.next());
            }
            else {
                System.exit(0);
            }
        }


        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter your username: ");
            String username=scanner.next();
            System.out.print("Enter your Password: ");
            String password=scanner.next();

            if(username.equals("admin") && password.equals("admin1234")) {
                mainSection();
            }
            else{
                System.out.println("Enter a valid password!");

            }

        }


}
