package ceip.position;

import ceip.position.specificposition.LevelsProperty;
import ceip.position.specificposition.NumberPositionsProperty;
import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;

@SuppressWarnings("all")
public class SpecificPositionProperty extends SectionFieldProperty implements HasBehaviour {
  public SpecificPositionProperty() {
    super();this._code = "mkuxpdq";
    this._name = "SpecificPosition";
    this._label = "Plazas";
    this.setIsMultiple(true);
    this.addSelectFieldProperty(Levels);
    this.addNumberFieldProperty(NumberPositions);
    
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.position.SpecificPosition.class;
  }
  
  public static String static_getName() {
    return "SpecificPosition";
  }
  
  private final LevelsProperty Levels = new ceip.position.specificposition.LevelsProperty();
  
  private final NumberPositionsProperty NumberPositions = new ceip.position.specificposition.NumberPositionsProperty();
}
