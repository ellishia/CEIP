package grades.shared.teachers;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mavimog";
    this._name = "grades.shared.Teachers";
    this._isAbstract = null;this._label = "Docentes";
    this._ontology = "DocentesDeCoordinacion";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.shared.teachers.$Definition$.class,"grades.shared.Teachers",null);
  }
  }
  
  public static String static_getName() {
    return "Teachers";
  }
  
  public String getClientBehaviour() {
    return "var mavimog = new Object();mavimog.refresh = function (node) {if (!node.isEditable()) return;};mavimog.onChangeField = function (node, field) {};";
  }
}
