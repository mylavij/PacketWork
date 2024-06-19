package DICE; 
public class DiceRoll{
  public static void main(String[] args){
    Dice dice = new Dice();
    int value7or11 = 0;
    int value2or3or12 = 0;
    int rolls = 100; 

  for (int i = 0; i < rolls; i++){
    dice.roll();
    int total = dice.getTotal();

    if (total ==7 or total == 11){
      value7or11++;
      }

    else if (total ==2 or total == 3 or total == 12){
      value2or3or12++;
      }
  }

    double percent7or11 = (value7or11 / (double) rolls) * 100;
    double percent2or3or12 = (value2or3or12 / (double) rolls) * 100;

    System.out.println("You rolled a 7 or 11 " + percent7or11 +"% of the time");
    System.out.println("You rolled a 2, 3, or 12 " + percent2or3or12 + "% of the time");
    
