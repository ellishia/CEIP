package direc.rooms.room;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class PlacementProperty extends TextFieldProperty {
  public PlacementProperty() {
    super();this._code = "msfs1bg";
    this._name = "Placement";
    this._label = "Ubicación";
    
  }
  
  public static String static_getName() {
    return "Placement";
  }
}
