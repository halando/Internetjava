/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package internet.terkep;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author diak
 */
public class InternetTerkep{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        System.out.print("URL:");
        Scanner sr = new Scanner(System.in);
        String url = sr.nextLine();
        url=url.replaceAll("http://","https://");
        URL cim = new URL(url);
        if(cim.getProtocol().equals("http://")){
            Pattern joSor=Pattern.compile("^.*<a.*href=\".*$");
            Matcher eredmeny=joSor.matcher("...");
            if(eredmeny.matches()){
                
            }
        url=url.replaceAll("http://", "");
        url="https://"+url;
        cim= new URL(url);
        
    }
        HttpURLConnection.getFollowRedirects(true);
        System.out.println(HttpURLConnection.getFollowRedirects());
        System.out.println(cim);
        InputStream is = cim.openStream();
         sr = new Scanner(is);
        System.out.println(is);
        boolean feltetel = sr.hasNextLine();
        System.out.println(feltetel);
       // System.out.println(is.available());
      /*InputStreamReader isr = new InputStreamReader(is);
       BufferedReader br = new BufferedReader(isr);
       boolean feltetel=isr.ready();
       System.out.println(feltetel);*/
        while(feltetel){
          System.out.println(sr.nextLine());
           feltetel = sr.hasNextLine();
           /*httpSystem.out.println(feltetel);
        }*/
         /* System.out.println(br.readLine());
          feltetel = isr.ready();*/
           
        }
    }
    
}
