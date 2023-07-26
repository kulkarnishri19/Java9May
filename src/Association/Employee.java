package Association;

public class Employee {
    String name;
    String lastName;
    int empId;
    Salary salary;
    EmpPosition empPosition;

    public Employee(String name, String lastName, int empId, Salary salary, EmpPosition empPosition) {
        this.name = name;
        this.lastName = lastName;
        this.empId = empId;
        this.salary = salary;
        this.empPosition=empPosition;
    }
    void display (){
        System.out.println("Name " +name);
        System.out.println("lastName " +lastName);
        System.out.println("EMP_id " +empId);
        System.out.println("Salary " +salary);
        System.out.println("EMP_Position "+ empPosition);
    }
}

class  Salary {
    int Emp_salary;
    String company_Name;
    Salary (int Emp_salary, String company_Name){
        this.Emp_salary =Emp_salary;
        this.company_Name = company_Name;
    }
}
class EmpPosition{
    String Position_Manager;
    EmpPosition (String Position_Manager ){

        this.Position_Manager=Position_Manager;
    }

}
class EmployeeImpl{
    public static void main(String[] args) {
        Salary  salary= new Salary (2000000,"TCS");
        EmpPosition  empPosition  = new EmpPosition  ("Manager");
        Employee employee = new Employee("ABC","XYZ",2120,salary,empPosition);
        employee.display();
    }
}