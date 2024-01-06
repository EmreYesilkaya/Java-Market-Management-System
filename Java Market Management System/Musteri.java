/**
 * Müşteriye ait bilgilerin tutulduğu sınıftır.
 * @Burak, @Emre, @Karya
 */
public class Musteri 
{
    private String musteriID;
    private String musteriAdi;
    private String musteriSoyadi;
    private char cinsiyeti;
    private long telefonNo;
    private String email;
    private String adres;
    private String musteriSifresi;
    private long krediKartNo;

    public Musteri() 
    {
        
    }

    public Musteri(String p_musteriID) 
    {
        musteriID = p_musteriID;
    }
    
    public String getMusteriID() 
    {
        return musteriID;
    }

    public String setMusteriID(String p_musteriID) 
    {
        musteriID = p_musteriID;
        return musteriID;
    }

    public String getMusteriAdi() 
    {
        return musteriAdi;
    }

    public String setMusteriAdi(String p_musteriAdi) 
    {
        musteriAdi = p_musteriAdi;
        return musteriAdi;
    }

    public String getMusteriSoyadi() 
    {
        return musteriSoyadi;
    }

    public String setMusteriSoyadi(String p_musteriSoyadi) 
    {
        musteriSoyadi = p_musteriSoyadi;
        return musteriSoyadi;
    }

    public char getCinsiyeti() 
    {
        return cinsiyeti;
    }

    public char setCinsiyeti(char p_cinsiyet) 
    {
        cinsiyeti = p_cinsiyet;
        return cinsiyeti;
    }

    public long getTelefonNo() 
    {
        return telefonNo;
    }

    public long setTelefonNo(long p_telefonNo) 
    {
        telefonNo = p_telefonNo;
        return telefonNo;
    }

    public String getEmail() 
    {
        return email;
    }

    public String setEmail(String p_email) 
    {
        email = p_email;
        return email;
    }

    public String getAdres() 
    {
        return adres;
    }

    public String setAdres(String p_adres) 
    {
        adres = p_adres;
        return adres;
    }

    public String getMusteriSifresi() 
    {
        return musteriSifresi;
    }

    public String setMusteriSifresi(String p_musteriSifresi) 
    {
        musteriSifresi = p_musteriSifresi;
        return musteriSifresi;
    }

    public long getKrediKartNo() 
    {
        return krediKartNo;
    }

    public long setKrediKartNo(long p_krediKartNo) 
    {
        krediKartNo = p_krediKartNo;
        return krediKartNo;
    }
    
    public void veriKaydetMüsteri(String müsteriBilgisi)
    {
        System.out.println("Müsteri bilgileri veri tabanına kaydedilmiştir.");
    }
    
}