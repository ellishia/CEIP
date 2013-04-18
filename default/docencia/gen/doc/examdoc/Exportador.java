package doc.examdoc;

import doc.examdoc.Schema;
import doc.examdoc.exportador.ExporterScope;
import doc.exams.ExamForm;
import org.monet.bpi.Node;
import org.monet.bpi.java.ExporterImpl;
import org.monet.bpi.types.Date;

@SuppressWarnings("all")
public class Exportador extends ExporterImpl {
  private void onExportItem(final Schema i) {
    Node _scope = this.getScope();
    ExamForm ficha = ((ExamForm) _scope);
    Date _date = new Date();
    i.setDate(_date);
  }
  
  public void onExportItem(final org.monet.bpi.Schema item) {
    super.onExportItem(item);
    this.onExportItem((doc.examdoc.Schema)item);
  }
  
  public static ExporterScope doExportOf(final Node node) {
    return (doc.examdoc.exportador.ExporterScope)org.monet.bpi.ExporterService.get("doc.ExamDoc.Exportador").prepareExportOf(node);
  }
  
  public org.monet.bpi.ExporterScope prepareExportOf(final Node node) {
    return (org.monet.bpi.ExporterScope) new doc.examdoc.exportador.ExporterScope(this, node);
  }
}
