import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.datajpa.model.User;
import com.spring.datajpa.service.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class UserServiceImplTest {
	
	@Autowired
	private UserServiceImpl userService;
	
//	@Test
//	public void findAll_shouldBeTrue_whenUsersEmpty() {
//		
//		boolean result = false;
//		List<User> users = userService.findAll();
//		
//		if (users.isEmpty()) {
//			result = true;
//		}
//		
//		Assert.assertTrue(result);
//	}
//	
//	@Test
//	public void findAll_shouldBeFalse_whenUsersNotEmpty() {
//		
//		boolean result = false;
//		List<User> users = userService.findAll();
//		
//		if (users.isEmpty()) {
//			result = true;
//		}
//		
//		Assert.assertFalse(result);
//	}
	
	@Test
	public void findAllByPagin_shouldBeTrue_whenUsersEmpty() {
		
		boolean result = false;
		Page<User> users = userService.findAllByPagination();
		
		if (users.getTotalElements() == 0) {
			result = true;
		}
		
		Assert.assertTrue(result);
	}
	
}