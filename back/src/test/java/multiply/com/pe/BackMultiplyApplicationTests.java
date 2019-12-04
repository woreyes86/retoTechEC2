package multiply.com.pe;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BackMultiplyApplicationTests {

	@Test
	public void contextLoads() {
		BackMultiplyApplication application = new BackMultiplyApplication();
		assertNotNull(application);
	}

}
