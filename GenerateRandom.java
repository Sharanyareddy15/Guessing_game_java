import java.util.Scanner;
public class GenerateRandom {
    public static void main(String args[]){
        int min=1;
        int max=100;
        int n1=0;
        int random_int=(int)Math.floor(Math.random()*(max-min +1)+min );
        Scanner scan =new Scanner(System.in);
        while(n1!=random_int){
            System.out.println("Guess a number");
            n1=scan.nextInt();
            System.out.println(n1);
            if(n1<random_int){
                System.out.println("Less than");
            }
            else if(n1>random_int){
                System.out.println("Greater");
            }
            else{
                System.out.println("Correct");
            }
        }
    }
}


