package grades.shared.grades;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mnir6wa";
    this._name = "grades.shared.Grades";
    this._isAbstract = null;this._label = "Grupos";
    this._ontology = "GruposDeCoordinacion";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.shared.grades.$Definition$.class,"grades.shared.Grades",null);
  }
  }
  
  public static String static_getName() {
    return "Grades";
  }
  
  public String getClientBehaviour() {
    return "var mnir6wa = new Object();mnir6wa.refresh = function (node) {if (!node.isEditable()) return;};mnir6wa.onChangeField = function (node, field) {};";
  }
}
