package multiply.com.pe.dto;
 

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test; 
 
public class ResponseTest {

	public ResponseTest() {
		super();
	}
	
	@Test
	public void InstanceObject() {
		double result=100;
		String comment="Test Comment";
		
		Response set=new Response();
		set.setComment(comment);
		set.setResult(result);
		
		Response get=new Response();
		get.setComment(set.getComment());
		get.setResult(set.getResult());
		
		assertNotNull(set);
		assertNotNull(get);
		assertEquals(set.getComment(), get.getComment());
		
	}
	
	@Test
	public void InstanceObjectParams() {
		double result=100;
		String comment="Test Comment";
		
		Response get=new Response(result,comment); 
		
		Response out=new Response(get.getResult(),get.getComment());
		 
		
		assertNotNull(out);
		assertNotNull(get);
		assertEquals(out.getComment(), out.getComment());
		
	}

}
