package direc.asignationscards.asignationcard;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class CreditCardProperty extends LinkFieldProperty {
  public CreditCardProperty() {
    super();this._code = "mc32fdw";
    this._name = "CreditCard";
    this._label = "Tarjeta de Crédito";
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty1 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty1.setIndex(new org.monet.metamodel.internal.Ref("direc.CreditCards.Indice"));
    this.setSource(sourceProperty1);
    
  }
  
  public static String static_getName() {
    return "CreditCard";
  }
}
