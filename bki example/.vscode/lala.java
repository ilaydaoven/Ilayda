import java.util.Scanner;
 
public class lala {
 
    public static void main(String[] args) {
 
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter your height.(cm) : ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter your weight.(cm) : ");
        double k = scanner.nextDouble();

        
        b=b/100;
        double endeks  = k/(b*b);
        
        System.out.println(b);
        System.out.println(k);
        if(endeks <18)
        {
           System.out.print(String.format("underweight bki: %f", endeks));
        }   
        else if(endeks >= 18 && endeks <25)
        {
            System.out.print(String.format("normal bki %f", endeks));
        }
        else if(endeks >= 25 && endeks <30)
        {
            System.out.print(String.format("overweight bki: %f", endeks));        
        }
        else if(endeks >= 30 && endeks <35)
        {
            System.out.print(String.format("obese bki: %f", endeks));
        }
        else
        {
            System.out.print(String.format("severely obese bki: %f", endeks));
        }
    }     
    }  
}