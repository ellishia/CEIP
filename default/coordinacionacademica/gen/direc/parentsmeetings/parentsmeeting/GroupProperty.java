package direc.parentsmeetings.parentsmeeting;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class GroupProperty extends LinkFieldProperty {
  public GroupProperty() {
    super();this._code = "mj8l2ug";
    this._name = "Group";
    this._label = "Grupo";
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty1 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty1.setIndex(new org.monet.metamodel.internal.Ref("direc.Groups.Indice"));
    this.setSource(sourceProperty1);
    
  }
  
  public static String static_getName() {
    return "Group";
  }
}
