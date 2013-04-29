package solicitud;

import org.monet.bpi.FieldSection;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;

@SuppressWarnings("all")
public class MedicalIssues extends NodeFormImpl {
  public FieldSection getEpilepsiaField() {
    return ((org.monet.bpi.FieldSection)this.getField("MedicalIssues", "Epilepsia"));
  }
  
  public FieldSection getDiabetesField() {
    return ((org.monet.bpi.FieldSection)this.getField("MedicalIssues", "Diabetes"));
  }
  
  public FieldSection getAllergiesField() {
    return ((org.monet.bpi.FieldSection)this.getField("MedicalIssues", "Allergies"));
  }
  
  public FieldSection getOthersField() {
    return ((org.monet.bpi.FieldSection)this.getField("MedicalIssues", "Others"));
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static MedicalIssues createNew(final Node parent) {
    return (solicitud.MedicalIssues)org.monet.bpi.NodeService.create(solicitud.MedicalIssues.class, parent);
  }
}
