package direc.schedule.scheduleslot;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class SlotProperty extends LinkFieldProperty {
  public SlotProperty() {
    super();this._code = "mgbvgjg";
    this._name = "Slot";
    this._label = "Slot";
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty1 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty1.setIndex(new org.monet.metamodel.internal.Ref("direc.Slots.Indice"));
    this.setSource(sourceProperty1);
    
  }
  
  public static String static_getName() {
    return "Slot";
  }
}
