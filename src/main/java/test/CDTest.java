package test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import test.config.BeanConfig;

import javax.inject.Inject;

/**
 * Created by jackie on 2/15/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeanConfig.class)
public class CDTest {

	private CD cd;
	@Inject
	private CD1 cd1;

	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
		assertNotNull(cd1);
		cd.printCd();
		cd1.printCd();
	}

}
