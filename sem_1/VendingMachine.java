package sem_1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> productList = new ArrayList<>();

    private Double money = 0.0;

    public void printList(){
        for (Product prod : this.getProductList()){
            System.out.println(prod);
        }
    }

    public Double getMoney() {
        return money;  
    }

    public List<Product> getProductList(){
        return productList;
    }

    public void addProduct(Product product){
        this.productList.add(product);
    }

    public Product getProductByName(String name){
        for (Product product : productList){
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    public Product buy(String name, Double cost){
        Product something = getProductByName(name);
        if (something == null)
        return null; 
        if (cost.equals(something.getCost())){
            productList.remove(something);
            money += cost;
            return something;
        }
        return null;
    }

    @Override
    public String toString() {
        String text = "";
        for (Product product : productList){
            text += product.toString() + "\n";
        }
        return text;
    }
}
