package com.netcracker.MyTasks;

import java.util.Arrays;

public class Book {

    //Private Fields_______________________________________________________

    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    //Public Methods_______________________________________________________

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this(name, authors, price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    private String authorsInformation() {
        String s = new String("");
        if(authors == null) {
            s += "No authors";
        } else {
            for(Author str : authors) {
                s += str.toString() + ", ";
            }
            s = s.substring(0, (s.length() - 2));
        }
        return s;
    }

    @Override
    public String toString() {
        return ("Book[name=" + name + ", authors={" + authorsInformation() + "}, price=" + price + ", qty=" + qty + "]");
    }

    public String getAuthorNames() {
        String s = new String("");
        if(authors == null) {
            s += "No authors";
        } else {
            for(Author str : authors) {
                s += str.getName() + ", ";
            }
            s = s.substring(0, (s.length() - 2));
        }
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof Book)) return false;
        Book another = (Book) obj;
        boolean b = true;
        if(this.authors.length != another.authors.length) {
            b = false;
        } else {
            for(int i = 0; i < authors.length; ++i) {
                if(!this.authors[i].equals(another.authors[i])) {
                    b = false;
                    break;
                }
            }
        }
        return ((this.name.equals(another.name)) && b &&
                (Extra.isEqual(this.price, another.price)) &&
                (this.qty == another.qty));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + Arrays.hashCode(authors);
        long r = Double.doubleToLongBits(price);
        result = 31 * result + ((int)(r ^ (r >>> 32)));
        result = 31 * result + qty;
        return result;
    }

}