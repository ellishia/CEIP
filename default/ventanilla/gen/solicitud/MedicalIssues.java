package solicitud;

import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import solicitud.medicalissues.Allergies;
import solicitud.medicalissues.Diabetes;
import solicitud.medicalissues.Epilepsia;
import solicitud.medicalissues.Others;

@SuppressWarnings("all")
public class MedicalIssues extends NodeFormImpl {
  public Epilepsia getEpilepsiaField() {
    return ((solicitud.medicalissues.Epilepsia)this.getField("MedicalIssues", "Epilepsia"));
  }
  
  public Diabetes getDiabetesField() {
    return ((solicitud.medicalissues.Diabetes)this.getField("MedicalIssues", "Diabetes"));
  }
  
  public Allergies getAllergiesField() {
    return ((solicitud.medicalissues.Allergies)this.getField("MedicalIssues", "Allergies"));
  }
  
  public Others getOthersField() {
    return ((solicitud.medicalissues.Others)this.getField("MedicalIssues", "Others"));
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static MedicalIssues createNew(final Node parent) {
    return (solicitud.MedicalIssues)org.monet.bpi.NodeService.create(solicitud.MedicalIssues.class, parent);
  }
}
