package regularexpressions.validateanipaddresstest;

import com.regularexpressions.validateanipaddress.IPAddressValidator;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IPAddressValidatorTest {
    // Method to test the ip address validation
    @Test
    void testIPAddressValidation() {
        // List of valid IP addresses that should pass validation
        List<String> validIPs = Arrays.asList(
            "192.168.1.1",
            "255.255.255.255",
            "0.0.0.0",
            "127.0.0.1",
            "172.16.0.1"
        );

        // List of invalid IP addresses that should fail validation
        List<String> invalidIPs = Arrays.asList(
            "256.100.50.25",
            "192.168.300.1",
            "192.168.1",
            "192.168.1.1.1",
            "abcd.efgh.ijkl.mnop",
            "192.168.-1.1"
        );

        // Checking if all valid IP addresses pass the validation test
        for (String ip : validIPs) {
            assertTrue(IPAddressValidator.isValidIPAddress(ip), "Failed for valid IP: " + ip);
        }

        // Checking if all invalid IP addresses fail the validation test
        for (String ip : invalidIPs) {
            assertFalse(IPAddressValidator.isValidIPAddress(ip), "Failed for invalid IP: " + ip);
        }
    }
}
