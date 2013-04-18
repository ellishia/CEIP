package doc.shared.docente;

import org.monet.metamodel.RoleDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends RoleDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mfehsta";
    this._name = "doc.shared.Docente";
    this._isAbstract = null;this._label = "Docente";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.shared.docente.$Definition$.class,"doc.shared.Docente",null);
  }
  }
  
  public static String static_getName() {
    return "Docente";
  }
  
  public String getClientBehaviour() {
    return "var mfehsta = new Object();mfehsta.refresh = function (node) {if (!node.isEditable()) return;};mfehsta.onChangeField = function (node, field) {};";
  }
}
