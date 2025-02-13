package multileveluniversitycoursemanagementsystem;

import java.util.List;
import com.multileveluniversitycoursemanagementsystem.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UniversityCourseManagementTest {
	// Test that AssignmentCourse is correctly added and retrieved
	@Test
	public void testOfAssignmentCourse() {
		// Creating an AssignmentCourse with a name and duration
		AssignmentCourse webDevelopment = new AssignmentCourse("Java Development", 5);

		// Creating a Course object for Information Technology and adding the assignment course to it
		Course<AssignmentCourse> itAssignmentCourse = new Course<>("Information Technology", webDevelopment);
		itAssignmentCourse.addCourse(webDevelopment);

		// Expected course list containing "Java Development"
		List<String> assignmentCourse = List.of("Java Development");

		// Checking if the added course matches the expected list
		assertEquals(assignmentCourse, itAssignmentCourse.getCourseList().stream().map(item -> item.courseName).toList());
	}

	// Test that ExamCourse is correctly added and retrieved
	@Test
	public void testOfExamCourse() {
		// Creating an ExamCourse with a name and total marks
		ExamCourse dataStructures = new ExamCourse("Designing of Algorithms", 70);

		// Creating a Course object for Computer Science and adding the exam course to it
		Course<ExamCourse> csExamCourse = new Course<>("Computer Science", dataStructures);
		csExamCourse.addCourse(dataStructures);

		// Expected course list containing "Designing of Algorithms"
		List<String> CsExamCourse = List.of("Designing of Algorithms");

		// Checking if the added course matches the expected list
		assertEquals(CsExamCourse, csExamCourse.getCourseList().stream().map(item -> item.courseName).toList());
	}

	// Test that ResearchCourse is correctly added and retrieved
	@Test
	public void testOfResearchCourse() {
		// Creating a ResearchCourse with a name and research topic
		ResearchCourse aiResearch = new ResearchCourse("Data Science", "Machine Learning Applications");

		// Creating a Course object for Artificial Intelligence and adding the research course to it
		Course<ResearchCourse> aiResearchCourse = new Course<>("Artificial Intelligence", aiResearch);
		aiResearchCourse.addCourse(aiResearch);

		// Expected course list containing "Data Science"
		List<String> aiResearchCourseList = List.of("Data Science");

		// Checking if the added course matches the expected list
		assertEquals(aiResearchCourseList, aiResearchCourse.getCourseList().stream().map(item -> item.courseName).toList());
	}
}
