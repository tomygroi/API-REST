/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.laboratorioderedes.product.service;

import java.util.List;
import net.laboratorioderedes.product.entity.Product;

public interface ProductService {
    // create
    public Product createProduct(Product product);
    
    //read
    public List<Product> getAllProducts();
    public Product getProductById(Long productId);
    
    //update
    public Product updateProduct(Long productId, Product product);
    
    //delete
    public Product deleteProductById(Long productId);
}
