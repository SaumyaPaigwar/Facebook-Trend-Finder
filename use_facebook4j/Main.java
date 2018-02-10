package use_facebook4j;
import facebook4j.*;
import facebook4j.auth.AccessToken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FacebookException, IOException {
        // TODO code application logic here
        
        File file = new File("D:/projectnew.txt");
        if(!file.exists())
            file.createNewFile();
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        
       Facebook fb = new FacebookFactory().getInstance();
       fb.setOAuthAppId("", "");
       //String tk = "CAACEdEose0cBAEoDNKKewS8vDdnSsq5xwzbSeXKFgdYrBKeMnlhwLwDRbySNwSBC5BFJAjJqgsCdFsDtvTL7mFPuI8W4MeEhT0Vw2Lpx4Eq4MUrWGhQuACxnZBDyZBXU5I2ty0LIPGaPWfHG47vAGephpSgzMNvZAlQDhKD6u3bjod07SIiZBVsiMUNLyyyfnpPTDqVQnwZDZD" ;
       String tk = "CAACEdEose0cBACqbZAmI2g0GONItEZAY3A1NWtjs0EkbXxqPnanf4fMz2ezNBUAxLQLZC0BRFQM2xswDhxKMGMChFhd1XQxhCuXXdQZCi1qd28K620q0rJr5ar01M5visuWBqIfQfAbsI0Xw6KfTj5dWXQWDgX33HR09fF8iSFJDE04kFWSPIZCfCG5l0cxxydWjVPWlNagZDZD";
       //String tk="CAACEdEose0cBAOQYe3ArPL4bXkIpWWZB7LNokauh1BxiVoIunhy2ocEmZCvO3yqBZBM7R8db0NcuTmvAzszcZCiPGLq2wa486lhWRbAuDzHZBCBkpJova0xFPQfnL6RndCuiGnTTcS1SROptvVv8q0yY38oJ3t6DNECKZCzPdqhe58stRkZCoGZAnrktZBmvZA9uTAGMM4ziuRdwZDZD";
       AccessToken at = new AccessToken(tk);
       fb.setOAuthAccessToken(at);
       String[] s =  {"ndtv","TimesofIndia","bbcindia","hindustantimes","thehindu","cnnibn","cnbc","zee news","forbes India","DDNews","News9","Hitvada"};
       ResponseList<Post> feeds;
       
    for(int i=0;i<s.length;i++)
    {    
        System.out.println("yes");
      feeds = fb.getFeed(s[i]);
        System.out.println("no");
      System.out.println(s[i]+":"+feeds.size());
       for(int j=0;j<feeds.size();j++)
       {
          
             Post p = feeds.get(j);
           String msg = p.getMessage();
          // System.out.println(msg);
           bw.append(msg);
           
         
       }
    }
       bw.close();
        System.out.println("New without http");
   FileReader fr = new FileReader("D:/projectnew.txt");
   BufferedReader br = new BufferedReader(fr);
   FileWriter fw1 = new FileWriter("D:/final.txt");
   BufferedWriter bw1 = new BufferedWriter(fw);
   while(br.readLine()!=null)
   {
       String t = br.readLine();
       System.out.println(t);
       //if(t.contains("http"))
       /*{
           String[] temp = t.split("http");
           t=temp[0];
       }*/
       //System.out.println(t);
       if(!(t.equals(null)))
            bw1.write(t);
   }
    }
    
}
