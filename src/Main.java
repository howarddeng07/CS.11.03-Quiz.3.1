public class Main {

    public static char calculateGrade(int grade){
        if (grade>=90){
            return 'A';
        }
        else if (grade>=80&&grade<90){
            return 'B';
        }
        else if (grade>=70&&grade<80){
            return 'C';
        }
        else if (grade>=60&&grade<70){
            return 'D';
        }
        else if (grade>=50&&grade<60){
            return 'E';
        }
        return 'F';
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int value){
        if (value % 3 == 0 && value % 5 == 0) {
            return "fizzbuzz";
        }
        else if (value % 3 == 0) {
            return "fizz";
        }
        else if (value % 5 == 0){
            return "buzz";
        }
        return "unlucky";
    }

    // Question 3 - frontBack
    public static String frontBack(String original){
        if (original.length() < 2){
            return original;
        }
        String frontBack = original.substring(0, 2);
        return frontBack + original + frontBack;
    }

    public static boolean twoAsOne(int a, int b, int c){
        if ((a+b)==c){
            return true;
        }
        else if ((a+c)==b){
            return true;
        }
        else if ((b+c)==a){
            return true;
        }
        return false;
    }

    public static String endUp(String original){
        if (original.length() < 3) {
            return original.toUpperCase();
        }
        int splitPoint = original.length() - 3;
        return original.substring(0, splitPoint) + original.substring(splitPoint).toUpperCase();
    }


}
