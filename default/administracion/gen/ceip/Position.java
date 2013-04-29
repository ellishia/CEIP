package ceip;

import ceip.availablepositions.Indice;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSection;
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
  
  public FieldMultiple<FieldSection,Void> getSpecificPositionField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldSection, java.lang.Void>)this.getField("Position", "SpecificPosition"));
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
