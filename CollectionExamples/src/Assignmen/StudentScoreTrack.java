package Assignmen;
import java.util.*;

public class StudentScoreTrack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.println("Enter Total Number of Subjects => ");
        int n = sc.nextInt();
        int[] score = new int[n];
        
        
        System.out.println("Enter marks of Subjects => ");
        for (int i = 0; i < n; i++) 
        {
            score[i] = sc.nextInt();
        }
        
         
        ArrayList<Integer> scoreList = new ArrayList<>();
        for (int scr : score) 
        {
            scoreList.add(scr);
        }
        
       
        System.out.println("Elements in ArrayList:");
        for (int scrl : scoreList)
        {
            System.out.println(scrl);
        }    int a = args.length;

int b 10/a;

System.out.print(a);
        
        sc.close();
    }
}
