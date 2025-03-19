
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
        // note the double dot operator
        System.out.print(peter.getSupervisor().getFirstName());
        System.out.print(" " +peter.getSupervisor().getLastName());
        
        System.out.print(peter.getSupervisor().getSupervisor().getFirstName());
        System.out.print(" " +peter.getSupervisor().getSupervisor().getLastName());
        // work through the list recursively
        System.out.println("\n\nSupervisor List");
        printSupervisors(john);
        
        System.out.println("\n\nSupervisors 2");
        
        /* how does the following code produce the
         * output it does? Remember it prints 
         * Employee: John supervised by Employee: Peter supervised by 
         * Employee: Susan supervised by Employee: 
         * Tom supervised by Employee: April supervised by null
         * 
         * all on one line.
         * 
         * Printing the "Employee: John supervised by Employee:"
         * is not hard to figure out. Looking at the toString()
         * method in Employee we see where this comes from.
         * 
         * but why does it stop with April saying
         * "supervised by null"?
         * 
         * The last bit of toString() is "+ this.supervisor"
         * when we get to April her supervisor field is set to
         * null so there is no toString() to call on as there
         * is no Employee object being referenced.
         * 
         * Even when we take the supervisor = null; out of the
         * constructor it works, apparently the Employee
         * variable is null by default
         * 
         * Also, why does the " ha " in the supervisors method
         * never print? Well, same as above. Once we get 
         * to April there is no Employee object being
         * referenced to e.stoString() results in null
 
         */ 
        System.out.println(supervisors(john));        
        System.out.println(john);
    }
    
    public static String supervisors(Employee e){
        if(e.getSupervisor() == null){
            return " ha " + e.toString();
        }
        
        return e.toString() + "\n";
    }
    /* recursive thought process for print the list of supervisors
     * smaller versions: print the first employee's supervisor and the list of
     *                      all the other supervisors
     * what's the base case: when the supervisor field is null
     * what's the general/recursive case: print the list of supervisors 
     *                      of employee's suprevisor
     * 
     */
    public static void printSupervisors(Employee e){
        if(e.getSupervisor() == null){
            System.out.println(e.getFirstName() + " Is The Boss");
        }
        else{
            System.out.print(e.getFirstName() + " is supervised by ");
            System.out.println(e.getSupervisor().getFirstName());
            printSupervisors(e.getSupervisor());
        }
    }
}
