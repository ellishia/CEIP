package doc.alumnado;

import doc.alumnado.Indice;
import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;

@SuppressWarnings("all")
public class Student extends NodeFormImpl {
  public FieldText getNameField() {
    return ((org.monet.bpi.FieldText)this.getField("Student", "Name"));
  }
  
  public String getName() {
    return ((org.monet.bpi.FieldText)this.getField("Student", "Name")).get();
  }
  
  public void setName(final String value) {
    this.getNameField().set(value);
  }
  
  public FieldText getSurnameField() {
    return ((org.monet.bpi.FieldText)this.getField("Student", "Surname"));
  }
  
  public String getSurname() {
    return ((org.monet.bpi.FieldText)this.getField("Student", "Surname")).get();
  }
  
  public void setSurname(final String value) {
    this.getSurnameField().set(value);
  }
  
  public FieldText getCialField() {
    return ((org.monet.bpi.FieldText)this.getField("Student", "Cial"));
  }
  
  public String getCial() {
    return ((org.monet.bpi.FieldText)this.getField("Student", "Cial")).get();
  }
  
  public void setCial(final String value) {
    this.getCialField().set(value);
  }
  
  public FieldDate getBirthDateField() {
    return ((org.monet.bpi.FieldDate)this.getField("Student", "BirthDate"));
  }
  
  public Date getBirthDate() {
    return ((org.monet.bpi.FieldDate)this.getField("Student", "BirthDate")).get();
  }
  
  public void setBirthDate(final Date value) {
    this.getBirthDateField().set(value);
  }
  
  public FieldText getDataField() {
    return ((org.monet.bpi.FieldText)this.getField("Student", "Data"));
  }
  
  public String getData() {
    return ((org.monet.bpi.FieldText)this.getField("Student", "Data")).get();
  }
  
  public void setData(final String value) {
    this.getDataField().set(value);
  }
  
  public Indice getIndice() {
    return (doc.alumnado.Indice)this.getIndexEntry("doc.Alumnado.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Student createNew(final Node parent) {
    return (doc.alumnado.Student)org.monet.bpi.NodeService.create(doc.alumnado.Student.class, parent);
  }
}
