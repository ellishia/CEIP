package direc.groups;

import direc.groups.Indice;
import java.util.ArrayList;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldSerial;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Group extends NodeFormImpl {
  public FieldText getNameField() {
    return ((org.monet.bpi.FieldText)this.getField("Group", "Name"));
  }
  
  public String getName() {
    return ((org.monet.bpi.FieldText)this.getField("Group", "Name")).get();
  }
  
  public void setName(final String value) {
    this.getNameField().set(value);
  }
  
  public FieldSelect getEducationalLevelField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Group", "EducationalLevel"));
  }
  
  public Term getEducationalLevel() {
    return ((org.monet.bpi.FieldSelect)this.getField("Group", "EducationalLevel")).get();
  }
  
  public void setEducationalLevel(final Term value) {
    this.getEducationalLevelField().set(value);
  }
  
  public FieldSelect getAcademicYearField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Group", "AcademicYear"));
  }
  
  public Term getAcademicYear() {
    return ((org.monet.bpi.FieldSelect)this.getField("Group", "AcademicYear")).get();
  }
  
  public void setAcademicYear(final Term value) {
    this.getAcademicYearField().set(value);
  }
  
  public FieldMultiple<FieldLink,Link> getStudentsField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("Group", "Students"));
  }
  
  public ArrayList<Link> getStudents() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("Group", "Students")).getAll();
  }
  
  public ArrayList<Term> getStudentsAsTerm() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("Group", "Students")).getAllAsTerm();
  }
  
  public FieldSerial getIdentifierField() {
    return ((org.monet.bpi.FieldSerial)this.getField("Group", "Identifier"));
  }
  
  public String getIdentifier() {
    return ((org.monet.bpi.FieldSerial)this.getField("Group", "Identifier")).get();
  }
  
  public void setIdentifier(final String value) {
    this.getIdentifierField().set(value);
  }
  
  public Indice getIndice() {
    return (direc.groups.Indice)this.getIndexEntry("direc.Groups.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Group createNew(final Node parent) {
    return (direc.groups.Group)org.monet.bpi.NodeService.create(direc.groups.Group.class, parent);
  }
}
