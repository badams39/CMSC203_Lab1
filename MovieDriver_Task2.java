
import java.util.Scanner;

public class MovieDriver_Task2 {
    public static void main(String[] args) {
    	
        //create scanner
        Scanner scan = new Scanner(System.in);
        String ans;
        
        do {
        Movie myMovie = new Movie();
        
        //Ask for movie title
        System.out.println("Enter the name of a movie:");
        
        //sets the movie title with user input
        myMovie.setTitle(scan.nextLine());
        
        //Asks for the movie rating
        System.out.println("Enter the movie's rating:");
        
        //sets the rating with user input
        myMovie.setRating(scan.nextLine());
        
        //Asks for the number of tickets sold
        System.out.println("Enter the number of tickets sold:");
        
        //Sets the value with user input
        myMovie.setSoldTickets(scan.nextInt());

        //prints it out
        System.out.println(myMovie.toString());
        
        //ask if they want to repeat
        System.out.println("do you want to enter another?");
        scan.nextLine();
        ans = scan.nextLine();
        }while(ans.equalsIgnoreCase("yes"));
        
        //close out
        System.out.println("Goodbye");
        scan.close();
    }
}

