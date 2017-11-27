
package webcrawler;

public class Handler_html {
    
    public static String Url(String inputURL, Filterdomain dom)
    {   String reurl="";
        if(!inputURL.startsWith(dom.getDurl()))    // checking for URL formats 
        {
                if(!inputURL.startsWith("http"))
                {  
                if(inputURL.startsWith("/"))
                     reurl=dom.getDurl().concat(inputURL);
                 else
                     reurl=dom.getDurl().concat("/"+inputURL);
                }
                else
                    reurl=inputURL;
                
                    
        }
        
       if(reurl.endsWith("/"))
         reurl=reurl.substring(0,reurl.length()-1);
       if(reurl.endsWith("#"))
         reurl=reurl.substring(0,reurl.indexOf("#"));
        return reurl;
   
    }
    
    
}
