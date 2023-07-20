import java.util.Scanner;

public class HelpfromSam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(countHelp(A));
    }
    public static int countHelp(int A)
    {
        int count = 1;
        int sum = 1;
        while(sum<=A)
        {
            sum*=2;
            if(sum==A)
            {
                return count;
            }
        }
        if(sum>A)
        {
            sum=sum/2;
        }
        int x = A-sum;
        return count+x;
    }
}
/*
Help from Sam
Alex and Sam are good friends. Alex is doing a lot of programming these days.
He has set a target score of A for himself.
Initially, Alex's score was zero. Alex can double his score by doing a question, or Alex can seek help from Sam for doing questions that will contribute 1 to Alex's score.
 Alex wants his score to be precisely A. Also, he does not want to take much help from Sam.

Find and return the minimum number of times Alex needs to take help from Sam to achieve a score of A..

Example Input

Input 1:
A = 5
Input 2:
A = 3

Output 1:
2
Output 2:
2
 */
