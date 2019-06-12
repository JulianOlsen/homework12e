package homework12e;


import java.util.Scanner;

public class Homework12e {
    
   void output(double num)
        {
            double itself = num/1;
            double x = num/2;
            double y = num/3;
            double q = num/4;
            double w = num/5;
            double e = num/6;
            double r = num/7;
            double t = num/8;
            double u = num/9;
            
            boolean testx = false; 
            if (x == (int)x){ testx = true;} 
            boolean testy = false; 
            if (y == (int)y){ testy = true; }
            boolean testq = false; 
            if (q == (int)q){ testq = true; }
            boolean testw = false; 
            if (w == (int)w){ testw = true; }
            boolean teste = false; 
            if (e == (int)e){ teste = true; }
            boolean testr = false; 
            if (r == (int)r){ testr = true; }
            boolean testt = false; 
            if (t == (int)t){ testt = true; }
            boolean testu = false; 
            if (u == (int)u){ testu = true; }
            
            if (testx == true){
                System.out.println(x);
            }
            else if(testy == true)
            {
                System.out.println(y); 
            }
            else if(testq == true)
            {
                System.out.println(q);
            }
            else if(testw == true)
            {
                System.out.println(w);
            }
            else if(teste == true)
            {
                System.out.println(e);
            }
            else if(testr == true)
            {
                System.out.println(r);
            }
            else if(testt == true)
            {
                System.out.println(t);
            }
            else if(testu == true)
            {
                System.out.println(u);
            }
            else {
                System.out.println("it is a prime number" + num);
            }
        }
   

    public static void main(String[] args) {
        Homework12e main = new Homework12e(); 
        
        while(true){   
        System.out.println("type in a number");
        Scanner SC = new Scanner(System.in);
        double num;
        try {
        num = SC.nextInt();
                main.output(num);
                break;
        }
        catch (Exception e){
             System.out.println("not a number or positive number");       
            
        }
        }
      
    }
} 