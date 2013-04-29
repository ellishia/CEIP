package grades.shared.tutors;

import org.monet.metamodel.RoleDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends RoleDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mn2v6bq";
    this._name = "grades.shared.Tutors";
    this._isAbstract = null;this._label = "Tutors";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.shared.tutors.$Definition$.class,"grades.shared.Tutors",null);
  }
  }
  
  public static String static_getName() {
    return "Tutors";
  }
  
  public String getClientBehaviour() {
    return "var mn2v6bq = new Object();mn2v6bq.refresh = function (node) {if (!node.isEditable()) return;};mn2v6bq.onChangeField = function (node, field) {};";
  }
}
