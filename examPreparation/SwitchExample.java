public class SwitchExample {
    public static void main(String[] args) {
        int mark = 63;
        String grade;

        switch (mark / 10) {
            case 10:
            case 9:
            case 8:
                grade = "A+";
                break;
            case 7:
                grade = "A";
                break;
            case 6:
                grade = "B";
                break;
            case 5:
                grade = "B-";
                break;
            case 4:
                grade = "C";
                break;
            case 3:
                grade = "D";
                break;
            case 2:
                grade = "E";
                break;
            default:
                grade = "Fail";
                break;
        }

        System.out.println("The student grade is " + grade);
    }
}
