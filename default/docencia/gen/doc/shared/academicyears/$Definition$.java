package doc.shared.academicyears;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mncmrfw";
    this._name = "doc.shared.AcademicYears";
    this._isAbstract = null;this._label = "Años Académicos";
    this._ontology = "AñosAcademicosAdmin";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.shared.academicyears.$Definition$.class,"doc.shared.AcademicYears",null);
  }
  }
  
  public static String static_getName() {
    return "AcademicYears";
  }
  
  public String getClientBehaviour() {
    return "var mncmrfw = new Object();mncmrfw.refresh = function (node) {if (!node.isEditable()) return;};mncmrfw.onChangeField = function (node, field) {};";
  }
}
