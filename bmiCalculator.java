import java.util.Scanner;

public class bmiCalculator {

    float height;
    float weight;

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        bmiCalculator myObj2 = new bmiCalculator();
        float bmi = myObj2.bmiCalc(myObj);
        while (bmi < 0) {
            bmi = myObj2.bmiCalc(myObj);
        }

        System.out.println("Your BMI is:" + bmi + "Kg/m^2");
    }

    float bmiCalc(Scanner myObj) {
        float bmi = -1;
        try {
            System.out.println("Please enter your height in meters:");
            height = myObj.nextFloat();
            System.out.println("Please enter your weight in Kgs:");
            weight = myObj.nextFloat();
            height = height * height;

            if (height <= 0 || weight <= 0) {
                throw new Exception();
            }
            
            bmi = weight / height;

            if (bmi >= 0 && bmi <= 18.5)
                System.out.println("You are Underweight!");
            else if (bmi >= 19.0 && bmi <= 24.9) {
                System.out.println("You are Healthy!");
            } else if (bmi >= 25.0 && bmi <= 29.9) {
                System.out.println("You are Overweight!");
            } else {
                System.out.println("You are Obese!");
            }
        }
            catch(Exception e){
                System.out.println("Something went wrong!");
            }
        return bmi;
    }
}
