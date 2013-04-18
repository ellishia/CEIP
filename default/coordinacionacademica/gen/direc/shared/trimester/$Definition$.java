package direc.shared.trimester;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "moz3tfq";
    this._name = "direc.shared.Trimester";
    this._isAbstract = null;this._label = "Trimestre";
    this._ontology = "TrimesterAdministracion";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.shared.trimester.$Definition$.class,"direc.shared.Trimester",null);
  }
  }
  
  public static String static_getName() {
    return "Trimester";
  }
  
  public String getClientBehaviour() {
    return "var moz3tfq = new Object();moz3tfq.refresh = function (node) {if (!node.isEditable()) return;};moz3tfq.onChangeField = function (node, field) {};";
  }
}
