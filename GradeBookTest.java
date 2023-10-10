import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest 
{
	private GradeBook gradebook1;
	private GradeBook gradebook2;
	
	@BeforeEach
	void setUp() throws Exception
	{
		gradebook1 = new GradeBook(5);
		gradebook2 = new GradeBook(5);
		
		gradebook1.addScore(25.37);
		gradebook1.addScore(67.20);
		
		gradebook2.addScore(98.45);
		gradebook2.addScore(50.00);
		
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		gradebook1 = null;
		gradebook2 = null;
	}

	@Test
	void testAddScore() {
		//fail("Not yet implemented");
        assertTrue(gradebook1.toString().contains("25.37"));
        assertTrue(gradebook1.toString().contains("67.2"));
        
        assertEquals(2, gradebook1.getScoreSize());
        
        assertTrue(gradebook2.toString().contains("98.45"));
        assertTrue(gradebook2.toString().contains("50.0"));
        
        assertEquals(2, gradebook2.getScoreSize());
	}

	@Test
	void testSum() {
		//fail("Not yet implemented");
		assertEquals(92.57, gradebook1.sum(), 0.01);
        assertEquals(148.45, gradebook2.sum(), 0.01);
	}

	@Test
	void testMinimum() 
	{
		//fail("Not yet implemented");
		assertEquals(25.37, gradebook1.minimum(), 0.01);
        assertEquals(50.0, gradebook2.minimum(), 0.01);
	}

	@Test
	void testFinalScore() 
	{
		//fail("Not yet implemented");
		assertEquals(67.2, gradebook1.finalScore(), 0.01);
        assertEquals(98.45, gradebook2.finalScore(), 0.01);
	}

	@Test
	void testGetScore() 
	{
		//fail("Not yet implemented");
	}

	@Test
	void testToString() 
	{
		//fail("Not yet implemented");
	}

}
