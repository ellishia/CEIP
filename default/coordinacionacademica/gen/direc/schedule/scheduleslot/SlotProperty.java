package direc.schedule.scheduleslot;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class SlotProperty extends LinkFieldProperty {
  public SlotProperty() {
    super();this._code = "mgbvgjg";
    this._name = "Slot";
    this._label = "Slot";
    this.setAllowAdd(true);
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty2 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty2.setIndex(new org.monet.metamodel.internal.Ref("direc.Slots.Indice"));
    sourceProperty2.setCollection(new org.monet.metamodel.internal.Ref("direc.Slots"));
    this.setSource(sourceProperty2);
    
  }
  
  public static String static_getName() {
    return "Slot";
  }
}
