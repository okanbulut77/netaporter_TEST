package com.netaporter.shop;

import com.netaporter.model.Product;
import com.netaporter.service.ProductService;

import java.util.List;

public class NetAPorterShop {

    // Feature branch doesn't have constructor

    ProductService productService = new ProductService();
    BasketManagement basketManagement = new BasketManagement();

    public void loadProducts() {
        // TODO Exercise 1a - Parsing the product-data.csv data file
        //System.out.println("Load Products Not Implemented");
        productService.loadProducts();
    }

    public void listProducts() {
        // TODO Exercise 1b - Listing products
        System.out.println("List Products Not Implemented");
        List<Product> products = productService.listProdcut();
        products.stream().forEach(
                p -> System.out.println(p.getProductId() + " " + p.getName() + " " + p.getPrice())
        );
    }

    /**
     * Add a product to the Basket
     */
    public void addProductToBasket(String productId) {
        // TODO Exercise 2a - feature to add Products to the basket

        Product product = productService.getProduct(productId);
        if (product != null){
            System.out.println("Product with Id: " + productId + " added to the basket");
            basketManagement.addToBasket(product);
        } else {
            System.out.println("No product with  Id: " + productId);
        }
    }

    /**
     * Remove a product from the Basket
     */
    public void removeProductFromBasket(String productId) {
        // TODO Exercise 2b - feature to remove Products from the basket

        Product product = productService.getProduct(productId);
        if (product != null) {
            basketManagement.removeFromBasket(productId);
        } else {
            System.out.println("No product with  Id: " + productId);
        }
    }

    /**
     * Return the total value of the products in the basket
     */
    public void getTotal() {
        // TODO Exercise 2c - feature to show the total value of Products in the basket
        System.out.println("Get Total Not Implemented");

    }

}
