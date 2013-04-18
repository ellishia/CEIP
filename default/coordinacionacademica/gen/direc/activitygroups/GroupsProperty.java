package direc.activitygroups;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class GroupsProperty extends LinkFieldProperty {
  public GroupsProperty() {
    super();this._code = "mm2gi4g";
    this._name = "Groups";
    this._label = "Grupos";
    this.setIsMultiple(true);
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty2 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty2.setIndex(new org.monet.metamodel.internal.Ref("direc.Groups.Indice"));
    this.setSource(sourceProperty2);
    
  }
  
  public static String static_getName() {
    return "Groups";
  }
}
