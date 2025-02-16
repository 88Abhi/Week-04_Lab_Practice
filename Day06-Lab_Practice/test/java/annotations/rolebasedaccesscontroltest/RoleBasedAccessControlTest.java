package annotations.rolebasedaccesscontroltest;

import com.annotations.rolebasedaccesscontrol.RoleAllowed;
import com.annotations.rolebasedaccesscontrol.SecureService;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

// Class to test custom annotation
class RoleBasedAccessControlTest {
	// Method to test role based annotation
	@Test
	void testRoleAllowedAnnotation() throws Exception {
		Method method = SecureService.class.getMethod("restrictedOperation");
		RoleAllowed annotation = method.getAnnotation(RoleAllowed.class);

		// Ensure annotation is present
		assertNotNull(annotation);
		// Ensure only ADMIN has access
		assertEquals("ADMIN", annotation.value());

		System.out.println("Successfully tested RoleAllowed annotation");
	}
}
