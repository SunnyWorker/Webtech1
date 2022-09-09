package implementations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Map;

class MathSolverTest {

    static MathSolver mathSolver;

    @BeforeAll
    public static void initial() {
        mathSolver = new MathSolver();
    }

    @Test
    void firstTask() {
        Assertions.assertEquals(0.5, mathSolver.firstTask(0,0));
    }

    @Test
    void secondTask() {
        Assertions.assertEquals(false, mathSolver.secondTask(5,0));
        Assertions.assertEquals(true, mathSolver.secondTask(4,0));
        Assertions.assertEquals(true, mathSolver.secondTask(4,4));
    }

    @Test
    void thirdTask() {
        Map<Double,Double> tanMap = mathSolver.thirdTask(-Math.PI/4, Math.PI/4, Math.PI/4);
        System.out.println(String.format("%-10s|%10s","x","f(x)"));
        for (Map.Entry<Double,Double> tanRow:tanMap.entrySet()) {
            System.out.println(String.format("%-10.2f|%10.2f",tanRow.getKey(),Math.tan(tanRow.getValue())));
        }
    }
}