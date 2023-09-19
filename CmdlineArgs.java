import java.io.*;
public class CmdLineArgs{
    public static void main(String args[]){
        if(args.length!=2){
            System.out.println("you have to enter only two inters");
        }
        else
        {
            int x= Integer.parseInt(args[0]);
            int y= Integer.parseInt(args[1]);
            int z=x+y;
            System.out.println("sum of"+x+"and"+y+"is"+z);
        }
    }
}
