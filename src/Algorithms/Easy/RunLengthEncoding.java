package Algorithms.Easy;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 * Created by Aakash on 1/27/2017.
 */
public class RunLengthEncoding {

        public static String encode(String source) {
            StringBuffer dest = new StringBuffer();
            for (int i = 0; i < source.length(); i++) {
                int runLength = 1;
                while(i < source.length() - 1 && source.charAt(i) == source.charAt(i + 1))
                {
                    runLength++;
                    i++;
                }

                dest.append(source.charAt(i));
                dest.append(runLength);
            }
            return dest.toString();
        }



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            System.out.println(encode(s));

        }
    }
