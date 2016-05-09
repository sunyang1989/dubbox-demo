package org.training.dubbo.provider;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import org.training.dubbo.api.User;
import org.training.dubbo.api.UserService;

@Path("user")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class UserServiceImpl implements UserService {

	@GET
	@Path("findAll")
	public List<User> findAll() {
		List<User> users = new ArrayList<>();
		User user = new User();
		user.setId(1);
		user.setName("Sun Yang");
		users.add(user);
		return users;
	}

	@GET
	@Path("{id : \\d+}")
	public User get(@PathParam("id") Long id) {
		User user = new User();
		user.setId(id.intValue());
		user.setName("Sun Yang");
		return user;
	}

}
