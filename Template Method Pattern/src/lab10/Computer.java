package lab10;

public abstract class Computer {
    
   public abstract void plugCPU();
   public abstract void plugMemory();
   public abstract void plugStorage();
  
   public void plugPeripherals() {
       System.out.println("Connecting mouse, keyboard, monitor...");
   }
   //call
   public void buildpc() {
       plugCPU();
       plugMemory();
       plugStorage();
       plugPeripherals();
   }
  
}