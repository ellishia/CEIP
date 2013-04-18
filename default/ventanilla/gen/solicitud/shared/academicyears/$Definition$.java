package solicitud.shared.academicyears;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mvep_oa";
    this._name = "solicitud.shared.AcademicYears";
    this._isAbstract = null;this._label = "Años Académicos";
    this._ontology = "AñosAcademicosAdmin";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.shared.academicyears.$Definition$.class,"solicitud.shared.AcademicYears",null);
  }
  }
  
  public static String static_getName() {
    return "AcademicYears";
  }
  
  public String getClientBehaviour() {
    return "var mvep_oa = new Object();mvep_oa.refresh = function (node) {if (!node.isEditable()) return;};mvep_oa.onChangeField = function (node, field) {};";
  }
}
