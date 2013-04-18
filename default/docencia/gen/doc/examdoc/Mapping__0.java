package doc.examdoc;

import doc.ExamDoc;
import doc.examdocs.Indice;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    doc.ExamDoc node = (doc.ExamDoc) this.genericGetNode();
    doc.examdocs.Indice reference = (doc.examdocs.Indice) this.genericGetReference();
    
  }
  
  public Indice getReference() {
    return (doc.examdocs.Indice) this.genericGetReference();
  }
  
  public ExamDoc getNode() {
    return (doc.ExamDoc) this.genericGetNode();
  }
}
