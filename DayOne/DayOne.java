import java.util.Scanner;
import java.util.StringBuffer;
import java.util.ArrayList;
/**
 * Write a description of class DayOne here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DayOne
{


    public static void main(String args[]){
        File in = new File("DayOneInputs.txt");
        Scanner scan = new Scanner(in);
        ArrayList<Integer> calss = new ArrayList<Integer>();
        ArrayList<T> elfs = new ArrayList<T>();
        while(scan.hasNextLine()){
            int index = 0;
            String innerds = scan.nextLine();
            if(innerds.equals("\n")){
                index++;
            }else{
                Integer cals = (int) innerds;
                calss.add(index, cals);

            }

        }
        for(int i = 0; i < calss.size(); i++){
            if(calss.get(i) == null){
                i++;
            }else{
                
            }
        }



    }
}
