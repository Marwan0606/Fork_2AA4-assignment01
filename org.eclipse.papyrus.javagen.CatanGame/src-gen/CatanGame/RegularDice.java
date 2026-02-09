package CatanGame;

import java.util.Random;

public class RegularDice implements Dice {

  private Random randomDieNum = new Random();

  public int roll(){
    return randomDieNum.nextInt(6)+1;
  }
}