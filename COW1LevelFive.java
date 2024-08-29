public class Calculator5
{
    public double calcCompoundInterest(double initialDeposit, double interestRate, double numCompounded, double numYears){
        return initialDeposit * Math.pow((1 + (double)interestRate/(double)numCompounded), numCompounded * numYears);
    }
    public double calcContinousCompoundInterest(double initialDeposit, double interestRate, double numYears){
        return initialDeposit * Math.pow(Math.E, interestRate*numYears);
    }
    public double calcFirstRootOfQuadratic(double a, double b, double c){
        return ( -b + (Math.sqrt((b * b) -4 * a * c))) / (2 * a);
    }
    public double calcHeight(double angleOfElevation, double distance){
        double rads = angleOfElevation * Math.PI/180;
        return distance * Math.tan(rads);
    }
    public double calcAngleOfElevation(double height, double distance){
        
        double step1 = height/distance;
        double step2 = Math.atan(step1);
        
        return step2 * 180/Math.PI;
    }
}
