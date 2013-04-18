package direc.rooms.room;

import direc.rooms.room.CapacityProperty;
import direc.rooms.room.NombreProperty;
import direc.rooms.room.PlacementProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasProperties;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasProperties, HasMappings {
  public $Definition$() {
    super();this._code = "m9ybxmq";
    this._name = "direc.Rooms.Room";
    this._isAbstract = null;this._label = "Aula o estancia";
    this.addTextFieldProperty(Nombre);
    this.addTextFieldProperty(Placement);
    this.addNumberFieldProperty(Capacity);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty4 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty4.setIndex(new org.monet.metamodel.internal.Ref("direc.Rooms.Indice"));
    this.getMappingList().add(mappingProperty4);
    org.monet.metamodel.FormDefinition.PropertiesProperty propertiesProperty6 = new org.monet.metamodel.FormDefinition.PropertiesProperty();
    this.setProperties(propertiesProperty6);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty8 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty8.setLabel("Ficha");
    formViewProperty8.setCode("m62v6dq");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty9 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Nombre","direc.Rooms.Room","direc.Rooms.Room.Nombre"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Capacity","direc.Rooms.Room","direc.Rooms.Room.Capacity"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Placement","direc.Rooms.Room","direc.Rooms.Room.Placement"));
    formViewProperty8.setShow(showProperty9);
    this.addView(formViewProperty8);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.rooms.room.$Definition$.class,"direc.Rooms.Room",null);
  }
  }
  
  public static String static_getName() {
    return "Room";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.rooms.Room.class;
  }
  
  public String getClientBehaviour() {
    return "var m9ybxmq = new Object();m9ybxmq.refresh = function (node) {if (!node.isEditable()) return;};m9ybxmq.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getPropertiesClass() {
    return direc.rooms.room.$Properties$.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -173469443:
    return direc.rooms.room.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final NombreProperty Nombre = new direc.rooms.room.NombreProperty();
  
  private final PlacementProperty Placement = new direc.rooms.room.PlacementProperty();
  
  private final CapacityProperty Capacity = new direc.rooms.room.CapacityProperty();
}
