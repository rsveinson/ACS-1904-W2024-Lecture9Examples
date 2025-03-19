/**
 * The Employee class
 * that implements the recursive association
 * "an employee reports to another employee"
 */
public class Employee
{
    /* Employee 'has a' Employee as one of its fields
     * Employee refers to itself so it's recursive
     */
    private Employee supervisor;       
    private String firstName;
    private String lastName;
    
    public Employee()
    {
        firstName="unknown";
        lastName="unknown";
        supervisor = null;
    }
    // getters
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public Employee getSupervisor(){
        return supervisor;
    }
    
    // setters
    public void setFirstName(String first){
        firstName = first;
    }
    
    public void setLastName(String last){
        lastName = last;
    }
    
    /* set the supervisor Employee object */
    public void setSupervisor(Employee s){
        supervisor = s;
    }
    
    @Override
    public String toString(){
        return "Employee: " + firstName + " supervised by " 
        + this.supervisor + "\n";
    }
}
