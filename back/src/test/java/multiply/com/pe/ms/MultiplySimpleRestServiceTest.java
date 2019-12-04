package multiply.com.pe.ms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import multiply.com.pe.dto.MultiplyDto;
import multiply.com.pe.dto.Response;
import multiply.com.pe.service.MultiplyService;
 
@RunWith(MockitoJUnitRunner.class)
public class MultiplySimpleRestServiceTest {

	@InjectMocks
	MultiplySimpleRestService multiplySimpleRestService;

	@Mock
	MultiplyService multiplyService;
	
	@Test
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	/*
	 * Reponse 0.0
	 */
	@Test
	public void AccesoControllerTests()  {	
		String EMPTY="",param_one="50",param_two="2";  
		Response respose=multiplySimpleRestService.multiply(param_one,param_two);		
		 assertNotNull(respose);
		 System.out.println(respose.getResult());
		 assertEquals(respose.getResult()+EMPTY, "0.0");
//
	}

}
