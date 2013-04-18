package direc.evaluationsesions.evaluationsesion;

import direc.evaluationsesions.EvaluationSesion;
import direc.evaluationsesions.Indice;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    direc.evaluationsesions.EvaluationSesion node = (direc.evaluationsesions.EvaluationSesion) this.genericGetNode();
    direc.evaluationsesions.Indice reference = (direc.evaluationsesions.Indice) this.genericGetReference();
    reference.setTitle(node.getTitle());
    
  }
  
  public Indice getReference() {
    return (direc.evaluationsesions.Indice) this.genericGetReference();
  }
  
  public EvaluationSesion getNode() {
    return (direc.evaluationsesions.EvaluationSesion) this.genericGetNode();
  }
}
