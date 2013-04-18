package direc.asignationscards.asignationcard;

import direc.asignationscards.asignationcard.CreditCardProperty;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends direc.asignations.asignationdefault.$Definition$ implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mqj2d_g";
    this._name = "direc.AsignationsCards.AsignationCard";
    this._parent = "direc.Asignations.AsignationDefault";
    this._isAbstract = null;this._label = "Asignación de Tarjeta";
    this.addLinkFieldProperty(CreditCard);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty2 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty2.setLabel("Tarjeta sin número");
    formViewProperty2.setCode("asfa");
    formViewProperty2.setName("AsignView");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty3 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty3.getField().add(new org.monet.metamodel.internal.Ref("CreditCard","direc.AsignationsCards.AsignationCard","direc.AsignationsCards.AsignationCard.CreditCard"));
    formViewProperty2.setShow(showProperty3);
    this.addView(formViewProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.asignationscards.asignationcard.$Definition$.class,"direc.AsignationsCards.AsignationCard","direc.Asignations.AsignationDefault");
  }
  }
  
  public static String static_getName() {
    return "AsignationCard";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.asignationscards.AsignationCard.class;
  }
  
  public String getClientBehaviour() {
    return "var mqj2d_g = new Object();mqj2d_g.refresh = function (node) {if (!node.isEditable()) return;};mqj2d_g.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final CreditCardProperty CreditCard = new direc.asignationscards.asignationcard.CreditCardProperty();
}
