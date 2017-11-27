/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcrawler;

/**
 *
 * @author VIKAS
 */
public class Filterdomain {
    private String dohash;
    private String dourl;

    public Filterdomain(String dhash, String durl) {
        //System.out.println("viaks filter ="+dhash);
        this.dohash = dhash;
        this.dourl = durl;
    }

    public String getDhash() {
        return dohash;
    }

    public String getDurl() {
        return dourl;
    }
    
}
