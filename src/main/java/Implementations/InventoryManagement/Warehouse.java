package Implementations.InventoryManagement;

import Implementations.InventoryManagement.Products.ProductCategory;
import Implementations.InventoryManagement.Products.ProductDetails;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private int number;
    List<ProductDetails> products = new ArrayList<>();

    public Warehouse(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<ProductDetails> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDetails> products) {
        this.products = products;
    }

    public void addProduct(ProductDetails productDetails){
        products.add(productDetails);
    }

    public void removeProduct(ProductDetails productDetails){
        products.remove(productDetails);
    }

    public void replaceProduct(ProductDetails prev,ProductDetails curr){
        products.remove(prev);
        products.add(curr);
    }

    public ProductDetails buyProduct(String name, ProductCategory productCategory){
        products.forEach(product -> {
            if(name.equalsIgnoreCase(product.getName()) && productCategory == product.getProductCategory() && product.getQuantity() > 0) {
                product.setQuantity(product.getQuantity() - 1);
                product.setPiecesSold(product.getPiecesSold()+1);
            }
        });
        return null;
    }

}
