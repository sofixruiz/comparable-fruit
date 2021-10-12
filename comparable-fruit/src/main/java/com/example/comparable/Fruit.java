package com.example.comparable;

public class Fruit implements Comparable<Fruit>{

    private String fruitName;
    private String fruitDesc;
    private int fruitQty;

    public Fruit(String fruitName, int fruitQty) {
        this.fruitName = fruitName;
        this.fruitQty = fruitQty;
    }

    public Fruit(String name) {
        this.fruitName = name;
    }

    public String getFruitName() {
        return fruitName;
    }

    public String getFruitDesc() {
        return fruitDesc;
    }

    public int getFruitQty() {
        return fruitQty;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setFruitDesc(String fruitDesc) {
        this.fruitDesc =fruitDesc;
    }

    public void setFruitQty (int fruitQty) {
        this.fruitQty = fruitQty;
    }

    @Override
    public int compareTo(Fruit that) {
        if (this.fruitName.compareTo(that.fruitName) < 0) {
            return -1;
        } else if (this.fruitName.compareTo(that.fruitName) > 0) {
            return 1;
        } else {
            if (this.fruitQty < that.fruitQty) {
                return -1;
            } else if (this.fruitQty > that.fruitQty) {
                return 1;
            }
        }
        return 0;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit: {");
        sb.append("Fruit Name: '").append(fruitName).append('\'');
        sb.append(", Fruit Description: '").append(fruitDesc).append('\'');
        sb.append(", Fruit Quantity: ").append(fruitQty);
        sb.append("}");
        return sb.toString();
    }
}
