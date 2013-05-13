package direc.slots.slot;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class GroupProperty extends LinkFieldProperty {
  public GroupProperty() {
    super();this._code = "mbzctla";
    this._name = "Group";
    this._label = "Grupo";
    this.setAllowAdd(true);
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty2 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty2.setIndex(new org.monet.metamodel.internal.Ref("direc.Groups.Indice"));
    sourceProperty2.setCollection(new org.monet.metamodel.internal.Ref("direc.Groups"));
    this.setSource(sourceProperty2);
    
  }
  
  public static String static_getName() {
    return "Group";
  }
}
