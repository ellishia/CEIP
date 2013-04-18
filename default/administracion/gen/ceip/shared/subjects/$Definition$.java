package ceip.shared.subjects;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mcitehq";
    this._name = "ceip.shared.Subjects";
    this._isAbstract = null;this._label = "Asignaturas";
    this._ontology = "MateriasDeDocencia";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.shared.subjects.$Definition$.class,"ceip.shared.Subjects",null);
  }
  }
  
  public static String static_getName() {
    return "Subjects";
  }
  
  public String getClientBehaviour() {
    return "var mcitehq = new Object();mcitehq.refresh = function (node) {if (!node.isEditable()) return;};mcitehq.onChangeField = function (node, field) {};";
  }
}
