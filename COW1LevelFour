import java.lang.*;

public class Calculator4
{
    
    public double calcLengthOfRadius(double areaOfCircle){
    
        double step1 = areaOfCircle/Math.PI;
        double step2 = Math.sqrt(step1);
        return step2;
    }
    
    public double calcResistanceInParallel(double res1, double res2){
        return Math.pow((1.0/res1 + 1.0/res2), -1);
    }
    
    public double calcDistance(double x1, double y1, double x2, double y2){
        return Math.sqrt( ((x2 - x1)*(x2 -x1)) + ((y2 - y1)*(y2 - y1)));
    }
    
    public static double calcIntercept(double x1, double y1, double x2, double y2){
        
        double m = ((y2-y1)/(x2-x1));
        
        return y1 - (m * x1);
    }
    
    public double calcSurfaceAreaOfCone(double height, double radius){
        
        double s = Math.sqrt((height*height) + (radius*radius) );
    
        return (Math.PI*radius)*(radius + s);
    }
}
