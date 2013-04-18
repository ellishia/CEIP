package direc.groups.group;

import com.google.common.base.Objects;
import direc.groups.Group;
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
  
  public Group getNode() {
    return (direc.groups.Group) this.genericGetNode();
  }
  
  private void calculate() {
    Group _node = this.getNode();
    String nombreCompleto = _node.getName();
    Group _node_1 = this.getNode();
    Term _academicYear = _node_1.getAcademicYear();
    boolean _notEquals = (!Objects.equal(_academicYear, null));
    if (_notEquals) {
      String _plus = (nombreCompleto + " ");
      Group _node_2 = this.getNode();
      Term _academicYear_1 = _node_2.getAcademicYear();
      String _label = _academicYear_1.getLabel();
      String _plus_1 = (_plus + _label);
      nombreCompleto = _plus_1;
    }
    Group _node_3 = this.getNode();
    _node_3.setLabel(nombreCompleto);
  }
}
