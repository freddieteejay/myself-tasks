api.Assertions.assertArrayEquals;
public class SortingTest{import org.junit.jupiter.api.test;
import static org.junit.jupiter.
		@Test
		public void testFor sort(){
		int ans = PlayArray.number({2, 9, 3, 1, 6});
		int expectedAns = [1, 2, 3, 6, 9];
		// assertion
		assertArrayEquals(expectedAns, ans);


		}