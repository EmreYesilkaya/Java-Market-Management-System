public class Kontrollor
{
    private KontrolorMusteri p_kontrolorMusteri;
    private KontrolorUser p_kontrolorUser;
    private KontrolorUrun p_kontrolorUrun;
    private KontrolorSiparisVeOdeme p_kontrolorSiparisVeOdeme;

    public Kontrollor()
    {
      p_kontrolorMusteri = new KontrolorMusteri(); 
      p_kontrolorUser = new KontrolorUser(); 
      p_kontrolorUrun = new KontrolorUrun();
      p_kontrolorSiparisVeOdeme = new KontrolorSiparisVeOdeme();
    }
}