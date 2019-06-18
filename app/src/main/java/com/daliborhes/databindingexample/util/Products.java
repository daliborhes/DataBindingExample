package com.daliborhes.databindingexample.util;

import com.daliborhes.databindingexample.R;
import com.daliborhes.databindingexample.models.Product;

import java.util.HashMap;

/**
 * Created by Dalibor J. Stanković on 18.06.2019.
 */

public class Products {


    public Product[] PRODUCTS = {RED_LAMP, YELLOW_LAMP, BLUE_MUG, WHITE_MUG, RED_MUG, BLACK_HAT};

    public HashMap<String, Product> PRODUCT_MAP = new HashMap<>();

    public Products() {
        for (Product product: PRODUCTS) {
            PRODUCT_MAP.put(String.valueOf(product.getSerialNumber()), product);
        }
    }

    private static final Product RED_LAMP = new Product("Red Lamp", "Red colored lamp, perfect for lighting up a room ",
            R.drawable.red_lamp, "https://cdn.lights.co.uk/image/1800x/philippe-starck-table-lamp-miss-k-in-red-3510014-31.jpg", "599.99", 7725832);
    private static final Product YELLOW_LAMP = new Product("Yellow Lamp", "Yellow colored lamp, perfect for lighting up a room ",
            R.drawable.yellow_lamp, "https://cdn.habitat.co.uk/media/catalog/product/cache/1/image/641x/9df78eab33525d08d6e5fb8d27136e95/3/3/336159.jpg", "699.99", 3298541);
    private static final Product BLUE_MUG = new Product("Blue Mug", "Blue colored mug, perfect for drinking coffee ",
            R.drawable.blue_mug, "https://images-na.ssl-images-amazon.com/images/I/61B56RzqrcL._SX466_.jpg", "499.99", 9825743);
    private static final Product WHITE_MUG = new Product("White mug", "White colored mug, perfect for drinking coffee ",
            R.drawable.white_mug, "https://images-na.ssl-images-amazon.com/images/I/71jMZuJU42L._SL1500_.jpg", "789.99", 5987259);
    private static final Product RED_MUG = new Product("Red mug", "Red colored mug, perfect for drinking coffee ",
            R.drawable.red_mug, "https://images-na.ssl-images-amazon.com/images/I/41eDfLEkmfL._SX466_.jpg", "629.99", 1597535);
    private static final Product BLACK_HAT = new Product("Black Hat", "Black colored hat, perfect for wearing outside ",
            R.drawable.black_hat, "https://di2ponv0v5otw.cloudfront.net/posts/2018/07/13/5b48d9846a0bb7aa1ca674c7/m_5b48d9949539f71b38368186.jpg", "539.99", 1478963);
}
