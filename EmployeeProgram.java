
package assignment6;

public class EmployeeProgram {

    public static void main(String[] args) {
        
        
        
        
        Employee first = new Employee("Joy Rogers", 81774,
                                      "Manufacturing ", "Engineer ");
        Employee second = new Employee("Mark Jones", 39119);
        Employee third = new Employee();
        
        second.setdepartment("IT");
        second.setposition("        Programmer");
        
        
        third.setname("Joy Rogers");
        third.setIDNumber(81774);
        third.setdepartment("Manufacturing");
        third.setposition("Engineer");
        
        
        System.out.println("Name\t\t\tID Number\tDepartment\t\tPosition");
        System.out.println("------------------------------------------------------------------------");
        System.out.println(first.getname() + "\t\t" + first.getIDnumber()
               + "\t\t" + first.getDepartment() + "\t\t" + first.getPosition());
        System.out.println(second.getname() + "\t\t" + second.getIDnumber() 
               + "\t\t" + second.getDepartment() + "\t\t" + second.getPosition());
        System.out.println(third.getname() + "\t\t" + third.getIDnumber() 
               + "\t\t" + third.getDepartment() + "\t\t" + third.getPosition());
    }
    
}
