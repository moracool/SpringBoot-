package com.luis.curso.sprintboot.di.factura.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.luis.curso.sprintboot.di.factura.springboot_difactura.models.Item;
import com.luis.curso.sprintboot.di.factura.springboot_difactura.models.Product;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {

    @Bean
    List<Item>itemsInvoice (){
        //implemets body
        Product p1 = new Product("BombomBum", 20);
        Product p2 = new Product("Caramelo", 5);
        Product p3 = new Product("Galleta", 15);
        Product p4 = new Product("Coca-cola", 30);

        List<Item> items = Arrays.asList( new Item(p1, 2) , new Item(p2, 10),new Item(p3, 4),new Item(p4, 2));
        //se puede ahorrar vatiables pegando todo
        return items;        
    }

    //@Primary o @Bean("default")
    @Bean    
    List<Item>itemsInvoiceOffice (){
        //implemets body
        Product p1 = new Product("Motinor Asus", 700);
        Product p2 = new Product("Mouse", 45);
        Product p3 = new Product("Notebook", 1500);
        Product p4 = new Product("Print HP", 350);

        List<Item> items = Arrays.asList( new Item(p1, 2) , new Item(p2, 5),new Item(p3, 5),new Item(p4, 1));
        //se puede ahorrar vatiables pegando todo
        return items;        
    }
}
