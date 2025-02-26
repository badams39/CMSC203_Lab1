
import java.util.Scanner;

public class MovieDriver_Task1 {
    public static void main(String[] args) {
    	
        //create scanner
        Scanner scan = new Scanner(System.in);
        
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
        
        //close out
        scan.close();
    }
}

