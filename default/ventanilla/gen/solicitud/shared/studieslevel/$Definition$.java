package solicitud.shared.studieslevel;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mb_ne7w";
    this._name = "solicitud.shared.StudiesLevel";
    this._isAbstract = null;this._label = "Studies level";
    this._ontology = "EstudiosDeAdministrcion";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.shared.studieslevel.$Definition$.class,"solicitud.shared.StudiesLevel",null);
  }
  }
  
  public static String static_getName() {
    return "StudiesLevel";
  }
  
  public String getClientBehaviour() {
    return "var mb_ne7w = new Object();mb_ne7w.refresh = function (node) {if (!node.isEditable()) return;};mb_ne7w.onChangeField = function (node, field) {};";
  }
}
