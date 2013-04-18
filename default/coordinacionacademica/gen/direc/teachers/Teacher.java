package direc.teachers;

import direc.teachers.Indice;
import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldSerial;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;

@SuppressWarnings("all")
public class Teacher extends NodeFormImpl {
  public FieldText getNameField() {
    return ((org.monet.bpi.FieldText)this.getField("Teacher", "Name"));
  }
  
  public String getName() {
    return ((org.monet.bpi.FieldText)this.getField("Teacher", "Name")).get();
  }
  
  public void setName(final String value) {
    this.getNameField().set(value);
  }
  
  public FieldText getSurnameField() {
    return ((org.monet.bpi.FieldText)this.getField("Teacher", "Surname"));
  }
  
  public String getSurname() {
    return ((org.monet.bpi.FieldText)this.getField("Teacher", "Surname")).get();
  }
  
  public void setSurname(final String value) {
    this.getSurnameField().set(value);
  }
  
  public FieldSerial getIdentifierField() {
    return ((org.monet.bpi.FieldSerial)this.getField("Teacher", "Identifier"));
  }
  
  public String getIdentifier() {
    return ((org.monet.bpi.FieldSerial)this.getField("Teacher", "Identifier")).get();
  }
  
  public void setIdentifier(final String value) {
    this.getIdentifierField().set(value);
  }
  
  public FieldText getSpecialtyField() {
    return ((org.monet.bpi.FieldText)this.getField("Teacher", "Specialty"));
  }
  
  public String getSpecialty() {
    return ((org.monet.bpi.FieldText)this.getField("Teacher", "Specialty")).get();
  }
  
  public void setSpecialty(final String value) {
    this.getSpecialtyField().set(value);
  }
  
  public FieldDate getTeachingSinceField() {
    return ((org.monet.bpi.FieldDate)this.getField("Teacher", "TeachingSince"));
  }
  
  public Date getTeachingSince() {
    return ((org.monet.bpi.FieldDate)this.getField("Teacher", "TeachingSince")).get();
  }
  
  public void setTeachingSince(final Date value) {
    this.getTeachingSinceField().set(value);
  }
  
  public FieldText getLevelField() {
    return ((org.monet.bpi.FieldText)this.getField("Teacher", "Level"));
  }
  
  public String getLevel() {
    return ((org.monet.bpi.FieldText)this.getField("Teacher", "Level")).get();
  }
  
  public void setLevel(final String value) {
    this.getLevelField().set(value);
  }
  
  public Indice getIndice() {
    return (direc.teachers.Indice)this.getIndexEntry("direc.Teachers.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Teacher createNew(final Node parent) {
    return (direc.teachers.Teacher)org.monet.bpi.NodeService.create(direc.teachers.Teacher.class, parent);
  }
}
