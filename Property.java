public class Property {
    String name;
    int price; 
    Boolean available;
    Player owner;
    int rent;
    Property (String name, int price, int rent){
        this.name = name; 
        this.price=price;
        this. rent=rent;
        available=true;
        owner=null;
    }
    public String getName(){
    return name;
    }
    public int getPrice(){
        return price;
        }
      public Boolean getAvailable(){
            return available;
            }
            public Player getOwner(){
                return owner;
                }
                public int getRent(){
                    return rent;
                    } 
    public void setAvailable (Boolean available){
        this. available=available;
    }
    public void setOwner (Player owner){
        this. owner=owner;
    }
    public void setRent (int rent){
        this. rent=rent;
    }
    public void purchase (Player owner){
        available=false;
        this.owner=owner;
    }
    public String toString(){
        return name+" owned by "+owner+" price "+price+" rent "+rent;
        }
        
}
