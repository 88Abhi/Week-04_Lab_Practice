package mapinterfaceproblems;

import com.mapinterfaceproblems.groupobjectsbyproperty.Employee;
import com.mapinterfaceproblems.groupobjectsbyproperty.EmployeeGrouping;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Defining the test class to verify grouping of Employee objects by department
public class GroupObjectByPropertyTest {
	// Test method to validate that employees are grouped correctly by department
	@Test
	public void testGroupObjectByProperty() {
		// Creating a list of Employee objects with names and department information
		List<Employee> userInputList = List.of(
			   new Employee("Vinay", "TR"),
			   new Employee("Abhishek", "TR")
		);

		// Calling the grouping method to get the actual result
		Map<String, List<Employee>> actualResult = EmployeeGrouping.groupByDepartment(userInputList);
		Map<String, List<Employee>> expectedResult = new HashMap<>();

		// Populating the expected result with employees grouped by department
		expectedResult.put("TR", List.of(
			   new Employee("Vinay", "TR"),
			   new Employee("Abhishek", "TR")
		));

		// Asserting that the actual grouped department keys match the expected keys
		assertEquals(expectedResult.keySet(), actualResult.keySet(), "Grouping by department failed!");
	}
}
