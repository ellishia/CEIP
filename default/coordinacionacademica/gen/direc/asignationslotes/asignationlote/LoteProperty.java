package direc.asignationslotes.asignationlote;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class LoteProperty extends LinkFieldProperty {
  public LoteProperty() {
    super();this._code = "m8pawmw";
    this._name = "Lote";
    this._label = "Lote";
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty1 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty1.setIndex(new org.monet.metamodel.internal.Ref("direc.Lotes.Index"));
    this.setSource(sourceProperty1);
    
  }
  
  public static String static_getName() {
    return "Lote";
  }
}
