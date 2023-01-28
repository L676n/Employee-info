
package assignment6;

public class Employee {
    
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    
     public Employee(String nam, int idNum, String depart, String posi){
        name= nam;
        idNumber = idNum;
        department = depart;
        position = posi;
    }
  
     public Employee(String nam, int idNum){
        name= nam;
        idNumber = idNum;
        department = "";
        position = "";
     }
     
     public Employee(){
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }
     
   
    
    public void setname(String givennam){
        
        name = givennam;
    }
    
    public void setIDNumber(int givenidNum){
        
        idNumber = givenidNum;
    }
    
    public void setdepartment(String givendepart){
        
        department = givendepart;
    }
    
    public void setposition(String givenposi){
        
        position = givenposi;
    }
    
    
    
    
    public String getname(){
        return name;
    } 
    
    public int getIDnumber(){
        return idNumber;
    }
    
    public String getDepartment(){
        return department;
    }
    
    public String getPosition(){
        return position;
    }
}




