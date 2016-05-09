package org.training.dubbo.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

@Path("user")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
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
	@Path("{id : \\d+}")
	User get(@PathParam("id") Long id);
}
