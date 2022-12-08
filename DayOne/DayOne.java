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
    public static ArrayList<Integer> totals = new ArrayList<Integer>();
    public static ArrayList<String> calss = new ArrayList<String>();
    public static void main(String args[]) {
            try {
                readFile();
                breakcalss();
                int[] totes = totals.toArray();
                int largest = 0;
                for (int i = 0; i < totes.length; i++){
                    if(totes[i] > largest){
                        largest = totes[i];
                    }
                }
                System.out.println(largest);
            }catch (FileNotFoundException e){
                System.out.println(e.toString());
            }
        }
        /**
         * Reads the file I have hard coded in because
         * the user doesn't need to mess with this
         * they will break it.
         * @throws FileNotFoundException
         */

        public static void readFile()throws FileNotFoundException{
            Scanner scan = new Scanner(new File("/Users/ethantubia/Documents/CS/AdventOfCode/DayOne/DayOneInputs.txt"));
            while (scan.hasNext()){
                String s = scan.nextLine();
                calss.add(s);

            }
            scan.close();
        }

        public static void breakcalss(){
            //This line below removes extranious stuff from the file
            for(int i = 0; i < 9; i++){
                calss.remove(i);
            }
            int j = 0;
            for(int i = 0; i < calss.size(); i++){
                String s = calss.get(i);
                
                if(s.equalsIgnoreCase("/")){
                    i++;
                    totals.add(j);
                    j = 0;
                }else{
                    Integer k = Integer.parseInt(s);
                    j = j + k;
                }

            }


        }
    }
