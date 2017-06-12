package com.android.habhab.constant;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.android.habhab.model.Category;
import com.android.habhab.model.Product;

public final class Constant {
    public static final List<Integer> QUANTITY_LIST = new ArrayList<Integer>();

    static {
        for (int i = 1; i < 11; i++) QUANTITY_LIST.add(i);
    }

    public static final Product PRODUCT1 = new Product(1, "Nike Flyknit Racer", BigDecimal.valueOf(799.996), "Nike ini keluar atau di luncurkan pada tahun 2017", "sneakers2");
    public static final Product PRODUCT2 = new Product(2, "Nike Kyrie 3", BigDecimal.valueOf(699.996), "Nike ini keluar atau di luncurkan pada tahun 2017", "sneakers3");
    public static final Product PRODUCT3 = new Product(3, "Nike Kobe AD", BigDecimal.valueOf(899.996), "Nike ini keluar atau di luncurkan pada tahun 2017", "sneakers4");
    public static final Product PRODUCT4 = new Product(4, "Nike KD 9", BigDecimal.valueOf(599.996), "Nike ini keluar atau di luncurkan pada tahun 2017", "sneakers5");


    public static final Category CATEGORY1 = new Category(1, "Sneakers", BigDecimal.valueOf(199.996), "Beragam Product dari sepatu Sneakers 2017", "snakers1");
    public static final Category CATEGORY2 = new Category(1, "Flanel", BigDecimal.valueOf(199.996), "Beragam Product dari Flanel 2017", "flanel1");

    public static final List<Category> CATEGORY_LIST = new ArrayList<Category>();
    public static final List<Product> PRODUCT_LIST = new ArrayList<Product>();

    static {
        CATEGORY_LIST.add(CATEGORY1);
        CATEGORY_LIST.add(CATEGORY2);
    }
    static {
        PRODUCT_LIST.add(PRODUCT1);
        PRODUCT_LIST.add(PRODUCT2);
        PRODUCT_LIST.add(PRODUCT3);
        PRODUCT_LIST.add(PRODUCT4);
    }

    public static final String CURRENCY = "$";
}
