package doc.shared.administrador;

import org.monet.metamodel.RoleDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends RoleDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mclvsjg";
    this._name = "doc.shared.Administrador";
    this._isAbstract = null;this._label = "Administrador";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.shared.administrador.$Definition$.class,"doc.shared.Administrador",null);
  }
  }
  
  public static String static_getName() {
    return "Administrador";
  }
  
  public String getClientBehaviour() {
    return "var mclvsjg = new Object();mclvsjg.refresh = function (node) {if (!node.isEditable()) return;};mclvsjg.onChangeField = function (node, field) {};";
  }
}
