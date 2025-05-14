import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class monopoly {
    static Random number=new Random();
        public static int rollDice(int Max){
                return number.nextInt(Max-1)+1;
        }
        public static void main(String[] args) {
         Player currentPlayer; 
         String currentPlayerName;  
        int startingMoney=2000;
        int diceRoll;
        String userImput;
        Property currentProperty;
        ArrayList <Property> board=new ArrayList <Property>();
     ArrayList <Player> players=new ArrayList <Player>();
     Property newProperty;
     newProperty=new Property("go", 0, 0);
     board.add (newProperty);
     newProperty=new Property ("Mediter-Ranean Avenue",60, 80);
     board.add (newProperty);
     newProperty=new Property ("Baltic avenue", 60,  80);
     board.add (newProperty);
     newProperty=new Property ("Reading Railroad", 200, 250);
     board.add (newProperty);
     newProperty=new Property ("Oriental Avenue",100,150);
     board.add (newProperty);
     newProperty=new Property ("Vermont Avenue",100,150);
     board.add (newProperty);
    newProperty=new Property("Connecticut Avenue", 120, 130);
    board.add (newProperty);
    newProperty=new Property("In Jail or Just Visiting", 0,0);
    board.add (newProperty);
    newProperty=new Property("St.Charles Place",140,150);
    board.add (newProperty);
    newProperty=new Property("Eletric Company", 150, 160);
    board.add (newProperty);
    newProperty=new Property("States Avenue", 140, 150);
    board.add (newProperty);
    newProperty=new Property("Virginia Avenue",160,170);
    board.add (newProperty);
    newProperty=new Property("Pennsyvania Railroad",200,300);
    board.add (newProperty);
    newProperty=new Property("St.James Place",180,190);
    board.add (newProperty);
    newProperty=new Property("Tennesse Avenue",180,190);
    board.add (newProperty);
    newProperty=new Property("New York Avenue",200,300);
    board.add (newProperty);
    newProperty=new Property("Free Parking",0,0);
    board.add (newProperty);
    newProperty=new Property("Kentucky Avenue",220,240);
    board.add (newProperty);
    newProperty=new Property("Indiana Avenue",200,300);
    board.add (newProperty);
    newProperty=new Property("Illinois Avenue",240,300);
    board.add (newProperty);
    newProperty=new Property("B&O. Railroad",300,330);
    board.add (newProperty);
    newProperty=new Property("Atlantic Avenue",260,300);
    board.add (newProperty);
    newProperty=new Property("Ventnor Avernue",260,300);
    board.add (newProperty);
    newProperty=new Property("Water Works",150,160);
    board.add (newProperty);
    newProperty=new Property("Marvin Gardens",280,300);
    board.add (newProperty);
    newProperty=new Property("Go To Jail",0,0);
    board.add (newProperty);
    newProperty=new Property("Pacific Avenue",300,320);
    board.add (newProperty);
    newProperty=new Property("North Carolina Avenue",300,320);
    board.add (newProperty);
    newProperty=new Property("Short Line",200,300);
    board.add (newProperty);
    newProperty=new Property("Park Place",350,360);
    board.add (newProperty);
    newProperty=new Property("Luxury Tax",100,110);
    board.add (newProperty);
    newProperty=new Property("Boardwalk",400,410);
    board.add (newProperty);
    System.out.println("How many players?");
    Scanner imput=new Scanner (System.in);
    int numberOfPlayers = imput.nextInt();
    currentPlayerName=imput.nextLine();
    for(int x=0;x<numberOfPlayers;x++){
        System.out.println("Player Number "+(x+1) +"?");
        currentPlayerName=imput.nextLine();
       
        currentPlayer= new Player(currentPlayerName);
        currentPlayer.depositMoney(startingMoney);
        players.add(currentPlayer);
    }
    for (int x=0;x<players.size();x++)
    currentPlayer=players.get(x);
    diceRoll=rollDice(12);
    System.out.println(currentPlayer.getName()+" you rolled "+ diceRoll);
    currentProperty=board.get(currentPlayer.move(diceRoll));
    System.out.println(currentPlayer.getName()+" You landed on "+currentProperty);
    if (currentProperty.getAvailable()){
        if (currentPlayer.getMoney()>currentProperty.getPrice()){
        System.out.println("Do you want to buy this property?");
        userImput= imput.nextLine();
        if (userImput.contains("Y") || userImput.contains("y")){
            currentPlayer.spentMoney(currentProperty.getPrice());
            currentProperty.purchase(currentPlayer);
        }
        }
    }
    System.out.println("You need to pay " + currentProperty.getRent()+" to "+ currentProperty.getOwner().getName());
    currentPlayer.spentMoney(currentProperty.getRent());
    currentProperty.getOwner().depositMoney(currentProperty.getRent());
}
}