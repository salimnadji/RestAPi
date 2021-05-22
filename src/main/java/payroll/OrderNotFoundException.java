package payroll;

public class OrderNotFoundException extends RuntimeException{
    public OrderNotFoundException(Long id) {
        super("There's no such order with the id :"+id);
    }
}
