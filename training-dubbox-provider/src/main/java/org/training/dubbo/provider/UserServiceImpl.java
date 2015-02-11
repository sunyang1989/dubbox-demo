package org.training.dubbo.provider;

import java.util.ArrayList;
import java.util.List;

import org.training.dubbo.api.User;
import org.training.dubbo.api.UserService;

import com.alibaba.dubbo.config.annotation.Service;
@Service(protocol = {"rest"}, group = "annotationConfig", validation = "false")
public class UserServiceImpl implements UserService {

	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		User user = new User();
		user.setId(1);
		user.setName("Percy Mutils");
		users.add(user);
		return users;
	}

	@Override
	public User get(Integer id) {
		User user = new User();
		user.setId(1);
		user.setName("Percy Single");
		return user;
	}

}
