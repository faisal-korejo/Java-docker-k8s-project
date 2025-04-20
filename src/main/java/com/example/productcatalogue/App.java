package com.example.productcatalogue;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class App extends Application<ProductCatalogueConfiguration> {
    public static void main(String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public void run(ProductCatalogueConfiguration config, Environment env) {
        ProductService productService = new ProductService();
        ProductResource productResource = new ProductResource(productService);
        env.jersey().register(productResource);
    }
}