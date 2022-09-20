package com.netaporter.service;

import com.netaporter.model.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
    public static final List<Product> productList = new ArrayList<Product>();
    public List<Product> loadProducts() {
// create a reader

        try {

            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/product-data.csv"));
            // CSV file delimiter
            String DELIMITER = ",";

            // read the file line by line
            String line;
            //Skip first header line
            br.readLine();
            while ((line = br.readLine()) != null) {
                Product product = new Product();
                // convert line into columns
                String[] columns = line.split(DELIMITER);
                product.setProductId(columns[0]);
                product.setName(columns[1]);
                product.setPrice(Double.parseDouble(columns[2].trim().substring(1)));
                // print all columns
                this.productList.add(product);
                System.out.println(columns[0]);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return productList;
    }

    public List<Product> listProdcut(){
        return productList;
    }

    public Product getProduct(String productId){
        List<Product> listOfProducts =  productList.stream().filter(p -> p.getProductId().equals(productId)).collect(Collectors.toList());
        if (listOfProducts.size()>0)
            return listOfProducts.get(0);
        else
            return null;
    }
}
