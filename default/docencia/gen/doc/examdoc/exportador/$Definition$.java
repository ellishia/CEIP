package doc.examdoc.exportador;

import org.monet.metamodel.ExporterDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ExporterDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "iasfadfa";
    this._name = "doc.ExamDoc.Exportador";
    this._isAbstract = null;this._label = "Exportador de Documento";
    this._target = new org.monet.metamodel.internal.Ref("doc.ExamDoc");
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.examdoc.exportador.$Definition$.class,"doc.ExamDoc.Exportador",null);
  }
  }
  
  public static String static_getName() {
    return "Exportador";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.examdoc.Exportador.class;
  }
  
  public String getClientBehaviour() {
    return "var iasfadfa = new Object();iasfadfa.refresh = function (node) {if (!node.isEditable()) return;};iasfadfa.onChangeField = function (node, field) {};";
  }
}
