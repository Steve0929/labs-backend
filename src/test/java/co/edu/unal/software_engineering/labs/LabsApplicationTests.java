package co.edu.unal.software_engineering.labs;

import co.edu.unal.software_engineering.labs.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LabsApplicationTests{

	@Test
	public void contextLoads( ){
		LabsApplication.main( new String[]{ } );
	}

	@Test
	public void testUserMethodsSuccess() {
		User testuser = new User();
		String expected = "Esteban";
		testuser.setNames(expected);
		String result = testuser.getNames();
		assertEquals(result, expected);
	}
}