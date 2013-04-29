package ceip.comun.usuario;

import org.monet.metamodel.RoleDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends RoleDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mowm7ka";
    this._name = "ceip.comun.Usuario";
    this._isAbstract = null;this._label = "Usuario";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.comun.usuario.$Definition$.class,"ceip.comun.Usuario",null);
  }
  }
  
  public static String static_getName() {
    return "Usuario";
  }
  
  public String getClientBehaviour() {
    return "var mowm7ka = new Object();mowm7ka.refresh = function (node) {if (!node.isEditable()) return;};mowm7ka.onChangeField = function (node, field) {};";
  }
}
