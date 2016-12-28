package Products;

import ListCreator.ShopListCreator;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-26.
 */
public class ShopList {

    private List<Product> shopList;

    public ShopList(List<Product> shopList) {
        this.shopList = shopList;
    }

    public ShopList() {
    }

    public List<Product> getShopList() {
        return shopList;
    }

    public void showShopList(){

        ShopListCreator shopListCreator = new ShopListCreator();
        ShopList shopList = shopListCreator.createShopList();
        System.out.println("Lista rzeczy w sklepie:");
        for (Product product : shopList.getShopList()) {
            if (product instanceof Food)
                System.out.println(((Food)product).getName());
            if(product instanceof Cloth)
                System.out.println(((Cloth)product).getName());
        }

    }
}
