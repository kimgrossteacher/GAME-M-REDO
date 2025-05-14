public class Player {
    String name;
    int money;
    int currentSpace;
    int go=200;//go is the amount of money given 
    Player (String name){
        this.name=name;
        money=2000;
        currentSpace=0;
    }
   public int getMoney(){
    return money;
   }
   public void setMoney(int money){
 this.money=money;
   }
   public void spentMoney(int spentMoney){
    money=money-spentMoney;
   }
   public void depositMoney(int depositMoney){
    money=money+depositMoney;
   }
   public String getName(){
    return name;
   }
   public int move(int move){
    currentSpace=currentSpace+move;
    if (currentSpace>37){
      money=money+go;
      currentSpace=currentSpace-38;
    }
    return currentSpace;
   }
   public int getCurrentSpace(){
    return currentSpace;
   }
}
