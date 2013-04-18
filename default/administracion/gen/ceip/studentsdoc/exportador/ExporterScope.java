package ceip.studentsdoc.exportador;

import ceip.StudentsDoc;
import ceip.studentsdoc.Exportador;
import org.monet.bpi.Node;
import org.monet.bpi.java.ExporterImpl.ExporterScopeImpl;

@SuppressWarnings("all")
public class ExporterScope extends ExporterScopeImpl {
  public ExporterScope(final Exportador instance, final Node target) {
    instance.super(target);
  }
  
  public void toDocument(final StudentsDoc document) {
    this.internalToDocument(document);
  }
  
  public StudentsDoc toNewDocument() {
    return (ceip.StudentsDoc)internalToNewDocument("ceip.StudentsDoc");
  }
}
