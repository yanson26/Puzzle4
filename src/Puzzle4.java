import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Puzzle4 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Puzzle4.txt"));

        int counter = 0;

        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] S = s.split(",");

            String part1 = S[0];
            String part2 = S[1];

            String[] firstPart = part1.split("-");
            String[] secondPart = part2.split("-");

            int firstPartFirstNumber = Integer.parseInt(firstPart[0]);
            int firtPartSecondNumber = Integer.parseInt(firstPart[1]);
            int secondPartFirstNumber = Integer.parseInt(secondPart[0]);
            int secondPartSecondNumber = Integer.parseInt(secondPart[1]);

            if(firstPartFirstNumber>= secondPartFirstNumber && firtPartSecondNumber <= secondPartSecondNumber ||
               secondPartFirstNumber >= firstPartFirstNumber && secondPartSecondNumber <= firtPartSecondNumber){
                counter += 1;
            }
        }

        System.out.println(counter);
    }

}
