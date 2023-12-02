/**
 * Class Constructor
 */
class Constructor {
    int Roll;
    String Name;
    Float Mark;

    // Constructor method
    public Constructor() {
        Roll = 676095;
        Name = "Soumik Sarkar";
        Mark = 90.7f;
    }

    // Display method
    void Display() {
        System.out.println("Roll is " + Roll);
        System.out.println("Name is " + Name);
        System.out.println("Mark is " + Mark);
    }

    public static void main(String[] args) {
        // Creating an instance of the Constructor class
        Constructor S = new Constructor();
        
        // Calling the Display method to show the details
        S.Display();
    }
}
