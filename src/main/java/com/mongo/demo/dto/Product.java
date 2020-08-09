package com.mongo.demo.dto;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class Product {
    @Id
    private ObjectId _id;
    private int id;
    private int manufacturer;
    private String sku;
    private String ean13;
    private int weight;
    private int height;
    private int width;
    private int depth;
    private String dateUpd;
    private int category;
    private boolean categories;
    private String dateUpdDescription;
    private String dateUpdImages;
    private String dateUpdStock;
    private int wholesalePrice;
    private int retailPrice;
    private String dateAdd;
    private String video;
    private int active;
    private boolean images;
    private boolean attributes;
    private boolean tags;
    private int taxRate;
    private int taxId;
    private String dateUpdProperties;
    private String dateUpdCategories;
    private int inShopsPrice;


    public Product() {
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(int manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getEan13() {
        return ean13;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(String dateUpd) {
        this.dateUpd = dateUpd;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public boolean isCategories() {
        return categories;
    }

    public void setCategories(boolean categories) {
        this.categories = categories;
    }

    public String getDateUpdDescription() {
        return dateUpdDescription;
    }

    public void setDateUpdDescription(String dateUpdDescription) {
        this.dateUpdDescription = dateUpdDescription;
    }

    public String getDateUpdImages() {
        return dateUpdImages;
    }

    public void setDateUpdImages(String dateUpdImages) {
        this.dateUpdImages = dateUpdImages;
    }

    public String getDateUpdStock() {
        return dateUpdStock;
    }

    public void setDateUpdStock(String dateUpdStock) {
        this.dateUpdStock = dateUpdStock;
    }

    public int getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(int wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public boolean isImages() {
        return images;
    }

    public void setImages(boolean images) {
        this.images = images;
    }

    public boolean isAttributes() {
        return attributes;
    }

    public void setAttributes(boolean attributes) {
        this.attributes = attributes;
    }

    public boolean isTags() {
        return tags;
    }

    public void setTags(boolean tags) {
        this.tags = tags;
    }

    public int getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public String getDateUpdProperties() {
        return dateUpdProperties;
    }

    public void setDateUpdProperties(String dateUpdProperties) {
        this.dateUpdProperties = dateUpdProperties;
    }

    public String getDateUpdCategories() {
        return dateUpdCategories;
    }

    public void setDateUpdCategories(String dateUpdCategories) {
        this.dateUpdCategories = dateUpdCategories;
    }

    public int getInShopsPrice() {
        return inShopsPrice;
    }

    public void setInShopsPrice(int inShopsPrice) {
        this.inShopsPrice = inShopsPrice;
    }
}
