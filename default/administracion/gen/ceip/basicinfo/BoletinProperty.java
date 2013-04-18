package ceip.basicinfo;

import org.monet.metamodel.NodeFieldProperty;

@SuppressWarnings("all")
public class BoletinProperty extends NodeFieldProperty {
  public BoletinProperty() {
    super();this._code = "m1zeyea";
    this._name = "Boletin";
    this._label = "Boletín";
    this.setIsMultiple(true);
    org.monet.metamodel.NodeFieldProperty.AddProperty addProperty2 = new org.monet.metamodel.NodeFieldProperty.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("ceip.Boletin"));
    this.setAdd(addProperty2);
    
  }
  
  public static String static_getName() {
    return "Boletin";
  }
}
