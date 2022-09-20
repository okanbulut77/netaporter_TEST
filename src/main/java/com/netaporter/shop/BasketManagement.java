package com.netaporter.shop;

import com.netaporter.model.BasketItem;
import com.netaporter.model.Product;

import java.util.ArrayList;
import java.util.List;

public class BasketManagement {
    public static List<BasketItem> basketItems = new ArrayList<>();
    public List<BasketItem> addToBasket(Product product){
        boolean existInBasket = false;
        for (BasketItem basketItem:basketItems){
            if (basketItem.product.getProductId().equals(product.getProductId())) {
                basketItem.productCount = basketItem.productCount + 1;
                existInBasket = true;
            }
        }
        if (!existInBasket){
            BasketItem basketItem = new BasketItem();
            basketItem.product = product;
            basketItem.productCount = 1;
            basketItems.add(basketItem);
        }
        System.out.println("Basket Items : " + basketItems);
        return basketItems;
    }

    public void removeFromBasket(String productId){
        for(BasketItem basketItem:basketItems){
            if (basketItem.product.getProductId().equals(productId)){
                if(basketItem.produc)
            }
        }
    }
}
