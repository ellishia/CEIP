package doc.groups;

import doc.groups.Indice;
import java.util.ArrayList;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSelect;
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
  
  public FieldSelect getGradeField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Group", "Grade"));
  }
  
  public Term getGrade() {
    return ((org.monet.bpi.FieldSelect)this.getField("Group", "Grade")).get();
  }
  
  public void setGrade(final Term value) {
    this.getGradeField().set(value);
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
  
  public FieldSelect getLevelField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Group", "Level"));
  }
  
  public Term getLevel() {
    return ((org.monet.bpi.FieldSelect)this.getField("Group", "Level")).get();
  }
  
  public void setLevel(final Term value) {
    this.getLevelField().set(value);
  }
  
  public FieldSelect getAreaField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Group", "Area"));
  }
  
  public Term getArea() {
    return ((org.monet.bpi.FieldSelect)this.getField("Group", "Area")).get();
  }
  
  public void setArea(final Term value) {
    this.getAreaField().set(value);
  }
  
  public Indice getIndice() {
    return (doc.groups.Indice)this.getIndexEntry("doc.Groups.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Group createNew(final Node parent) {
    return (doc.groups.Group)org.monet.bpi.NodeService.create(doc.groups.Group.class, parent);
  }
}
