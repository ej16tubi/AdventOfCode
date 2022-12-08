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
    public static ArrayList<String> calss = new ArrayList<String>();
    public static void main(String args[]) {
            try {
                readFile();
            }catch (FileNotFoundException e){
                System.out.println(e.toString());
            }
        }

        public static void readFile()throws FileNotFoundException{
            Scanner scan = new Scanner(new File("/Users/ethantubia/Documents/CS/AdventOfCode/DayOne/DayOneInputs.txt"));
            while (scan.hasNext()){
                String s = scan.nextLine();
                calss.add(s);

            }
            scan.close();
        }
    }
