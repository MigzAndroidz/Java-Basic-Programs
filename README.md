# Java-Basic-Program
public class Calculator {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the first number: ") ; 
        int a = input.nextInt();
        
        System.out.println("Enter the second number: ");
        int b = input.nextInt();

        System.out.print("Operator: ");
        int c = input.next();
         
         if(c.equals(  "+")) 
         {
           System.out.print("a+b");
         }
         else if(c.equals("-"))
         {
            System.out.print("a-b");
         }
         else if(c.equals(  "*"))
         {
            System.out.print("a*b");
         }
         else if(c.equals( "a/b")) 
         {
            System.out.print("a/b");
         }
    }
}
