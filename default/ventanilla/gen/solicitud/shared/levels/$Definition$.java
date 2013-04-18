package solicitud.shared.levels;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mfyh_va";
    this._name = "solicitud.shared.Levels";
    this._isAbstract = null;this._label = "Levels";
    this._ontology = "LevelsDeAdministracion";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.shared.levels.$Definition$.class,"solicitud.shared.Levels",null);
  }
  }
  
  public static String static_getName() {
    return "Levels";
  }
  
  public String getClientBehaviour() {
    return "var mfyh_va = new Object();mfyh_va.refresh = function (node) {if (!node.isEditable()) return;};mfyh_va.onChangeField = function (node, field) {};";
  }
}
