package direc.shared.academicyears;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mmurmea";
    this._name = "direc.shared.AcademicYears";
    this._isAbstract = null;this._label = "Años Académicos";
    this._ontology = "AñosAcademicosAdmin";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.shared.academicyears.$Definition$.class,"direc.shared.AcademicYears",null);
  }
  }
  
  public static String static_getName() {
    return "AcademicYears";
  }
  
  public String getClientBehaviour() {
    return "var mmurmea = new Object();mmurmea.refresh = function (node) {if (!node.isEditable()) return;};mmurmea.onChangeField = function (node, field) {};";
  }
}
