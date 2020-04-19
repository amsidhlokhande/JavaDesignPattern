package com.amsidh.design.structural.decorator;
//A Decorator Pattern says that just "attach a flexible additional responsibilities to an object dynamically".
public class DecoratorPatternApp {
    public static void main(String[] args) {

        //Veg Food
        VegFood vegFood = new VegFood();
        System.out.println(vegFood.prepareFood());
        System.out.println(vegFood.foodPrice());
        //Non Veg Food
        System.out.println();
        Food nonVegFood = new NonVegFood(new VegFood());
        System.out.println(nonVegFood.prepareFood());
        System.out.println(nonVegFood.foodPrice());
        //ChineeseFood
        System.out.println();
        Food chineeseFood = new ChineeseFood(new VegFood());
        System.out.println(chineeseFood.prepareFood());
        System.out.println(chineeseFood.foodPrice());


    }
}


interface Food {
    String prepareFood();

    Double foodPrice();
}

class VegFood implements Food {

    @Override
    public String prepareFood() {
        return "Veg Food";
    }

    @Override
    public Double foodPrice() {
        return 150.00;
    }
}

abstract class FoodDecorator implements Food {
    Food food;

    public FoodDecorator(Food food) {
        this.food = food;
    }

    @Override
    public String prepareFood() {
        return food.prepareFood();
    }

    @Override
    public Double foodPrice() {
        return food.foodPrice();
    }
}


class NonVegFood extends FoodDecorator {
    public NonVegFood(Food food) {
        super(food);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " With Roasted Chicken and Chicken Curry  ";
    }

    @Override
    public Double foodPrice() {
        return super.foodPrice() + 150.00;
    }
}

class ChineeseFood extends FoodDecorator {

    public ChineeseFood(Food food) {
        super(food);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " With Fried Rice and Manchurian ";
    }

    @Override
    public Double foodPrice() {
        return super.foodPrice() + 65.00;
    }
}
