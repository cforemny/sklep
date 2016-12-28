package ListCreator;

import Products.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-26.
 */
public class ShopListCreator  {


    public ShopList createShopList(){

        Cloth cloth0 = new Cloth("Sweter", 69.90);
        Cloth cloth1 = new Cloth("Bluza", 49.90);
        Cloth cloth2 = new Cloth("T shirt", 19.90);
        Cloth cloth3 = new Cloth("Jeansy", 149.90);

        Food food0 = new Food("Ziemniak",0.80);
        Food food1 = new Food("Cebula",0.36);
        Food food2 = new Food("Wołowina",19.00);
        Food food3 = new Food("Chleb",3);

        List<Product> productListShop =  new ArrayList<>();

        productListShop.add(food0);
        productListShop.add(food1);
        productListShop.add(food2);
        productListShop.add(food3);
        productListShop.add(cloth0);
        productListShop.add(cloth1);
        productListShop.add(cloth2);
        productListShop.add(cloth3);

        return new ShopList(productListShop);

    }
}
