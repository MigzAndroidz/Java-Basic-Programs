public class Chess {

    
    public static void main(String[] args) {
        // TODO code application logic here
        char[] white = {9820,9822,9821,9818,9819,9821,9822,9820,9823};
        char[] black = {9814,9816,9815,9812,9813,9815,9816,9814,9817};
        char x00 = 9556;
        char x01 = 9552;
        char x02 = 9574;
        char x03 = 9559;
        char x10 = 9553;
        char x11 = 9568;
        char x12 = 9571;
        char x20 = 9562;
        char x21 = 9577;
        char x22 = 9565;
         
        System.out.print(""+x00+x01);
        for(int i = 0 ; i<7; i++)
        System.out.print(""+x02+x01);
        System.out.print(""+x03+"\n");
        
        for(int i = 0 ; i<9 ; i++){
            if(i!=8)
         System.out.print("" + x10+white[i]);
            else
           System.out.print(""+x10+"\n");
        }
        //for (int i=0;i<8;i++)
        //System.out.print(""+x11+x01);
        //System.out.print(""+x12+"\n");
        
        for(int i =0 ; i<9 ; i++){
            if(i!=8)
                System.out.print("" + x10+white[i]);
            else
              System.out.print("" +x10+"\n");  
        }
            for(int j = 0; j<5 ; j++){
                for(int i = 0; i<8; i++)
                    System.out.print(""+x11+x01);
                    System.out.print(""+x12+"\n");
            }   
                for (int i=0;i<9;i++) {
            if (i!=8)
               System.out.print(""+x10+black[8]);
            else
            System.out.print(""+x10+"\n");
        }
        
            for (int i=0;i<9;i++) {
                if (i!=8)
               System.out.print(""+x10+black[i]);
            else
          System.out.print(""+x10+"\n");
        }
        
             System.out.print(""+x20+x01);
                for (int i=0;i<7;i++)
          System.out.print(""+x21+x01);
             System.out.print(""+x22+"\n");
     }  
}
