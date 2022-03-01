package compulsoryLabTwo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//please comment out the assertEquals that you dont use

class StackJUnitTest {

	private ADTStack<Integer> stack1;

	@BeforeEach
	void setUp() throws Exception {
		stack1 = new LLStack<Integer>();
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		assertEquals( 30, stack1.pop(), "remove failed");
		//assertEquals( 20, stack1.pop(), "remove failed");
	}

}
