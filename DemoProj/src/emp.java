import java.util.Scanner;  

public class emp {

	Scanner sc = new Scanner(System.in);
	
 
    String name = sc.next();
    int id = sc.nextInt();

    void GetData(int id, String name){

    
        this.name = name;
        
        this.id = id;
    }

    void Display(){

        System.out.println("Name " +name);
        System.out.println("Id "+id);
    }
    public static void main(String[] args) {
        emp obj = new emp();

        obj.GetData(1,"vijay");
        obj.Display();
    }
}