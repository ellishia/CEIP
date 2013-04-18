package grades.students;

import grades.students.Index;
import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Term;

@SuppressWarnings(value = "all")
public class Student extends NodeFormImpl {
  public Index getIndex() {
    return (grades.students.Index)this.getIndexEntry("grades.Students.Index");
  }
  
  public FieldText getNombreField() {
    return ((org.monet.bpi.FieldText)this.getField("Student", "Nombre"));
  }
  
  public String getNombre() {
    return ((org.monet.bpi.FieldText)this.getField("Student", "Nombre")).get();
  }
  
  public void setNombre(final String value) {
    this.getNombreField().set(value);
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
  
  public FieldText getGenderField() {
    return ((org.monet.bpi.FieldText)this.getField("Student", "Gender"));
  }
  
  public String getGender() {
    return ((org.monet.bpi.FieldText)this.getField("Student", "Gender")).get();
  }
  
  public void setGender(final String value) {
    this.getGenderField().set(value);
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
  
  public FieldText getNeigbourhoodField() {
    return ((org.monet.bpi.FieldText)this.getField("Student", "Neigbourhood"));
  }
  
  public String getNeigbourhood() {
    return ((org.monet.bpi.FieldText)this.getField("Student", "Neigbourhood")).get();
  }
  
  public void setNeigbourhood(final String value) {
    this.getNeigbourhoodField().set(value);
  }
  
  public FieldText getCityField() {
    return ((org.monet.bpi.FieldText)this.getField("Student", "City"));
  }
  
  public String getCity() {
    return ((org.monet.bpi.FieldText)this.getField("Student", "City")).get();
  }
  
  public void setCity(final String value) {
    this.getCityField().set(value);
  }
  
  public FieldSelect getParentAcademicLevelField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Student", "ParentAcademicLevel"));
  }
  
  public Term getParentAcademicLevel() {
    return ((org.monet.bpi.FieldSelect)this.getField("Student", "ParentAcademicLevel")).get();
  }
  
  public void setParentAcademicLevel(final Term value) {
    this.getParentAcademicLevelField().set(value);
  }
  
  public FieldSelect getMotherAcademicLevelField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Student", "MotherAcademicLevel"));
  }
  
  public Term getMotherAcademicLevel() {
    return ((org.monet.bpi.FieldSelect)this.getField("Student", "MotherAcademicLevel")).get();
  }
  
  public void setMotherAcademicLevel(final Term value) {
    this.getMotherAcademicLevelField().set(value);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Student createNew(final Node parent) {
    return (grades.students.Student)org.monet.bpi.NodeService.create(grades.students.Student.class, parent);
  }
}
