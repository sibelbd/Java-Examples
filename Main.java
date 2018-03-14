
class Main {
  public static void main(String[] args) {
    Dog dog1= new Dog();
    Dog dog2= new Dog(3,1,true,"Todd");
    
    System.out.print(dog1.getLegs() + ", " + dog1.getHeads() + ", " + dog1.getTail() + ", " + dog1.getName() + ", " + dog1.getOwner()+ '\n');
    
    
    System.out.print(dog2.getLegs() + ", " + dog2.getHeads() + ", " + dog2.getTail() + ", " + dog2.getName() + ", " + dog2.getOwner());
    
  }
}

