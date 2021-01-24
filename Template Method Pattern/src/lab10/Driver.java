package lab10;

public class Driver {
   public static void main(String[] args) {
       Computer GamingComputer = new GamingComputer();
       Computer OfficeComputer = new OfficeComputer();
      
       GamingComputer.buildpc();
       OfficeComputer.buildpc();
   }
}