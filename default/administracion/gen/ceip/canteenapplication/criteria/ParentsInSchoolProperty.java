package ceip.canteenapplication.criteria;

import org.monet.metamodel.BooleanFieldProperty;

@SuppressWarnings("all")
public class ParentsInSchoolProperty extends BooleanFieldProperty {
  public ParentsInSchoolProperty() {
    super();this._code = "mbrl4ka";
    this._name = "ParentsInSchool";
    this._label = "Padre o madre trabajando en el centro";
    
  }
  
  public static String static_getName() {
    return "ParentsInSchool";
  }
}
