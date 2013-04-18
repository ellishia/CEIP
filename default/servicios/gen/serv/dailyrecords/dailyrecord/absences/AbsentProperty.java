package serv.dailyrecords.dailyrecord.absences;

import org.monet.metamodel.BooleanFieldProperty;

@SuppressWarnings("all")
public class AbsentProperty extends BooleanFieldProperty {
  public AbsentProperty() {
    super();this._code = "moeznig";
    this._name = "Absent";
    this._label = "Ausencia";
    
  }
  
  public static String static_getName() {
    return "Absent";
  }
}
