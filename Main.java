public class Main {
    public static void main(String[] args) {
        odev1[]ogrenciler={
                new odev1("James ",334),
                new odev1("Jale ",412),
                new odev1("Kadir ",341),
                new odev1("Gökhan ",273),
                new odev1("Hakan ",278),
                new odev1("Suzan ",329),
                new odev1("Pınar ",445),
                new odev1("Mehmet ",402),
                new odev1("Ali ",388),
                new odev1("Emel ",270),
                new odev1("Fırat ",243),
                new odev1("Ersin ",393),
                new odev1("Deniz ",299),
                new odev1("Gözde ",343),
                new odev1("Anıl ",317),
                new odev1("Burak ",265),
        };
        System.out.println("İlk Üç Öğrenci : ");
        odev1 temp;
        for (int i = 0; i <ogrenciler.length ; i++) {
            for (int j = 0; j < ogrenciler.length-1 ; j++) {
                if(ogrenciler[j].getDerece()>ogrenciler[j+1].getDerece()){
                    temp=ogrenciler[j];
                    ogrenciler[j]=ogrenciler[j+1];
                    ogrenciler[j+1]=temp;
                }
                
            }
            
        }
        System.out.println("Birinci : " +ogrenciler[0]);
        System.out.println("İkinci : " +ogrenciler[1]);
        System.out.println("Üçüncü : " +ogrenciler[2]);
        siniflandir(ogrenciler);}
    public static void siniflandir(odev1[]ogrenciler){
        int[]siniflandirma=new int[3];
        for (odev1 ogrenci:ogrenciler){
            if(ogrenci.getDerece()>=200&&ogrenci.getDerece()<300){
                siniflandirma[0]++;

            }else if (ogrenci.getDerece()>=300&&ogrenci.getDerece()<400){
                siniflandirma[1]++;

            }else if(ogrenci.getDerece()>=400){
                siniflandirma[2]++;
            }

        }
        System.out.println("A ---> "+siniflandirma[0]);
        System.out.println("B ---> "+siniflandirma[1]);
        System.out.println("C ---> "+siniflandirma[2]);
    }
}
