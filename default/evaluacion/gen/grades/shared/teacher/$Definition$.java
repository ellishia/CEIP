package grades.shared.teacher;

import org.monet.metamodel.RoleDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

public class $Definition$ extends RoleDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mlagllw";
    this._name = "grades.shared.Teacher";
    this._isAbstract = null;this._label = "Teacher";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.shared.teacher.$Definition$.class,"grades.shared.Teacher",null);
  }
  }
  
  public static String static_getName() {
    return "Teacher";
  }
  
  public String getClientBehaviour() {
    return "var mlagllw = new Object();mlagllw.refresh = function (node) {if (!node.isEditable()) return;};mlagllw.onChangeField = function (node, field) {};";
  }
}
