package direc.dayorders.dayorder;

import direc.dayorders.dayorder.TitleProperty;
import direc.dayorders.dayorder.TopicsProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mai6tnq";
    this._name = "direc.DayOrders.DayOrder";
    this._isAbstract = null;this._label = "Orden del día";
    this.addTextFieldProperty(Title);
    this.addTextFieldProperty(Topics);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty3 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty3.setIndex(new org.monet.metamodel.internal.Ref("direc.DayOrders.Indice"));
    this.getMappingList().add(mappingProperty3);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty5 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty5.setLabel("Convocatoria");
    formViewProperty5.setCode("modt_yg");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty6.getField().add(new org.monet.metamodel.internal.Ref("Title","direc.DayOrders.DayOrder","direc.DayOrders.DayOrder.Title"));
    showProperty6.getField().add(new org.monet.metamodel.internal.Ref("Topics","direc.DayOrders.DayOrder","direc.DayOrders.DayOrder.Topics"));
    formViewProperty5.setShow(showProperty6);
    this.addView(formViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.dayorders.dayorder.$Definition$.class,"direc.DayOrders.DayOrder",null);
  }
  }
  
  public static String static_getName() {
    return "DayOrder";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.dayorders.DayOrder.class;
  }
  
  public String getClientBehaviour() {
    return "var mai6tnq = new Object();mai6tnq.refresh = function (node) {if (!node.isEditable()) return;};mai6tnq.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case 1097950261:
    return direc.dayorders.dayorder.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final TitleProperty Title = new direc.dayorders.dayorder.TitleProperty();
  
  private final TopicsProperty Topics = new direc.dayorders.dayorder.TopicsProperty();
}
