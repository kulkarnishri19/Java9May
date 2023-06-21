package Constructor;

public class Employee {
    int id;
    String name;
    String companyName;
    Employee (int eid , String nm, String cname){
        id = eid;
        name = nm;
        companyName = cname;
    }

}
class EmployeeIMPL{
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Amit", "Codekul");
        Employee e2 = new Employee(2,"Nikita", "IBM");
        Employee e3 = new Employee(3,"Ekanath", "IBM");

        System.out.println("ID: "+e1.id+ " Name : "+e1.name + " CompanyName "+e1.companyName);
        System.out.println("ID: "+e2.id+ " Name : "+e2.name + " CompanyName "+e2.companyName);
        System.out.println("ID: "+e3.id+ " Name : "+e3.name + " CompanyName "+e3.companyName);

    }
}
