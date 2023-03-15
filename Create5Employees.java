
/**
 * 
 * Create 5 employees and set up a
 * reporting structure
 * 
 */
public class Create5Employees
{
    public static void main(String[] args){
        //
        // create 5 employees
        Employee john = new Employee(); 
        john.setFirstName("John");
        john.setLastName("Smith");
        
        Employee peter = new Employee();  
        peter.setFirstName("Peter");
        peter.setLastName("Jones");
        
        Employee susan = new Employee();  
        susan.setFirstName("Susan");
        susan.setLastName("Darwin"); 
        
        Employee tom = new Employee();   
        tom.setFirstName("Tom");
        tom.setLastName("Evans");
        
        Employee april = new Employee();   
        april.setFirstName("April");
        april.setLastName("Barnes");
        
        //
        // set the supervisors for 
        // john, peter, susan, and tom
        john.setSupervisor(peter);
        peter.setSupervisor(susan);
        susan.setSupervisor(tom);
        tom.setSupervisor(april);
        //
        // display Peter's supervisor
        Employee aSuper = peter.getSupervisor();
        System.out.println(aSuper.getFirstName()+" "+aSuper.getLastName());
        
        //or
        System.out.print(peter.getSupervisor().getFirstName());
        System.out.print(" " +peter.getSupervisor().getLastName());
    }
}
