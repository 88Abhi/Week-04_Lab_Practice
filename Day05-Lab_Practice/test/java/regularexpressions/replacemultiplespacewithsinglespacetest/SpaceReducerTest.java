package regularexpressions.replacemultiplespacewithsinglespacetest;

import com.regularexpressions.replacemultiplespaceswithsinglespace.SpaceReducer;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpaceReducerTest {
    // Method to test Multiple space replacements
    @Test
    void testReplaceMultipleSpaces() {
        // List of test cases with input strings containing extra spaces
        List<String> inputTexts = Arrays.asList(
            "This    is   Abhishek Jat performing   junit   testing.",
            " In this it remove multiple space with  single     Leading and trailing space   ",
            "SingleWord",
            "NoExtraSpacesHere"
        );

        // Expected output after reducing multiple spaces
        List<String> expectedOutputs = Arrays.asList(
            "This is Abhishek Jat performing junit testing.",
            "In this it remove multiple space with single Leading and trailing space",
            "SingleWord",
            "NoExtraSpacesHere"
        );

        // Checking if the transformed output matches the expected result
        for (int i = 0; i < inputTexts.size(); i++) {
            assertEquals(expectedOutputs.get(i), SpaceReducer.replaceMultipleSpaces(inputTexts.get(i)), "Failed for input: '" + inputTexts.get(i) + "'");
        }
        System.out.println("All test case success fully passed");
    }
}
