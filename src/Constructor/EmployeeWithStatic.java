package Constructor;

public class EmployeeWithStatic {
    int id;
    String name;
    static String companyName;
    EmployeeWithStatic (int eid , String nm, String cname){
        id = eid;
        name = nm;
        companyName = cname;
    }

}
class EmployeeWithStaticIMPL{
    public static void main(String[] args) {
//             EmployeeWithStatic.companyName = "IBM";
        EmployeeWithStatic e1 = new EmployeeWithStatic(1,"Amit", "Codekul");
        EmployeeWithStatic e2 = new EmployeeWithStatic(2,"Nikita", "IBM");
        EmployeeWithStatic e3 = new EmployeeWithStatic(3,"Ekanath", "IBM");

        System.out.println(" ID: "+e1.id+ " Name : "+e1.name + " CompanyName "+e1.companyName);
        System.out.println(" ID: "+e2.id+ " Name : "+e2.name + " CompanyName "+e2.companyName);
        System.out.println(" ID: "+e3.id+ " Name : "+e3.name + " CompanyName "+e3.companyName);

    }
}