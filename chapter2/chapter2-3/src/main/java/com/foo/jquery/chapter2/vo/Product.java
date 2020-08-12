package com.foo.jquery.chapter2.vo;

import java.util.List;

public class Product {

    private int id;
    private String productName;
    private Supplier supplier;
    private Specs specs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Specs getSpecs() {
        return specs;
    }

    public void setSpecs(Specs specs) {
        this.specs = specs;
    }
}
