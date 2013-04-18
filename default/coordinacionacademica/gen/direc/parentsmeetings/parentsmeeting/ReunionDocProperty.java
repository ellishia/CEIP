package direc.parentsmeetings.parentsmeeting;

import org.monet.metamodel.NodeFieldProperty;

@SuppressWarnings("all")
public class ReunionDocProperty extends NodeFieldProperty {
  public ReunionDocProperty() {
    super();this._code = "ms4mfxg";
    this._name = "ReunionDoc";
    this._label = "Documento de Reunión";
    org.monet.metamodel.NodeFieldProperty.ContainProperty containProperty1 = new org.monet.metamodel.NodeFieldProperty.ContainProperty();
    containProperty1.setNode(new org.monet.metamodel.internal.Ref("direc.ParentsMDoc"));
    this.setContain(containProperty1);
    
  }
  
  public static String static_getName() {
    return "ReunionDoc";
  }
}
