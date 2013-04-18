package serv.userscanteen.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class ScheduleProperty extends AttributeProperty {
  public ScheduleProperty() {
    super();this._code = "mnjokeq";
    this._name = "Schedule";
    this._label = "Turno";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "Schedule";
  }
}
