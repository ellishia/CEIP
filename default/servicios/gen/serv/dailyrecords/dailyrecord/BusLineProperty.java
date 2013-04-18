package serv.dailyrecords.dailyrecord;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class BusLineProperty extends LinkFieldProperty {
  public BusLineProperty() {
    super();this._code = "m_tgbmq";
    this._name = "BusLine";
    this._label = "Ruta";
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty1 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty1.setIndex(new org.monet.metamodel.internal.Ref("serv.Buslines.Indice"));
    this.setSource(sourceProperty1);
    
  }
  
  public static String static_getName() {
    return "BusLine";
  }
}
