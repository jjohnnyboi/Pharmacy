package pharmacysystem;

import java.util.*;
import java.io.*;
/**
 *
 * @author jmcka
 */
public class Report {
    private Product product;
    
    public Report(Product product){
        this.product = product;
    }
    public static Product getMostPurchased() {
        ArrayList<Product> productList = Admin.readAllProducts();
        int max = productList.get(0).purchasedTimes;
        int maxIndex = 0;
        for (int i = 1; i < productList.size(); i++) {
            if (productList.get(i).purchasedTimes > max) {
                max = productList.get(i).purchasedTimes;
                maxIndex = i;
            }
        }
        fileSave.saveFile("drugs", productList);
        return productList.get(maxIndex);
    }
}
