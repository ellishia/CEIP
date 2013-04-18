package direc;

import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldSerial;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class LoteInfo extends NodeFormImpl {
  public FieldSerial getIdentifierField() {
    return ((org.monet.bpi.FieldSerial)this.getField("LoteInfo", "Identifier"));
  }
  
  public String getIdentifier() {
    return ((org.monet.bpi.FieldSerial)this.getField("LoteInfo", "Identifier")).get();
  }
  
  public void setIdentifier(final String value) {
    this.getIdentifierField().set(value);
  }
  
  public FieldSelect getAcademicYearField() {
    return ((org.monet.bpi.FieldSelect)this.getField("LoteInfo", "AcademicYear"));
  }
  
  public Term getAcademicYear() {
    return ((org.monet.bpi.FieldSelect)this.getField("LoteInfo", "AcademicYear")).get();
  }
  
  public void setAcademicYear(final Term value) {
    this.getAcademicYearField().set(value);
  }
  
  public FieldSelect getLevelField() {
    return ((org.monet.bpi.FieldSelect)this.getField("LoteInfo", "Level"));
  }
  
  public Term getLevel() {
    return ((org.monet.bpi.FieldSelect)this.getField("LoteInfo", "Level")).get();
  }
  
  public void setLevel(final Term value) {
    this.getLevelField().set(value);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static LoteInfo createNew(final Node parent) {
    return (direc.LoteInfo)org.monet.bpi.NodeService.create(direc.LoteInfo.class, parent);
  }
}
