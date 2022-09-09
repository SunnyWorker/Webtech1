package implementations;

import java.util.HashMap;
import java.util.Map;

public class MathSolver {
    public double firstTask(double x, double y) {
        double numerator = (1 + Math.sin(x+y)*Math.sin(x+y));
        double denominator = 2+Math.abs(x-(2*x/(1+Math.pow(x,2)*Math.pow(y,2))));
        double result = numerator/denominator + x;
        return result;
    }

    public boolean secondTask(double x, double y) {
        if(y>=0 && Math.abs(x)<=4) return true;
        if(y<0 && Math.abs(x)<=6) return true;
        return false;
    }

    public Map<Double, Double> thirdTask(double a, double b, double h) {
        HashMap<Double, Double> hashMap = new HashMap<>();
        for (double i = a; i <= b; i+=h) {
            hashMap.put(i,Math.tan(i));
        }
        return hashMap;
    }
}
