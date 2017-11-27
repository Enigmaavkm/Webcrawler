
package webcrawler;
import java.net.*;
import java.io.*;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class crawler extends javax.swing.JFrame {
    public String s;
    public String inputword;
    public Document d;
    public boolean test=false;
    
    ArrayList<String> url_list=new ArrayList<String>();  // for seaching words from all URL 
    public crawler() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
 
        jLabel2 = new javax.swing.JLabel();    // for image
        jLabel3 = new javax.swing.JLabel();    // for enter url
        jTextField1 = new javax.swing.JTextField();  // for input text
        jButton1 = new javax.swing.JButton();      // for crawling 
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();  // for seaching element
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();    // for showing result
        jButton4 = new javax.swing.JButton();  // for searching


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\VIKAS\\Documents\\NetBeansProjects\\Webcrawling\\src\\webcrawler\\WEBCRAWLER.jpg")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("Enter URL :");

        jTextField1.setText("www.google.com"); //default page
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Crawl !");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3,14)); // NOI18N
        jLabel1.setText("Search For Any Keyword :");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton4.setText("SEARCH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jTextField2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code :
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         s=jTextField1.getText();  // crawling seed
         s.toLowerCase();
         
         test =false;  // for checking result after crawl 
         //System.out.println("vikas input=  "+s);
         try {
            crawler();
            //System.out.print(s);
        } catch (Exception ex) {
            Logger.getLogger(crawler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                        

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {                                       
       
        
    }                                      

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         inputword=jTextField2.getText();  // searching word from crawl's result
         
         if(test==false)
             jLabel4.setText("Crawl First");
         else{
             int cnt=searchword();   // cnt stores no. of occurance of searching word
            if(cnt>0)
            {
                
                String c="Matching, Count: ";
                c=c+String.valueOf(cnt);
             
                jLabel4.setText(c);
            }
            else
            {
                String d="Not found";
                jLabel4.setText(d);
            }
         }
    }                                        
public void crawler()
{
    jTextArea1.setText("");  //commment clear the screen
    String url=geturl(s);  // returns http://www.google.com
    
    HashSet<String> tags=crawlingSeed(url);
    
    HashMap<String,Integer> maplist=new HashMap<String,Integer>();
    for(String itr : tags){
        maplist.put(itr,1);
    }
    
    // finding urls from another level 
        
    try
    {
      for(int depth=2;depth<=4;depth++)  
      {
        HashSet<String> temp= new HashSet<String>();
        //System.out.println(depth+" size="+tags.size());
        for(String itr:tags){
              
            if(url_verification(itr))
            {
                //System.out.println(itr);
                HashSet<String> temp2= crawlingSeed(itr);
                for(String itr1: temp2){
                    if(!maplist.containsKey(itr1)){
                     temp.add(itr1);
                     maplist.put(itr1, depth);
                     //System.out.println(itr1+"      depth="+depth);
                    }
                }
            }
        }
        tags.clear();
        tags=temp;
      }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
  
    url_list.clear();  
    
    // categorizing URL level-wise 
    
    ArrayList<String> lst1= new ArrayList<String>();
    ArrayList<String> lst2= new ArrayList<String>();
    ArrayList<String> lst3= new ArrayList<String>();
    ArrayList<String> lst4= new ArrayList<String>();
    
    for (Map.Entry  itr:maplist.entrySet() ){
        
        //System.out.println(Integer.valueOf(itr.getValue().toString())+" vkm ");
        if(Integer.valueOf(itr.getValue().toString())==1)
            lst1.add(itr.getKey().toString());
        else if(Integer.valueOf(itr.getValue().toString())==2)
            lst2.add(itr.getKey().toString());
        else if(Integer.valueOf(itr.getValue().toString())==3)
            lst3.add(itr.getKey().toString());
        else
            lst4.add(itr.getKey().toString());
        
        url_list.add(itr.getKey().toString());
    }
    
    // showing result level-wise
    
    if(lst1.size()>0){
        jTextArea1.append("<--------------------------------------Level: 1--------------------------------------->");
         jTextArea1.append("\n");
        for(String itr:lst1){
             jTextArea1.append(itr);
            jTextArea1.append("\n");
        }
    }
    
    if(lst2.size()>0){
        jTextArea1.append("\n");
        jTextArea1.append("<--------------------------------------Level: 2--------------------------------------->");
        jTextArea1.append("\n");
        for(String itr:lst2){
             jTextArea1.append(itr);
             jTextArea1.append("\n");
         }
    }
    
    if(lst3.size()>0){
        jTextArea1.append("\n");
        jTextArea1.append("<--------------------------------------Level: 3--------------------------------------->");
        jTextArea1.append("\n");
        for(String itr:lst3){
             jTextArea1.append(itr);
             jTextArea1.append("\n");
         }
    }
    
    
    if(lst4.size()>0){
        jTextArea1.append("\n");
        jTextArea1.append("<--------------------------------------Level: 4--------------------------------------->");
        jTextArea1.append("\n");
        for(String itr:lst4){
             jTextArea1.append(itr);
             jTextArea1.append("\n");
         }
    }
    
   
         //System.out.println("Number of pages visited :"+tags.size());
         System.out.println("s1="+lst1.size()+" s2="+lst2.size()+" s3="+lst3.size());
         if(lst1.size()>0){
             jTextArea1.append("\n Number of pages on level 1: "+lst1.size());
         }
         if(lst2.size()>0){
             jTextArea1.append("\n Number of pages on level 2: "+lst2.size());
         }
         if(lst3.size()>0){
             jTextArea1.append("\n Number of pages on level 3: "+lst3.size());
         }
         if(lst4.size()>0){
             jTextArea1.append("\n Number of pages on level 4: "+lst4.size());
         }
         String a="\n Total number of pages visited :"+url_list.size();
         if(url_list.size()>0)
             test=true;
         jTextArea1.append(a);
         
         jTextArea1.append("\n----------------------------------------------------\n");
         
}

// seaching LIST of URL for given URL
public HashSet<String> crawlingSeed(String url)
{
    Searcher s=new Searcher();
    Filterdomain domain=new Filterdomain(Searcher.hash(url),url);
    Domain dom=new Domain (domain.getDhash(),domain.getDurl(),domain);
    s.hash(url);
    HashSet<String> tags=new HashSet<String> ();
        try
        {
              d = Jsoup.connect(url).get();
              Elements reference = d.select("a");   // selecting <a> <a/> element from document
            for (Element iter:reference)
            {   String temp=iter.attr("href");
                temp=Handler_html.Url(temp,domain);   // for getting correct formats url such as https://knit.ac.in
                //updateTextArea(temp);
                tags.add(temp);
                
        //      System.out.println(temp);
             }
        } catch (Exception e) {
                 System.out.println(e);
            }
        
       return tags;
}

// url verification 

public boolean url_verification(String url)
{
    if(url.startsWith("http://")||url.startsWith("https://")){
        if(((url.endsWith(".in")||url.endsWith(".com"))||(url.endsWith(".org")||url.endsWith(".gov")))||(url.endsWith(".edu")||url.endsWith(".net")))
            return true;
    }
    return false;
}

// searching words in Arraylist url_list
public int searchword()
    { 
         if(url_list.size()==0)
            return 0;
        else{
             //inputword.trim();
             int cnt=0;
            for(String str :url_list){
                //System.out.println(str.toUpperCase()+"   vkm = "+ inputword.toUpperCase().trim()+"vkm");
                if((str.toUpperCase()).contains(inputword.toUpperCase().trim()))
                    cnt++;
            }
            return cnt;
        }
    }
  
// adding https if not added

    public  String geturl(String inputurl)
    {
     /*     Scanner read=new Scanner(System.in);
            String inputurl=read.nextLine();*/
             //.String  inputurl="http://www.jsoup.org"; 
        
        //System.out.print(c.s);
             if (inputurl.startsWith("www"))
                 inputurl="http://"+inputurl;
              return inputurl;
    }
    
    
    public void updateTextArea(final String text) {
  SwingUtilities.invokeLater(new Runnable() {
    public void run() {
      jTextArea1.append(text);
    }
  });
}
 
private void redirectSystemStreams() {
  OutputStream out = new OutputStream() {
    @Override
    public void write(int b) throws IOException {
      updateTextArea(String.valueOf((char) b));
    }
 
    @Override
    public void write(byte[] b, int off, int len) throws IOException {
      updateTextArea(new String(b, off, len));
    }
 
    @Override
    public void write(byte[] b) throws IOException {
      write(b, 0, b.length);
    }
  };
 
  System.setOut(new PrintStream(out, true));
  System.setErr(new PrintStream(out, true));
}
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(crawler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crawler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crawler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crawler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crawler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    javax.swing.JButton jButton3;
    javax.swing.JButton jButton4;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTextArea jTextArea1;
     javax.swing.JTextField jTextField1;
    javax.swing.JTextField jTextField2;
    // End of variables declaration                   
}
