import java.util.Scanner;

/*Hello! This is teaching CS. Today, I will show you how to write a program that can convert your grade into a letter grade. 
So first off, you want to import scanner so that you can get the users input. As you can see in the top, I imported scanner since I need
to get the user's grade. Next, you want to create the Scanner so that you can get the users input, which is different from importing it.
I name my Scanner sc since it is a quick and easy name that I can easily identify as scanner. I then print a statement asking for the 
user's grade since that is what I am converting. I then get their input as an int using scanner. Since they are inputting the numeric 
version of their grade, I need to save their input as an int, or integer, named grade. Now take a moment, pause the video, and see if you can figure
out how to find the letter grade associated with their numeric grade. So when thinking of how to find the letter grade, I first thought
of how the letter grades are separated. Each letter grade is separated by 10, going for 100 to 90, then 89 to 80, and so on. So what I 
did was create a series of if statements that check where the number would be in the grades. So if grade is between 100 and 90, it will
print your grade is an A, and so on as the grade gets lower. Then, at the end of the if statements, I add an else statement for if the 
number is outside of the range 0-100 that will say the grade is invalid if it is outside of that range. I hope you enjoyed this lesson! */
public class grades {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your grade? ");
        int grade = sc.nextInt();
        if (grade >= 90 && grade <= 100) {
            System.out.println("Your grade is an A");
        }
        if (grade >= 80 && grade <= 89) {
            System.out.println("Your grade is a B");
        }
        if (grade >= 70 && grade <= 79) {
            System.out.println("Your grade is a C");
        }
        if (grade >= 60 && grade <= 69) {
            System.out.println("Your grade is a D");
        }
        if (grade < 60 && grade >= 0) {
            System.out.println("Your grade is a F");
        }
        else {
            System.out.println("Grade is invalid");
        }
        sc.close();
    }
}
