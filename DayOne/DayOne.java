import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * Write a description of class DayOne here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DayOne
{
    public ArrayList<Integer> totals = new ArrayList<Integer>();
    public static ArrayList<Integer> calss = new ArrayList<Integer>();
    public static void main(String args[]) {
            File in = new File("DayOneInputs.txt");
            try {
                readFile(in);
            }catch (FileNotFoundException e){
                System.out.println("file not found");
            }
        }

        public static void readFile(File enter)throws FileNotFoundException{
            Scanner scan = new Scanner(enter);
            while (scan.hasNextInt()){
                calss.add(scan.nextInt());
            }
            scan.close();
        }
    }
