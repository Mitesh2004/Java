public class BMI {
    public static void main(String[] args) {
        String firstName = args[0];
        String lastName = args[1];
        double weight = Double.parseDouble(args[2]);
        double height = Double.parseDouble(args[3]);
        double bmi = weight / (height * height);
        System.out.println(firstName + " " + lastName + "'s BMI is " + bmi);
    }
}
