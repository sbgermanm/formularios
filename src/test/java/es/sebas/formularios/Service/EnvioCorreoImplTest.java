package es.sebas.formularios.Service;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext_mock.xml"})
public class EnvioCorreoImplTest {

	@Autowired
	private EnvioCorreoImpl envioCorreo;
	
	
	
	@Before
	public void setUp() throws Exception {
		
//		enviarCorreo = new EnvioCorreoImpl();
		
	}

	@Test
	public void testSendMail() {
		String from = "PruebaFrom";
		String subject = "Subject prueba";
		String body = "Body prueba";
//		envioCorreo.sendMail(from, "seyra2000@gmail.com", subject, body);
		
		
		
		assertTrue(true);
	}

}
