package serv.dailyrecords.dailyrecord.absences;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class UserProperty extends LinkFieldProperty {
  public UserProperty() {
    super();this._code = "mjky9iq";
    this._name = "User";
    this._label = "Usuario";
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty1 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty1.setIndex(new org.monet.metamodel.internal.Ref("serv.UsersTransport.Indice"));
    this.setSource(sourceProperty1);
    
  }
  
  public static String static_getName() {
    return "User";
  }
}
