package direc.students;

import direc.students.Index;
import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Student extends NodeFormImpl {
  public Index getIndex() {
    return (direc.students.Index)this.getIndexEntry("direc.Students.Index");
  }
  
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
  
  public FieldSelect getLevelField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Student", "Level"));
  }
  
  public Term getLevel() {
    return ((org.monet.bpi.FieldSelect)this.getField("Student", "Level")).get();
  }
  
  public void setLevel(final Term value) {
    this.getLevelField().set(value);
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
  
  public FieldDate getDate_of_BirthField() {
    return ((org.monet.bpi.FieldDate)this.getField("Student", "Date_of_Birth"));
  }
  
  public Date getDate_of_Birth() {
    return ((org.monet.bpi.FieldDate)this.getField("Student", "Date_of_Birth")).get();
  }
  
  public void setDate_of_Birth(final Date value) {
    this.getDate_of_BirthField().set(value);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Student createNew(final Node parent) {
    return (direc.students.Student)org.monet.bpi.NodeService.create(direc.students.Student.class, parent);
  }
}
