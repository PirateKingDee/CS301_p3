import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args){
		ArrayList<Double> allX = new ArrayList<>();
		ArrayList<Double> allY = new ArrayList<>();
		
		System.out.println("Please enter the file name");
		Scanner keyboard = new Scanner(System.in);
		String fileName = keyboard.nextLine();
		try{
            FileReader fr= new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String str = br.readLine();
            
            String[] inputArray = str.split(" ");
            
            for(int i = 0; i < inputArray.length; i++){
               allX.add(Double.parseDouble(inputArray[i]));
            }
            
            str = br.readLine();
            inputArray = str.split(" ");
            
            for(int i = 0; i < inputArray.length; i++){
                allY.add(Double.parseDouble(inputArray[i]));
             }
                      
        }
        catch(Exception e){
            e.printStackTrace();
        }
		
		
		

	}
}
