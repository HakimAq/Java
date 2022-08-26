package week3;
import java.util.ArrayList;

public class Player {
  public String name;
  public int age;
  public double height;
  public double weight;
  public String position;
  public ArrayList<String> skills;
  public double wages;

  public Player(String name, int age, double height, double weight, String position, ArrayList<String> skills,
      double wages) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.position = position;
    this.skills = skills;
    this.wages = wages;
  }

  public void display() {
    System.out.println("The name of player is " + name);
    System.out.println("The age of player is " + age);
    System.out.println("The height of player is " + height);
    System.out.println("The weight of player is " + weight);
    System.out.println("The positin of player is " + position);
    for (String skill : skills) {
      System.out.println("The skill of player is " + skill);

    }
    System.out.println("The wages of player is "+ wages);
  }
}
