package serv.users;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Name = new org.monet.bpi.Param("imkufqig");
  
  public String getName() {
    return (java.lang.String)this.getAttribute("imkufqig");
  }
  
  public void setName(final String Name) {
    this.setAttribute("imkufqig", Name);
  }
  
  public final static Param Surname = new org.monet.bpi.Param("mqkfmla");
  
  public String getSurname() {
    return (java.lang.String)this.getAttribute("mqkfmla");
  }
  
  public void setSurname(final String Surname) {
    this.setAttribute("mqkfmla", Surname);
  }
}
