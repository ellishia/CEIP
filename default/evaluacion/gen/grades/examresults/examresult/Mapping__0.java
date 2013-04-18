package grades.examresults.examresult;

import grades.examresults.ExamResult;
import grades.examresults.Indice;
import org.monet.bpi.java.MappingImpl;

public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    grades.examresults.ExamResult node = (grades.examresults.ExamResult) this.genericGetNode();
    grades.examresults.Indice reference = (grades.examresults.Indice) this.genericGetReference();
    reference.setSubject(node.getSubject());
    reference.setTeacher(node.getTeacher());
    reference.setDate(node.getDate());
    
  }
  
  public Indice getReference() {
    return (grades.examresults.Indice) this.genericGetReference();
  }
  
  public ExamResult getNode() {
    return (grades.examresults.ExamResult) this.genericGetNode();
  }
}
