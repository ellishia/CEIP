package grades.shared.trimesters;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mqlv6oq";
    this._name = "grades.shared.Trimesters";
    this._isAbstract = null;this._label = "Trimestres";
    this._ontology = "TrimesterAdministracion";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.shared.trimesters.$Definition$.class,"grades.shared.Trimesters",null);
  }
  }
  
  public static String static_getName() {
    return "Trimesters";
  }
  
  public String getClientBehaviour() {
    return "var mqlv6oq = new Object();mqlv6oq.refresh = function (node) {if (!node.isEditable()) return;};mqlv6oq.onChangeField = function (node, field) {};";
  }
}
