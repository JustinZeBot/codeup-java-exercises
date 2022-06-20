package oop;


public class Dish {

    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public void printSummary(){

        System.out.printf("Cost: %d %n  Name: %s %n would recommend: %b",costInCents,nameOfDish,wouldRecommend);

    }

}
