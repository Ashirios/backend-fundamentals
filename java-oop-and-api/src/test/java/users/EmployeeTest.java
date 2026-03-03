package users;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.example.users.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;






public class EmployeeTest {

    private Employee employee;

    @BeforeEach
    public void setUp() {
        employee = new Employee("Alice", "Female", 28);
    }

    @Test
    public void testEmployeeClassExists(){
        assertTrue(employee instanceof Employee);
        assertEquals("Alice",employee.getName());
        System.out.println("Employee class exists and instance created successfully.");
    }





    
}
