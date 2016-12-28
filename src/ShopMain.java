import Analizers.ListAnalizer;
import Customer.CustomerList;
import ListCreator.ShopListCreator;
import Products.*;

/**
 * Created by Cyprian on 2016-12-26.
 */
public class ShopMain {

    public static void main(String[] args) {

      // ShopList shopList = new ShopList();
      // shopList.showShopList();
      // CustomerList customerList = new CustomerList();
      // customerList.showCustomerList();
        ListAnalizer listAnalizer = new ListAnalizer();
        listAnalizer.compareList();
    }
}
