package ceip.califications.calification;

import ceip.BasicInfo;
import ceip.Student;
import ceip.califications.Calification;
import ceip.califications.Indice;
import com.google.common.base.Objects;
import org.monet.bpi.FieldLink;
import org.monet.bpi.Node;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    ceip.califications.Calification node = (ceip.califications.Calification) this.genericGetNode();
    ceip.califications.Indice reference = (ceip.califications.Indice) this.genericGetReference();
    reference.setAcademicYear(node.getAcademicYear());
    reference.setSubject(node.getSubject());
    reference.setLevel(node.getLevel());
    reference.setTrimester(node.getTrimester());
    reference.setGrade(node.getGrade());
    this.calculate();
  }
  
  public Indice getReference() {
    return (ceip.califications.Indice) this.genericGetReference();
  }
  
  public Calification getNode() {
    return (ceip.califications.Calification) this.genericGetNode();
  }
  
  private void calculate() {
    Calification _node = this.getNode();
    FieldLink student = _node.getStudentField();
    boolean _notEquals = (!Objects.equal(student, null));
    if (_notEquals) {
      Node _node_1 = student.getNode();
      Student stu = ((Student) _node_1);
      boolean _notEquals_1 = (!Objects.equal(stu, null));
      if (_notEquals_1) {
        BasicInfo info = stu.getBasicInfo();
        Indice _reference = this.getReference();
        String _cial = info.getCial();
        _reference.setCial(_cial);
      }
    }
  }
}
