package doc.shared.grades;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mf_uqww";
    this._name = "doc.shared.Grades";
    this._isAbstract = null;this._label = "Cursos";
    this._ontology = "LevelsDeAdministracion";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.shared.grades.$Definition$.class,"doc.shared.Grades",null);
  }
  }
  
  public static String static_getName() {
    return "Grades";
  }
  
  public String getClientBehaviour() {
    return "var mf_uqww = new Object();mf_uqww.refresh = function (node) {if (!node.isEditable()) return;};mf_uqww.onChangeField = function (node, field) {};";
  }
}
