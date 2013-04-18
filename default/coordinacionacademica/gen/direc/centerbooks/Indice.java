package direc.centerbooks;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Indice extends IndexEntryImpl {
  public final static Param Title = new org.monet.bpi.Param("imiv3eja");
  
  public String getTitle() {
    return (java.lang.String)this.getAttribute("imiv3eja");
  }
  
  public void setTitle(final String Title) {
    this.setAttribute("imiv3eja", Title);
  }
  
  public final static Param Level = new org.monet.bpi.Param("mxw7sxa");
  
  public Term getLevel() {
    return (org.monet.bpi.types.Term)this.getAttribute("mxw7sxa");
  }
  
  public void setLevel(final Term Level) {
    this.setAttribute("mxw7sxa", Level);
  }
  
  public final static Param Editorial = new org.monet.bpi.Param("m2n3hcw");
  
  public String getEditorial() {
    return (java.lang.String)this.getAttribute("m2n3hcw");
  }
  
  public void setEditorial(final String Editorial) {
    this.setAttribute("m2n3hcw", Editorial);
  }
  
  public final static Param PublicationYear = new org.monet.bpi.Param("mcgr0eg");
  
  public String getPublicationYear() {
    return (java.lang.String)this.getAttribute("mcgr0eg");
  }
  
  public void setPublicationYear(final String PublicationYear) {
    this.setAttribute("mcgr0eg", PublicationYear);
  }
}
