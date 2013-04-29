package grades.shared.academicyears;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mpd0ilq";
    this._name = "grades.shared.AcademicYears";
    this._isAbstract = null;this._label = "Años Académicos";
    this._ontology = "AñosAcademicosAdmin";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.shared.academicyears.$Definition$.class,"grades.shared.AcademicYears",null);
  }
  }
  
  public static String static_getName() {
    return "AcademicYears";
  }
  
  public String getClientBehaviour() {
    return "var mpd0ilq = new Object();mpd0ilq.refresh = function (node) {if (!node.isEditable()) return;};mpd0ilq.onChangeField = function (node, field) {};";
  }
}
