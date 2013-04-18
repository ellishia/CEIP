package direc.evaluationsesions.evaluationsesion;

import org.monet.metamodel.NodeFieldProperty;

@SuppressWarnings("all")
public class EvaluationDocProperty extends NodeFieldProperty {
  public EvaluationDocProperty() {
    super();this._code = "mm_y3ya";
    this._name = "EvaluationDoc";
    this._label = "Documento de Convocatoria";
    org.monet.metamodel.NodeFieldProperty.ContainProperty containProperty1 = new org.monet.metamodel.NodeFieldProperty.ContainProperty();
    containProperty1.setNode(new org.monet.metamodel.internal.Ref("direc.EvaluationDoc"));
    this.setContain(containProperty1);
    
  }
  
  public static String static_getName() {
    return "EvaluationDoc";
  }
}
