package com.company;

public class Fish {
    private String type;
    private int weight;
    private int piece;

    public String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPiece() {
        return piece;
    }

    void setPiece(int piece) {
        this.piece = piece;
    }

    void fishMethod(String name) {
        System.out.println(" It's fresh fish !");
    }
}
