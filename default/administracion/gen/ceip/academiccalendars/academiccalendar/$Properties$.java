package ceip.academiccalendars.academiccalendar;

import ceip.academiccalendars.AcademicCalendar;
import com.google.common.base.Objects;
import org.monet.bpi.Properties;
import org.monet.bpi.java.MappingImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class $Properties$ extends MappingImpl {
  public void calculateMapping() {
    this.calculate();
  }
  
  public Properties getProperties() {
    return (org.monet.bpi.Properties) this.genericGetReference();
  }
  
  public AcademicCalendar getNode() {
    return (ceip.academiccalendars.AcademicCalendar) this.genericGetNode();
  }
  
  private void calculate() {
    AcademicCalendar _node = this.getNode();
    Term academicYear = _node.getAcademicYear();
    boolean _notEquals = (!Objects.equal(academicYear, null));
    if (_notEquals) {
      AcademicCalendar _node_1 = this.getNode();
      String _string = academicYear.toString();
      String _plus = ("Calendario Acad\u00E9mico " + _string);
      _node_1.setLabel(_plus);
    }
  }
}
