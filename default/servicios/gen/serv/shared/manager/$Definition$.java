package serv.shared.manager;

import org.monet.metamodel.RoleDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends RoleDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m65cisa";
    this._name = "serv.shared.Manager";
    this._isAbstract = null;this._label = "Manager";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.shared.manager.$Definition$.class,"serv.shared.Manager",null);
  }
  }
  
  public static String static_getName() {
    return "Manager";
  }
  
  public String getClientBehaviour() {
    return "var m65cisa = new Object();m65cisa.refresh = function (node) {if (!node.isEditable()) return;};m65cisa.onChangeField = function (node, field) {};";
  }
}
