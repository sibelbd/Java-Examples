public abstract class Animal{
  
  int legs= 4;
  int heads= 1;
  boolean tail= true;
  String name= "";
  String owner= "";
  
  
  public Animal(){
  }
  
  public Animal(int legs, int heads, boolean tail, String name){
    this.legs=legs;
    this.heads=heads;
    this.tail=tail;
    this.name=name;
  }
  
    void setLegs(int legs){
    this.legs=legs;
  }
  
  int getLegs(){
    return this.legs;
  }
  
  void setHeads(int heads){
    this.heads=heads;
  }
  
  int getHeads(){
    return this.heads;
  }
  
  void setTail(boolean tail){
    this.tail=tail;
  }
  
  boolean getTail(){
    return this.tail;
  }
  
  void setName(String name){
    this.name=name;
  }
  
  String getName(){
    return this.name;
  }

  void setOwner(String owner){
    this.owner=owner;
  }
  
  String getOwner(){
    return this.owner;
  }
}