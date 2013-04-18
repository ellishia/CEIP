package grades.shared.levels;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "minleha";
    this._name = "grades.shared.Levels";
    this._isAbstract = null;this._label = "Nivel Académico";
    this._ontology = "EstudiosDeAdministrcion";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.shared.levels.$Definition$.class,"grades.shared.Levels",null);
  }
  }
  
  public static String static_getName() {
    return "Levels";
  }
  
  public String getClientBehaviour() {
    return "var minleha = new Object();minleha.refresh = function (node) {if (!node.isEditable()) return;};minleha.onChangeField = function (node, field) {};";
  }
}
