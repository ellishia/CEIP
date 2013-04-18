package direc.lotes.lote;

import com.google.common.base.Objects;
import direc.lotes.Lote;
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
  
  public Lote getNode() {
    return (direc.lotes.Lote) this.genericGetNode();
  }
  
  private void calculate() {
    Lote _node = this.getNode();
    String _identifier = _node.getIdentifier();
    String valor = (_identifier + " ");
    Lote _node_1 = this.getNode();
    Term _academicYear = _node_1.getAcademicYear();
    boolean _notEquals = (!Objects.equal(_academicYear, null));
    if (_notEquals) {
      Lote _node_2 = this.getNode();
      Term _academicYear_1 = _node_2.getAcademicYear();
      String _label = _academicYear_1.getLabel();
      String _plus = (valor + _label);
      valor = _plus;
    }
    Lote _node_3 = this.getNode();
    _node_3.setLabel(valor);
  }
}
