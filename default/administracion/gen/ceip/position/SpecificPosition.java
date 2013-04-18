package ceip.position;

import org.monet.bpi.FieldNumber;
import org.monet.bpi.FieldSection;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.java.FieldSectionImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class SpecificPosition extends FieldSectionImpl implements FieldSection {
  public FieldSelect getLevelsField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Position", "Levels"));
  }
  
  public Term getLevels() {
    return ((org.monet.bpi.FieldSelect)this.getField("Position", "Levels")).get();
  }
  
  public void setLevels(final Term value) {
    this.getLevelsField().set(value);
  }
  
  public FieldNumber getNumberPositionsField() {
    return ((org.monet.bpi.FieldNumber)this.getField("Position", "NumberPositions"));
  }
  
  public org.monet.bpi.types.Number getNumberPositions() {
    return ((org.monet.bpi.FieldNumber)this.getField("Position", "NumberPositions")).get();
  }
  
  public void setNumberPositions(final org.monet.bpi.types.Number value) {
    this.getNumberPositionsField().set(value);
  }
  
  public void setNumberPositions(final double value) {
    this.getNumberPositionsField().set(new org.monet.bpi.types.Number(value));
  }
}
