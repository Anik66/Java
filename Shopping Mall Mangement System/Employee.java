public class Employee implements IEmployee{
    private String id;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String education;
    private String salary;
    private String phoneNumber;
    private String post;
    private String joinDate;

    public Employee(String id, String name, String dateOfBirth, String gender, String education, String salary, String phoneNumber, String post, String joinDate) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.education = education;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.post = post;
        this.joinDate = joinDate;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public void details(){
        System.out.println("===============================");
        System.out.println("name         : "+name);
        System.out.println("id           : "+id);
        System.out.println("date of birth: "+dateOfBirth);
        System.out.println("Gender       : "+gender);
        System.out.println("education    : "+education);
        System.out.println("Salary       : "+salary);
        System.out.println("Phone number : "+phoneNumber);
        System.out.println("Post         : "+post);
        System.out.println("Join date    : "+joinDate);
        System.out.println("===============================");
    }

}
