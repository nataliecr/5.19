import java.util.Scanner;

public class DisplayPyramid {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of lines: ");
    int num_lines = input.nextInt();
    int count = 1;
    
    if (num_lines > 15 || num_lines < 1)
      System.exit(0);
    
    for (int i = 1; i <= num_lines; i++){
      for (int j = 1; j <= (num_lines - i); j++)
        System.out.print(" ");
      
      for (int j = i; j >= 1; j--)
        System.out.print(j + " ");
    
      for (int j = 2; j <= i; j++)
        System.out.print(j + " ");
    
      System.out.println();
    } // for      
  }   // main 
} // DisplayPyramid
