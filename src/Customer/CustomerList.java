package Customer;

import ListCreator.CustomerListCreator;
import ListCreator.ShopListCreator;
import Products.*;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-27.
 */
public class CustomerList {

    private List<Product> cutomerList;

    public CustomerList(List<Product> cutomerList) {
        this.cutomerList = cutomerList;
    }

    public CustomerList() {
    }

    public List<Product> getCutomerList() {
        return cutomerList;
    }

    public void showCustomerList(){

        CustomerListCreator customerListCreator = new CustomerListCreator();
        CustomerList customerList = customerListCreator.createCustomerList();
        System.out.println("Lista klienta:");
        for (Product product : customerList.getCutomerList()) {
            if (product instanceof Food)
            System.out.println(((Food)product).getName());
            if(product instanceof Cloth)
                System.out.println(((Cloth)product).getName());
        }










    }
}
