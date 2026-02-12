package CatanGame;

public class main{
  public static void main(String[] args) {

    Agent agentOne = new Agent();
    Agent agentTwo = new Agent();
    Board board = new Board();

    Player playerOne = new Player(0, agentOne);
    Player playerTwo = new Player(1, agentTwo);
    Player[] players = {playerOne, playerTwo};
    Dice dice = new MultiDice();

    Game game = new Game(board, players, dice);

    game.start();
  }
}