package grades.examresults.examresult;

import grades.continuosevaluation.Index;
import grades.examresults.ExamResult;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__1 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    grades.examresults.ExamResult node = (grades.examresults.ExamResult) this.genericGetNode();
    grades.continuosevaluation.Index reference = (grades.continuosevaluation.Index) this.genericGetReference();
    reference.setSubject(node.getSubject());
    reference.setTeacher(node.getTeacher());
    reference.setDate(node.getDate());
    
  }
  
  public Index getReference() {
    return (grades.continuosevaluation.Index) this.genericGetReference();
  }
  
  public ExamResult getNode() {
    return (grades.examresults.ExamResult) this.genericGetNode();
  }
}
