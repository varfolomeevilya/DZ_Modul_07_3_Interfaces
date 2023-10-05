package org.example;

public class CompactMachine {
    protected String name;
    protected String model;
    protected double grandeCoffeeContainer;
    protected int milkContainer;
    protected double waterContainer;
    protected int usedCoffeeTank;
    public CompactMachine(){
    }

    public CompactMachine(String name, String model, double grandeCoffeeContainer, int milkContainer, double waterContainer){
        this.name = name;
        this.model = model;
        this.grandeCoffeeContainer = grandeCoffeeContainer;
        this.milkContainer = milkContainer;
        this.waterContainer = waterContainer;
    }

    private boolean testModel(){
        if((this.model.contains("200")) || (this.model.contains("800")) || (this.model.contains("1200"))){
            return true;
        }else{
            return false;
        }
    }
}
