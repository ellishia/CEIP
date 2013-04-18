package direc.claustros.claustro;

import org.monet.metamodel.NodeFieldProperty;

@SuppressWarnings("all")
public class ClaustroDocProperty extends NodeFieldProperty {
  public ClaustroDocProperty() {
    super();this._code = "mqpapww";
    this._name = "ClaustroDoc";
    this._label = "Convocatoria de Claustro";
    org.monet.metamodel.NodeFieldProperty.ContainProperty containProperty1 = new org.monet.metamodel.NodeFieldProperty.ContainProperty();
    containProperty1.setNode(new org.monet.metamodel.internal.Ref("direc.ClaustroDoc"));
    this.setContain(containProperty1);
    
  }
  
  public static String static_getName() {
    return "ClaustroDoc";
  }
}
