package ceip;

import ceip.availablepositions.Indice;
import ceip.position.SpecificPosition;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Position extends NodeFormImpl {
  public FieldSelect getAcademicYearField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Position", "AcademicYear"));
  }
  
  public Term getAcademicYear() {
    return ((org.monet.bpi.FieldSelect)this.getField("Position", "AcademicYear")).get();
  }
  
  public void setAcademicYear(final Term value) {
    this.getAcademicYearField().set(value);
  }
  
  public FieldMultiple<SpecificPosition,Void> getSpecificPositionField() {
    return ((org.monet.bpi.FieldMultiple<ceip.position.SpecificPosition, java.lang.Void>)this.getField("Position", "SpecificPosition"));
  }
  
  public Indice getIndice() {
    return (ceip.availablepositions.Indice)this.getIndexEntry("ceip.AvailablePositions.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Position createNew(final Node parent) {
    return (ceip.Position)org.monet.bpi.NodeService.create(ceip.Position.class, parent);
  }
}
