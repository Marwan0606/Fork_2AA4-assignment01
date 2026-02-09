package CatanGame;

import java.util.List;
import java.util.ArrayList;

public class MultiDice implements Dice {

  private List<Dice> diceList;

  public MultiDice() {
    diceList = new ArrayList<>();
    diceList.add(new RegularDice());
    diceList.add(new RegularDice());
  }

  public int roll() {
    int sum=0;
    for (Dice die: diceList) {
      sum += die.roll();
    }
    return sum;
  }
}