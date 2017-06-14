package com.example.inventory.entities;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "inventory")
public class Product implements Comparable<Product>,Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = -8035622114228432714L;
	private String code;
    private String name;
    private double price;
    private byte[] image;
    private int quantity;
    
    
 
    // For sort.
    private Date createDate;
 
    public Product() {
    }
 
    @Id
    public String getCode() {
        return code;
    }
 
    public void setCode(String code) {
        this.code = code;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
 

    public Date getCreateDate() {
        return createDate;
    }
 
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
 
    public byte[] getImage() {
        return image;
    }
 
    public void setImage(byte[] image) 
    {
        this.image = image;
    }
    
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Product o) 
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
