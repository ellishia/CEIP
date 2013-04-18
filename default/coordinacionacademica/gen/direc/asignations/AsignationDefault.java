package direc.asignations;

import direc.asignations.Indice;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public abstract class AsignationDefault extends NodeFormImpl {
  public FieldSelect getAcademicYearField() {
    return ((org.monet.bpi.FieldSelect)this.getField("AsignationDefault", "AcademicYear"));
  }
  
  public Term getAcademicYear() {
    return ((org.monet.bpi.FieldSelect)this.getField("AsignationDefault", "AcademicYear")).get();
  }
  
  public void setAcademicYear(final Term value) {
    this.getAcademicYearField().set(value);
  }
  
  public FieldLink getStudentField() {
    return ((org.monet.bpi.FieldLink)this.getField("AsignationDefault", "Student"));
  }
  
  public Link getStudent() {
    return ((org.monet.bpi.FieldLink)this.getField("AsignationDefault", "Student")).get();
  }
  
  public Term getStudentAsTerm() {
    return ((org.monet.bpi.FieldLink)this.getField("AsignationDefault", "Student")).getAsTerm();
  }
  
  public void setStudent(final Link value) {
    this.getStudentField().set(value);
  }
  
  public Indice getIndice() {
    return (direc.asignations.Indice)this.getIndexEntry("direc.Asignations.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static AsignationDefault createNew(final Node parent) {
    return (direc.asignations.AsignationDefault)org.monet.bpi.NodeService.create(direc.asignations.AsignationDefault.class, parent);
  }
}
