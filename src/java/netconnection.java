
import java.net.URL;
import java.net.URLConnection;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author G0pS
 */
public class netconnection {
    boolean  connection(){
    boolean connectivity;
        try {
            URL url = new URL("http://www.google.com/");
            URLConnection conn = url.openConnection();
            conn.connect();
            connectivity = true;
        } catch (Exception e) {
            connectivity = false;
        }
//        if(connectivity){
//        System.out.println("Connection available");
//        }
//        else
//            System.out.println("No Connection is available");
    
        return connectivity;
    }
}
