package CA1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class JcResults
{
    public static void main(String[] args)
    {

    }

    public static void readInFile()
    {
        try
        {
            Scanner scan = new Scanner(new File("JC_Results.txt"));
            while(scan.hasNextLine())
            {
                scan.useDelimiter("[,|\r\n]");
                int[] temp = new int[34];
                for(int i = 0; i < temp.length; i++)
                {
                    if(scan.hasNextInt())
                    {
                        temp[i] = scan.nextInt();
                    }
                    else if(scan.hasNext())
                    {
                        scan.nextLine();
                    }
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Cannot find the file.");
        }
        scan.close();
    }
}
