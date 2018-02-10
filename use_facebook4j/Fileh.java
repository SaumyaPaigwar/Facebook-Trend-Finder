/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileh;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 *
 * @author saumya
 */
public class Fileh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //int rno;
        //String name;
        //int m1,m2,m3;
        FileWriter fw = new FileWriter("D:/project2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        Scanner sc=new Scanner(new FileReader("D://project.txt"));
        String[] sp;
        while(sc.hasNext())
        {
            String a=sc.nextLine();
            if(a.contains("http"))
            {
                System.out.println("yes");
                sp=a.split(" ");
                for(String s:sp)
                {
                    System.out.println(s);
                    if(!s.contains("http"))
                        bw.write(s+" ");
                }
                bw.write('\n');
            }
            else
                bw.write(a+'\n');
            
        }
        /*for(int i=0;i<1;i++)
        {
            bw.write(String.valueOf(sc.nextInt()));
            bw.append('\t');
            bw.append('\t');
            bw.write(sc.next());
            bw.append('\t');
            bw.append('\t');
            bw.write( String.valueOf(sc.nextInt()));
            bw.append('\t');
            bw.write(String.valueOf(sc.nextInt()));
            bw.append('\t');
            bw.write(String.valueOf(sc.nextInt()));
            bw.append('\n');
        }*/
        bw.close();
        /*FileReader fr = new FileReader("D:/test.txt");
        BufferedReader br = new BufferedReader(fr);
         String s;
        while((s=br.readLine())!=null)
        {
            
            //System.out.println("in loop");
            //System.out.println(s);
          String[]t =  s.split("\t");
          for(String temp: t)
          {
              
                System.out.println(temp);
          }   
        StringTokenizer st = new StringTokenizer(s);
        rno=Integer.parseInt(st.nextToken());
        name=st.nextToken();
        m1=Integer.parseInt(st.nextToken());
        m2=Integer.parseInt(st.nextToken());
        m3=Integer.parseInt(st.nextToken());
            System.out.println("RollNo Is: "+rno+" Name:"+name+" Marks Are:"+m1+","+m2+","+m3);
       
        }*/
        //br.close();
    }
    
}
