package direc.shared.levels;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mhmnuaw";
    this._name = "direc.shared.Levels";
    this._isAbstract = null;this._label = "Levels";
    this._ontology = "LevelsDeAdministracion";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.shared.levels.$Definition$.class,"direc.shared.Levels",null);
  }
  }
  
  public static String static_getName() {
    return "Levels";
  }
  
  public String getClientBehaviour() {
    return "var mhmnuaw = new Object();mhmnuaw.refresh = function (node) {if (!node.isEditable()) return;};mhmnuaw.onChangeField = function (node, field) {};";
  }
}
