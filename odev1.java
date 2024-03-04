public class odev1 {
    private String isim;
    private int derece;
    public odev1(String isim,int derece){
        this.isim=isim;
        this.derece=derece;
    }
    public String getIsim(){
        return isim;
    }
    public void setIsim(String isim){
        this.isim=isim;

    }
    public int getDerece(){
        return derece;

    }
    public void setDerece(int derece){
        this.derece=derece;
    }
    @Override
    public String toString(){
        return isim+""+derece;
    }
}


