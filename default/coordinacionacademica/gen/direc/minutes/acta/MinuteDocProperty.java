package direc.minutes.acta;

import org.monet.metamodel.NodeFieldProperty;

@SuppressWarnings("all")
public class MinuteDocProperty extends NodeFieldProperty {
  public MinuteDocProperty() {
    super();this._code = "mvim_vq";
    this._name = "MinuteDoc";
    this._label = "Documento de Acta";
    org.monet.metamodel.NodeFieldProperty.ContainProperty containProperty1 = new org.monet.metamodel.NodeFieldProperty.ContainProperty();
    containProperty1.setNode(new org.monet.metamodel.internal.Ref("direc.MinuteDoc"));
    this.setContain(containProperty1);
    
  }
  
  public static String static_getName() {
    return "MinuteDoc";
  }
}
