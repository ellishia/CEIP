package direc.shared.administrador;

import org.monet.metamodel.RoleDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends RoleDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mfehsta";
    this._name = "direc.shared.Administrador";
    this._isAbstract = null;this._label = "Administrador";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.shared.administrador.$Definition$.class,"direc.shared.Administrador",null);
  }
  }
  
  public static String static_getName() {
    return "Administrador";
  }
  
  public String getClientBehaviour() {
    return "var mfehsta = new Object();mfehsta.refresh = function (node) {if (!node.isEditable()) return;};mfehsta.onChangeField = function (node, field) {};";
  }
}
