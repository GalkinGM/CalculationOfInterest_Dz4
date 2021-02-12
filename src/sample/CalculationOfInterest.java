package sample;

public class CalculationOfInterest {
    private double x; //сумма кредита
    private double y; //процентная ставка
    private double z; //срок
    double f; // расчет помесячного процента
    double s; //срок в месяцах

    public double calculationOfInterest(double x, double y, double z){
        y= y/100;
        f=(1+y/12);
        s=(z*12);
        double i =(x*(y/12))/(1-1/exponent(f,s));
        return i;

    }

    public static double exponent(double value, double powValue) {
        double result = 1;
        for (double i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }
    }




