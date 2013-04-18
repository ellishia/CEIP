package direc.claustros.claustro;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class RoomProperty extends LinkFieldProperty {
  public RoomProperty() {
    super();this._code = "mqsqrja";
    this._name = "Room";
    this._label = "Aula";
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty1 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty1.setIndex(new org.monet.metamodel.internal.Ref("direc.Rooms.Indice"));
    this.setSource(sourceProperty1);
    
  }
  
  public static String static_getName() {
    return "Room";
  }
}
