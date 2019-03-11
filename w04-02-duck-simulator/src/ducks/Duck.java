package ducks;

import ducks.behaviors.IFlyBehavior;

public abstract class Duck {

    IFlyBehavior flyBehavior;

    //TODO: change quack to use the same strategy as fly (i.e. create IQuackBehavior and use similarly to IFlyBehavior)
    public void quack() {
        System.out.println("Quack");
    }

    public void swim() {
        System.out.println("Swim");
    }

    public abstract void display();

    public void fly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

}
