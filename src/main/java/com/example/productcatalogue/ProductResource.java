package com.example.productcatalogue;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {
    private final ProductService service;

    public ProductResource(ProductService service) {
        this.service = service;
    }

    @GET
    public List<Product> getAll() {
        return service.getAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addProduct(Product product) {
        service.add(product);
    }

    @GET
    @Path("/{id}")
    public Product getById(@PathParam("id") String id) {
        return service.get(id);
    }
}