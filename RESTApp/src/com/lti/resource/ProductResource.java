package com.lti.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lti.dao.ProductDao;
import com.lti.entity.Product;

@Path("/product") //Annotations for creating web services
public class ProductResource {

	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Product get(@PathParam("id") int id) {
		ProductDao dao = new ProductDao();
		return dao.select(id);
	}
	
	@Path("/all") 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getAll() {
		ProductDao dao = new ProductDao();
		return dao.selectAll();
	}
}