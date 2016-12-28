package ListCreator;

import Customer.CustomerList;
import Products.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-27.
 */
public class CustomerListCreator {

    public CustomerList createCustomerList(){

        Cloth cloth0 = new Cloth("Sweter", 69.90);
        Cloth cloth1 = new Cloth("KALESONY", 49.90);
        Food food0 = new Food("WAFLE RYŻOWE",0.80);
        Food food1 = new Food("Cebula",0.36);


        List<Product> productListCustomer =  new ArrayList<>();

        productListCustomer.add(food0);
        productListCustomer.add(food1);
        productListCustomer.add(cloth0);
        productListCustomer.add(cloth1);

        return new CustomerList(productListCustomer);

    }
}
