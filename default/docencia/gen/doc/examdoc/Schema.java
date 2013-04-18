package doc.examdoc;

import doc.examdoc.schema.Questions;
import java.util.ArrayList;
import org.monet.bpi.types.Date;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "schema", strict = false)
@SuppressWarnings("all")
public class Schema implements org.monet.bpi.Schema {
  @ElementList(name = "Questions", required = false)
  private ArrayList<Questions> Questions = new java.util.ArrayList<doc.examdoc.schema.Questions>();
  
  public ArrayList<Questions> getQuestions() {
    return this.Questions;
  }
  
  public void setQuestions(final ArrayList<Questions> Questions) {
    this.Questions = Questions;
  }
  
  @Element(name = "Name", required = false)
  private String Name;
  
  public String getName() {
    return this.Name;
  }
  
  public void setName(final String Name) {
    this.Name = Name;
  }
  
  @Element(name = "CentroAcademico", required = false)
  private String CentroAcademico;
  
  public String getCentroAcademico() {
    return this.CentroAcademico;
  }
  
  public void setCentroAcademico(final String CentroAcademico) {
    this.CentroAcademico = CentroAcademico;
  }
  
  @Element(name = "AnyoAcademico", required = false)
  private String AnyoAcademico;
  
  public String getAnyoAcademico() {
    return this.AnyoAcademico;
  }
  
  public void setAnyoAcademico(final String AnyoAcademico) {
    this.AnyoAcademico = AnyoAcademico;
  }
  
  @Element(name = "DocumentType", required = false)
  private String DocumentType;
  
  public String getDocumentType() {
    return this.DocumentType;
  }
  
  public void setDocumentType(final String DocumentType) {
    this.DocumentType = DocumentType;
  }
  
  @Element(name = "Date", required = false)
  private Date Date;
  
  public Date getDate() {
    return this.Date;
  }
  
  public void setDate(final Date Date) {
    this.Date = Date;
  }
  
  @Element(name = "Group", required = false)
  private String Group;
  
  public String getGroup() {
    return this.Group;
  }
  
  public void setGroup(final String Group) {
    this.Group = Group;
  }
  
  @Element(name = "Subject", required = false)
  private String Subject;
  
  public String getSubject() {
    return this.Subject;
  }
  
  public void setSubject(final String Subject) {
    this.Subject = Subject;
  }
  
  @Element(name = "Instructions", required = false)
  private String Instructions;
  
  public String getInstructions() {
    return this.Instructions;
  }
  
  public void setInstructions(final String Instructions) {
    this.Instructions = Instructions;
  }
}
