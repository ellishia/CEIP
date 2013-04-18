package direc.lotes.lote;

import direc.lotes.Index;
import direc.lotes.Lote;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.lotes.Lote node = (direc.lotes.Lote) this.genericGetNode();
    direc.lotes.Index reference = (direc.lotes.Index) this.genericGetReference();
    reference.setIdentifier(node.getIdentifier());
    reference.setAcademicYear(node.getAcademicYear());
    reference.setLevel(node.getLevel());
    
  }
  
  public Index getReference() {
    return (direc.lotes.Index) this.genericGetReference();
  }
  
  public Lote getNode() {
    return (direc.lotes.Lote) this.genericGetNode();
  }
}
