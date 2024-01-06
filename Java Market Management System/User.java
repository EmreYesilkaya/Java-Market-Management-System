/**
 * Yazılım kullanıcısına (user) ait bilgileri tutar.
 * @Burak, @Emre, @Karya
 */
public class User
{
    private String kullaniciID;
    private String kullaniciAdi;
    private String kullaniciSoyadi;
    private String kullaniciRolu;
    private String kullaniciSifresi;
 
    /**
     * Constructor for objects of class User
     */
    public User()
    {
       
    }
    
    public User (String p_kullaniciID)
    {
        kullaniciID = p_kullaniciID;
    }

    public String getKullaniciID ()
    {
        return kullaniciID;
    }

    public String setKullaniciID (String p_KullaniciID)
    {
        kullaniciID = p_KullaniciID;
        return kullaniciID;
    }

    public String getKullaniciAdi ()
    {
        return kullaniciAdi;
    }

      public String setKullaniciAdi (String p_KullaniciAdi)
    {
        kullaniciAdi = p_KullaniciAdi;
        return kullaniciAdi;
    }

     public String getKullaniciSoyadi()
    {
        return kullaniciSoyadi;
    }

      public String setKullaniciSoyadi (String p_KullaniciSoyadi)
    {
        kullaniciSoyadi = p_KullaniciSoyadi;
        return kullaniciSoyadi;
    }

     public String getKullaniciRolu()
    {
        return kullaniciRolu;
    }

      public String setKullaniciRolu (String p_KullaniciRolu)
    {
        kullaniciRolu = p_KullaniciRolu;
        return kullaniciRolu;
    }

      public String getkullaniciSifresi()
    {
        return kullaniciSifresi;
    }

      public String setkullaniciSifresi (String p_KullaniciSifresi)
    {
        kullaniciSifresi = p_KullaniciSifresi;
        return kullaniciSifresi;
    }

    public void veriKaydetUser(String p_userBilgisi)
    {
        System.out.println("User bilgileri veri tabanına kaydedilmiştir.");
    }
    
}
