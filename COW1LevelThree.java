import java.lang.*;

public class Calculator3

{

    public double calcDifference(double x1, double x2){
        return Math.abs(x1 - x2);
        
    }
    
    public double calcAreaOfCircle(double lengthOfRadius){
        return lengthOfRadius * lengthOfRadius * Math.PI;
        
    }
    
    public double calcVolOfSphere(double lengthOfRadius){
        return Math.PI * lengthOfRadius * lengthOfRadius * lengthOfRadius * 4/3;
        
    }
    
    public double calcGravity(double mass1, double mass2, double radius){
         
         double gravFormula = (mass1 * mass2 * Math.pow(10,-11)* 6.67408) / (radius * radius);
         return gravFormula;
        
    }
    
    public double calcVolumeOfCone(double height, double radius){
        return Math.PI*radius*radius*height*1/3;
        
    }
    
}
