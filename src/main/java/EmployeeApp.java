public class EmployeeApp {
    public static void main(String[] args){
        employee employee = new employee();

        employee.name = "John";
        employee.emailAddress = "john@baeldung.com";
        employee.yearOfBirth = 1978;

        System.out.println("Name: " + employee.name);
        System.out.println("Email Address: " + employee.emailAddress);
        System.out.println("Year Of Birth:" + employee.yearOfBirth);
    }
}
