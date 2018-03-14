public class Dog extends Animal{

  public Dog(){
  }
  
  public Dog(int legs, int heads, boolean tail, String owner){
    super(legs,heads,tail,"Dog");
    this.owner=owner;
  }
  
  void setLegs(int legs){
    super.setLegs(legs);
  }
  
  int getLegs(){
    return super.getLegs();
  }
  
  void setHeads(int heads){
    super.setHeads(heads);
  }
  
  int getHeads(){
    return super.getHeads();
  }
  
  void setTail(boolean tail){
    super.setTail(tail);
  }
  
  boolean getTail(){
    return super.getTail();
  }
  
  void setName(String name){
    super.setName(name);
  }
  
  String getName(){
    return super.getName();
  }

  void setOwner(String owner){
    super.setOwner(owner);
  }
  
  String getOwner(){
    return super.getOwner();
  }
  

}