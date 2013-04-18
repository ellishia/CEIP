package doc.subjectlevels.subjectlevel;

import doc.subjectlevels.Indice;
import doc.subjectlevels.SubjectLevel;
import org.monet.bpi.java.MappingImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    doc.subjectlevels.SubjectLevel node = (doc.subjectlevels.SubjectLevel) this.genericGetNode();
    doc.subjectlevels.Indice reference = (doc.subjectlevels.Indice) this.genericGetReference();
    reference.setAsignatura(node.getAsignatura());
    reference.setGrade(node.getGrade());
    reference.setIdentifier(node.getIdentifier());
    this.calculate();
  }
  
  public Indice getReference() {
    return (doc.subjectlevels.Indice) this.genericGetReference();
  }
  
  public SubjectLevel getNode() {
    return (doc.subjectlevels.SubjectLevel) this.genericGetNode();
  }
  
  private void calculate() {
    Indice referencia = this.getReference();
    SubjectLevel nodo = this.getNode();
    Term _asignaturaAsTerm = nodo.getAsignaturaAsTerm();
    String _plus = (_asignaturaAsTerm + " ");
    Term _grade = nodo.getGrade();
    String _plus_1 = (_plus + _grade);
    referencia.setAsignaturaCompleta(_plus_1);
  }
}
