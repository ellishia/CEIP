package serv.dailyrecords.dailyrecord;

import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;
import serv.dailyrecords.dailyrecord.absences.AbsentProperty;
import serv.dailyrecords.dailyrecord.absences.UserProperty;

@SuppressWarnings("all")
public class AbsencesProperty extends SectionFieldProperty implements HasBehaviour {
  public AbsencesProperty() {
    super();this._code = "m0r0dbw";
    this._name = "Absences";
    this._label = "Control de Asistencias";
    this.setIsMultiple(true);
    this.addLinkFieldProperty(User);
    this.addBooleanFieldProperty(Absent);
    
  }
  
  public Class<?> getBehaviourClass() {
    return serv.dailyrecords.dailyrecord.Absences.class;
  }
  
  public static String static_getName() {
    return "Absences";
  }
  
  private final UserProperty User = new serv.dailyrecords.dailyrecord.absences.UserProperty();
  
  private final AbsentProperty Absent = new serv.dailyrecords.dailyrecord.absences.AbsentProperty();
}
