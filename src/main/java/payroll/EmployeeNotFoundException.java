package payroll;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(Long id){
        super("Couldn't find Employee having the id " +id);
    }
}
