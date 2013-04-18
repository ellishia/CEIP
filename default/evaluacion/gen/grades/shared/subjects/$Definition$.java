package grades.shared.subjects;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m2xfx7w";
    this._name = "grades.shared.Subjects";
    this._isAbstract = null;this._label = "Asignaturas";
    this._ontology = "MateriasDeDocencia";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.shared.subjects.$Definition$.class,"grades.shared.Subjects",null);
  }
  }
  
  public static String static_getName() {
    return "Subjects";
  }
  
  public String getClientBehaviour() {
    return "var m2xfx7w = new Object();m2xfx7w.refresh = function (node) {if (!node.isEditable()) return;};m2xfx7w.onChangeField = function (node, field) {};";
  }
}
