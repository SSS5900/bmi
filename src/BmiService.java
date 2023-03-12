public class BmiService {

    public int calculate(double metr, int kg){

        int bmi;
        bmi = (int) (kg / (Math.pow(metr, 2)));

        return bmi;


    }

}
