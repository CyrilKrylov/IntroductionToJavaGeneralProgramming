package linear_programs.tasks;

import static java.lang.Math.*;

public class Task3 {

    public static double getValueOfTrigonometricExpression(double x, double y) {
        return tan(x * y) * (sin(x) + cos(y)) / (cos(x) - sin(y));
    }

}
