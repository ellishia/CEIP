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
    String lab = "Calendario Acad\u00E9mico ";
    AcademicCalendar _node = this.getNode();
    Term academicYear = _node.getAcademicYear();
    boolean _notEquals = (!Objects.equal(academicYear, null));
    if (_notEquals) {
      AcademicCalendar _node_1 = this.getNode();
      String _string = academicYear.toString();
      _node_1.setLabel(_string);
    }
    AcademicCalendar _node_2 = this.getNode();
    AcademicCalendar _node_3 = this.getNode();
    String _label = _node_3.getLabel();
    String _plus = (lab + _label);
    _node_2.setLabel(_plus);
  }
}
