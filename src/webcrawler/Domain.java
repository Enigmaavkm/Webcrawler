
package webcrawler;

public class Domain {
    private String dohash;
    private String dourl;
    private Filterdomain dom;

    public Domain(String dhash, String durl,Filterdomain dom) {
        this.dohash = dhash;
        this.dourl = durl;
        this.dom=dom;
    }

    public String getDhash() {
        return dohash;
    }

    public String getDurl() {
        return dourl;
    }

    public Filterdomain getDom() {
        return dom;
    }

 }
    

