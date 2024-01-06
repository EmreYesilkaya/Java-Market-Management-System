import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Urun sınıfından aldığı ürün bilgileri sayesinde sipariş alır, 
 * siparişe dair bilgileri tutar, 
 * Müsteri sınıfından aldığı bilgilere siparişin ödemesini yapar, 
 * siparişin durumunu kontrol eder,
 * sipariş alına ürünleri Urun sınıfına iletir (stok takibi için).
 * @Burak, @Emre, @Karya
 */
public class SiparisVeOdeme
{
    private Urun v_urun;
    private Musteri v_müsteri;
    
    private String siparisID;
    private String siparisMiktari;
    private float odenecekTutar;
    private long siparisTarihi;
    private long telefonNo;
    private String siparisDurumu;
    private String teslimatAdresi;
    
    public SiparisVeOdeme()
    {
    
    }
    
    public SiparisVeOdeme (String p_siparisID)
    {
        siparisID = p_siparisID;
    }
    
    public String getSiparisID ()
    {
        return siparisID;
    }
    
    public String setSiparisID (String p_siparisID)
    {
        siparisID = p_siparisID;
        return siparisID;
    }
    
    public String getSiparisMiktari ()
    {
        return siparisMiktari;
    }
    
    public String setSiparisMiktari (String p_siparisMiktari)
    {
        siparisMiktari = p_siparisMiktari;
        return siparisMiktari;
    }
    
    public float getOdenecekTutar ()
    {
        return odenecekTutar;
    }
    
    public float setOdenecekTutar (float p_odenecekTutar)
    {
        odenecekTutar = p_odenecekTutar;
        return odenecekTutar;
    }
    
    public long getSiparisTarihi ()
    {
        return siparisTarihi;
    }
    
    public long setSiparisTarihi (long p_siparisTarihi)
    {
        siparisTarihi = p_siparisTarihi;
        return siparisTarihi;
    }
    
    public long getTelefonNo ()
    {
        return telefonNo;
    }
    
    public long setTelefonNo (long p_telefonNo)
    {
        telefonNo = p_telefonNo;
        return telefonNo;
    }
    
    public String getSiparisDurumu ()
    {
        return siparisDurumu;
    }
    
    public String setSiparisDurumu (String p_siparisDurumu)
    {
        siparisDurumu = p_siparisDurumu;
        return siparisDurumu;
    }
    
    public String getTeslimatAdresi ()
    {
        return teslimatAdresi;
    }
    
    public String setTeslimatAdresi (String p_teslimatAdresi)
    {
        teslimatAdresi = p_teslimatAdresi;
        return teslimatAdresi;
    }
    
    public void veriKaydetSiparisVeOdeme(String p_siparisVeOdemeBilgisi)
    {
        System.out.println("Siparis ve odeme bilgileri veri tabanına kaydedilmiştir.");
    }
}