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
    public static void main(String args[]) throws FileNotFoundException{
        try{ 
            File in = new File("DayOneInputs.txt");
            calss = readFile(in);
        }catch(IOException object){
            object.printStackTrace();
        }
        }

        public static ArrayList<Integer>[] readFile(File enter){
            Scanner scan = new Scanner(enter);
            ArrayList<Integer> take = new ArrayList<Integer>();
            while (scan.hasNextInt()){
                take.add(scan.nextInt());
            }
            scan.close();
            return take;

        }
    }
