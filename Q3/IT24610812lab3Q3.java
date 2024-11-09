import java.util.Scanner;
   
    public class IT24610812Lab3Q3 {
    public static void main (String[] args) {
     Scanner scanner = new Scanner (System.in);
     
      System.out.print("Enter the rupee Amount: ");
      int Amount = scanner.nextInt();
       
      int Notes5000 = (Amount/5000);
      System.out.println("Notes5000: " + Notes5000);
      
      Amount= Amount - (Notes5000*1000);

      int Notes1000 = (Amount/1000);
      System.out.println("Notes1000: " + Notes1000);
      
      Amount= Amount - (Notes1000*1000);

       int Notes500 = (Amount/500);
      System.out.println("Notes500: " + Notes500);
      
      Amount= Amount - (Notes500*500);

      int Notes200 = (Amount/200);
      System.out.println("Notes200: " + Notes200);
      
      Amount= Amount - (Notes200*200);

      int Notes100 = (Amount/100);
      System.out.println("Notes100: " + Notes100);
      
      Amount= Amount - (Notes100*100);

       int Notes50 = (Amount/50);
      System.out.println("Notes50: " + Notes50);
      
      Amount= Amount - (Notes50*50);

      int Notes20 = (Amount/20);
      System.out.println("Notes20: " + Notes20);
      
      Amount= Amount - (Notes20*20);

      int Notes10 = (Amount/10);
      System.out.println("Notes10: " + Notes10);
      
      Amount= Amount - (Notes10*10);

      
      int Notes05 = (Amount/05);
      System.out.println("Notes05: " + Notes05);
      
      Amount= Amount - (Notes05*05);

      int Notes02 = (Amount/02);
      System.out.println("Notes02: " + Notes02);
      
      Amount= Amount- (Notes02*02);

      int Notes01 = (Amount/01);
      System.out.println("Notes01: " + Notes01);
      
     scanner.close();

   }    
}