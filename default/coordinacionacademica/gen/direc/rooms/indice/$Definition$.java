package direc.rooms.indice;

import direc.rooms.indice.CapacityProperty;
import direc.rooms.indice.NombreProperty;
import direc.rooms.indice.PlacementProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "imyfcogg";
    this._name = "direc.Rooms.Indice";
    this._isAbstract = null;this._label = "Aulas";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Nombre);
    referenceProperty1.addAttributeProperty(Capacity);
    referenceProperty1.addAttributeProperty(Placement);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty5.setCode("mhrf9iw");
    indexViewProperty5.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty5.setTitle(new org.monet.metamodel.internal.Ref("Nombre","direc.Rooms.Indice","direc.Rooms.Indice.Nombre"));
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("Capacity","direc.Rooms.Indice","direc.Rooms.Indice.Capacity"));
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("Placement","direc.Rooms.Indice","direc.Rooms.Indice.Placement"));
    indexViewProperty5.setShow(showProperty5);
    this.addView(indexViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.rooms.indice.$Definition$.class,"direc.Rooms.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.rooms.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var imyfcogg = new Object();imyfcogg.refresh = function (node) {if (!node.isEditable()) return;};imyfcogg.onChangeField = function (node, field) {};";
  }
  
  private final NombreProperty Nombre = new direc.rooms.indice.NombreProperty();
  
  private final CapacityProperty Capacity = new direc.rooms.indice.CapacityProperty();
  
  private final PlacementProperty Placement = new direc.rooms.indice.PlacementProperty();
}
