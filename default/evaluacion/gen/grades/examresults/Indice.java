package grades.examresults;

import org.monet.bpi.Param;
import org.monet.bpi.java.IndexEntryImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Term;

@SuppressWarnings(value = "all")
public class Indice extends IndexEntryImpl {
  public final static Param Subject = new org.monet.bpi.Param("imkcv5_a");
  
  public Term getSubject() {
    return (org.monet.bpi.types.Term)this.getAttribute("imkcv5_a");
  }
  
  public void setSubject(final Term Subject) {
    this.setAttribute("imkcv5_a", Subject);
  }
  
  public final static Param Group = new org.monet.bpi.Param("msmlfaw");
  
  public Term getGroup() {
    return (org.monet.bpi.types.Term)this.getAttribute("msmlfaw");
  }
  
  public void setGroup(final Term Group) {
    this.setAttribute("msmlfaw", Group);
  }
  
  public final static Param Teacher = new org.monet.bpi.Param("m_gi5gg");
  
  public Term getTeacher() {
    return (org.monet.bpi.types.Term)this.getAttribute("m_gi5gg");
  }
  
  public void setTeacher(final Term Teacher) {
    this.setAttribute("m_gi5gg", Teacher);
  }
  
  public final static Param Date = new org.monet.bpi.Param("mgypnuw");
  
  public Date getDate() {
    return (org.monet.bpi.types.Date)this.getAttribute("mgypnuw");
  }
  
  public void setDate(final Date Date) {
    this.setAttribute("mgypnuw", Date);
  }
}
