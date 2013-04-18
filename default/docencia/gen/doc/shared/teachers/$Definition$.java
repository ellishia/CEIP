package doc.shared.teachers;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m8htx1a";
    this._name = "doc.shared.Teachers";
    this._isAbstract = null;this._label = "Docentes";
    this._ontology = "DocentesDeCoordinacion";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.shared.teachers.$Definition$.class,"doc.shared.Teachers",null);
  }
  }
  
  public static String static_getName() {
    return "Teachers";
  }
  
  public String getClientBehaviour() {
    return "var m8htx1a = new Object();m8htx1a.refresh = function (node) {if (!node.isEditable()) return;};m8htx1a.onChangeField = function (node, field) {};";
  }
}
