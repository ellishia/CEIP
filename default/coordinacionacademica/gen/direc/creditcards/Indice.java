package direc.creditcards;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param AcademicYear = new org.monet.bpi.Param("mtnylpq");
  
  public Term getAcademicYear() {
    return (org.monet.bpi.types.Term)this.getAttribute("mtnylpq");
  }
  
  public void setAcademicYear(final Term AcademicYear) {
    this.setAttribute("mtnylpq", AcademicYear);
  }
  
  public final static Param CardNumber = new org.monet.bpi.Param("myfgj_a");
  
  public String getCardNumber() {
    return (java.lang.String)this.getAttribute("myfgj_a");
  }
  
  public void setCardNumber(final String CardNumber) {
    this.setAttribute("myfgj_a", CardNumber);
  }
  
  public final static Param Bank = new org.monet.bpi.Param("maumdtg");
  
  public String getBank() {
    return (java.lang.String)this.getAttribute("maumdtg");
  }
  
  public void setBank(final String Bank) {
    this.setAttribute("maumdtg", Bank);
  }
}
