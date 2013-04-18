package direc.shared.subjects;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mzm5kjw";
    this._name = "direc.shared.Subjects";
    this._isAbstract = null;this._label = "Asignaturas";
    this._ontology = "MateriasDeDocencia";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.shared.subjects.$Definition$.class,"direc.shared.Subjects",null);
  }
  }
  
  public static String static_getName() {
    return "Subjects";
  }
  
  public String getClientBehaviour() {
    return "var mzm5kjw = new Object();mzm5kjw.refresh = function (node) {if (!node.isEditable()) return;};mzm5kjw.onChangeField = function (node, field) {};";
  }
}
