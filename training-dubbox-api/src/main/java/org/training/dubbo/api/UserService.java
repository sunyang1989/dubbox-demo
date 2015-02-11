package org.training.dubbo.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("user")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
public interface UserService {
	/**
	 * 获取所有用户
	 * 
	 * @return所有用户
	 */
    @GET
    @Path("findAll")
	List<User> findAll();

	/**
	 * 获取特定用户
	 * 
	 * @param id
	 *            用户标识
	 * 
	 * @return 特定用户
	 */
    @GET
    @Path("/${id}")
	User get(Integer id);
}
