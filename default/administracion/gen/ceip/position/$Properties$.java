package ceip.position;

import ceip.Position;
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
  
  public Position getNode() {
    return (ceip.Position) this.genericGetNode();
  }
  
  private void calculate() {
    Position _node = this.getNode();
    Term academicYear = _node.getAcademicYear();
    String anyo = null;
    boolean _equals = Objects.equal(academicYear, null);
    if (_equals) {
      anyo = "A\u00F1o sin asignar";
    } else {
      String _label = academicYear.getLabel();
      anyo = _label;
    }
    Position _node_1 = this.getNode();
    _node_1.setLabel(anyo);
  }
}
