package linear_programs.tasks;

public class Task4 {
    public static double getReversedDouble(double inputDouble) {
        return ((int) inputDouble / 1000.0) + inputDouble*1000%1000;
    }
}
