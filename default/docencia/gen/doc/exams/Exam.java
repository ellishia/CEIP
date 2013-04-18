package doc.exams;

import doc.ExamDocs;
import doc.exams.ExamForm;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeContainerImpl;

@SuppressWarnings("all")
public class Exam extends NodeContainerImpl {
  public ExamForm getExamForm() {
    return (doc.exams.ExamForm)this.getChildNode("doc.Exams.ExamForm");
  }
  
  public ExamDocs getExamDocs() {
    return (doc.ExamDocs)this.getChildNode("doc.ExamDocs");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Exam createNew(final Node parent) {
    return (doc.exams.Exam)org.monet.bpi.NodeService.create(doc.exams.Exam.class, parent);
  }
}
