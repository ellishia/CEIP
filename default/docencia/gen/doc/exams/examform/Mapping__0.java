package doc.exams.examform;

import doc.exams.ExamForm;
import doc.exams.Indice;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    doc.exams.ExamForm node = (doc.exams.ExamForm) this.genericGetNode();
    doc.exams.Indice reference = (doc.exams.Indice) this.genericGetReference();
    
  }
  
  public Indice getReference() {
    return (doc.exams.Indice) this.genericGetReference();
  }
  
  public ExamForm getNode() {
    return (doc.exams.ExamForm) this.genericGetNode();
  }
}
