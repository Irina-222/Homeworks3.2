public class BmiService {
    public int calculate(int bodyMass, double height) {

        int bmi = (int) (bodyMass / (Math.pow(height, 2)));

        return bmi;

    }

}
