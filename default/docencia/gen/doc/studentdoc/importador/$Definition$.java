package doc.studentdoc.importador;

import org.monet.metamodel.ImporterDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ImporterDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mtv7_zg";
    this._name = "doc.StudentDoc.Importador";
    this._isAbstract = null;this._label = "Importador";
    this._target = new org.monet.metamodel.internal.Ref("doc.StudentDoc");
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.studentdoc.importador.$Definition$.class,"doc.StudentDoc.Importador",null);
  }
  }
  
  public static String static_getName() {
    return "Importador";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.studentdoc.Importador.class;
  }
  
  public String getClientBehaviour() {
    return "var mtv7_zg = new Object();mtv7_zg.refresh = function (node) {if (!node.isEditable()) return;};mtv7_zg.onChangeField = function (node, field) {};";
  }
}
