package doc.subjectlevels.subjectlevel;

import doc.subjectlevels.SubjectLevel;
import org.monet.bpi.Properties;
import org.monet.bpi.java.MappingImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class $Properties$ extends MappingImpl {
  public void calculateMapping() {
    this.calculate();
  }
  
  public Properties getProperties() {
    return (org.monet.bpi.Properties) this.genericGetReference();
  }
  
  public SubjectLevel getNode() {
    return (doc.subjectlevels.SubjectLevel) this.genericGetNode();
  }
  
  private void calculate() {
    SubjectLevel _node = this.getNode();
    SubjectLevel _node_1 = this.getNode();
    Term _asignaturaAsTerm = _node_1.getAsignaturaAsTerm();
    String _plus = (_asignaturaAsTerm + " ");
    SubjectLevel _node_2 = this.getNode();
    Term _grade = _node_2.getGrade();
    String _plus_1 = (_plus + _grade);
    _node.setLabel(_plus_1);
  }
}
