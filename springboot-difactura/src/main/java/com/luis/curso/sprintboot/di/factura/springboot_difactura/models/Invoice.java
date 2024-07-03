package com.luis.curso.sprintboot.di.factura.springboot_difactura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Invoice {

    @Autowired
    private Client client;
    
    @Value("${invoice.description}")
    private String description;

    @Autowired
    @Qualifier("itemsInvoice")
    private List<Item> items;
   
    public Invoice() {
        System.out.println("Creando el compoente de la Factura - Invoice");
    }

    @PostConstruct
    public void init(){
        System.out.println("Creando el compoente de la Factura - INIT");
        description = "HOLA";
    }

    @PreDestroy
    public void destroy(){
        System.out.println("DD");
    }

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }
    
    public Integer getTotal (){
        /*int total = 0;
        for (Item item : items) {
            total += item.getImporte();
        }*/
        int total = items.stream()
        .map(item -> item.getImporte()).reduce(0, (sum,importe) ->sum + importe); 
        return total;
    }
}
