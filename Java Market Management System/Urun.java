/**
 * Ürünlere ait bilgilerin tutulduğu sınıftır.
 * SiparisVeOdeme sınıfından aldığı bilgiyle ürün stok takibi yapar.
 * @Burak, @Emre, @Karya
 */
public class Urun
{
    protected String urunID;
    protected String urunAdi;
    protected String urunGrubu;
    protected String tedarikci;
    protected String satisBirimi = "TL";
    protected float urunfiyati;
    protected int satisMiktari;
    protected long subeKodu;

    public Urun ()
    {
        
     }

    public Urun (String p_urunID)
    {
        urunID = p_urunID;
    }
    
    public String getUrunID ()
    {
        return urunID;
    }
    
    public String setUrunID (String p_urunID)
    {
        urunID = p_urunID;
        return urunID;
    }
    
    public String getUrunAdi()
    {
        return urunAdi;
    }
    
    public String setUrunAdi (String p_urunAdi)
    {
        urunAdi = p_urunAdi;
        return urunAdi;
    }
    
    public String getUrunGrubu ()
    {
        return urunGrubu;
    }
    
    public String setUrunGrubu (String p_urunGrubu)
    {
        urunGrubu = p_urunGrubu;
        return urunGrubu;
    }
    
    public String getTedarikci ()
    {
        return tedarikci;
    }
    
    public String setTedarikci (String p_tedarikci)
    {
        tedarikci = p_tedarikci;
        return tedarikci;
    }
    
    public String getSatisBirimi ()
    {
        return satisBirimi;
    }
    
    public String setSatisBirimi (String p_satisBirimi)
    {
        satisBirimi = p_satisBirimi;
        return satisBirimi;
    }
    
    public float getUrunFiyati ()
    {
        return urunfiyati;
    }
    
    public float setUrunFiyati (float p_urunFiyati)
    {
        urunfiyati = p_urunFiyati;
        return urunfiyati;
    }
    
    public int getSatisMiktari ()
    {
        return satisMiktari;
    }
    
    public int setSatisMiktari (int p_satisMiktari)
    {
        satisMiktari = p_satisMiktari;
        return satisMiktari;
    }
        
    public long getSubeKodu ()
    {
        return subeKodu;
    }
    
    public long setSubeKodu (long p_subeKodu)
    {
        subeKodu = p_subeKodu;
        return subeKodu;
    }
    
    public String getUrunAdi(String p_urunAdi)
    {
        return urunAdi;
    }
    
    public String getUrunGrubu (String p_urunGrubu)
    {
        return urunGrubu;
    }
    
    public String getTedarikci (String p_tedarikci)
    {
        return tedarikci;
    }
    
    public String getSatisBirimi (String p_satisBirimi)
    {
        return satisBirimi;
    }
    
    public float getUrunFiyati (String p_urunFiyati)
    {
        return urunfiyati;
    }
    
    public int getSatisMiktari (int p_satisMiktari)
    {
        return satisMiktari;
    }
    
    public long getSudeKodu (String p_subeKodu)
    {
        return subeKodu;
    }

    public void veriKaydet(String p_urunBilgisi)
    {
        System.out.println("Ürün bilgileri veri tabanına kaydedilmiştir.");
    }
}
