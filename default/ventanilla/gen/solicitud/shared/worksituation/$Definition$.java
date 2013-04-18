package solicitud.shared.worksituation;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "ml5cexg";
    this._name = "solicitud.shared.WorkSituation";
    this._isAbstract = null;this._label = "Work situation";
    this._ontology = "SituacionLaboralDeAdmin";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.shared.worksituation.$Definition$.class,"solicitud.shared.WorkSituation",null);
  }
  }
  
  public static String static_getName() {
    return "WorkSituation";
  }
  
  public String getClientBehaviour() {
    return "var ml5cexg = new Object();ml5cexg.refresh = function (node) {if (!node.isEditable()) return;};ml5cexg.onChangeField = function (node, field) {};";
  }
}
