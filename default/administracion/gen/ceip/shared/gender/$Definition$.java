package ceip.shared.gender;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mi8m3bq";
    this._name = "ceip.shared.Gender";
    this._isAbstract = null;this._label = "Gender";
    this._ontology = "Generos";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.shared.gender.$Definition$.class,"ceip.shared.Gender",null);
  }
  }
  
  public static String static_getName() {
    return "Gender";
  }
  
  public String getClientBehaviour() {
    return "var mi8m3bq = new Object();mi8m3bq.refresh = function (node) {if (!node.isEditable()) return;};mi8m3bq.onChangeField = function (node, field) {};";
  }
}
