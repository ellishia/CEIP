package ceip;

import ceip.medicalissues.Allergies;
import ceip.medicalissues.Diabetes;
import ceip.medicalissues.Epilepsia;
import ceip.medicalissues.Others;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;

@SuppressWarnings("all")
public class MedicalIssues extends NodeFormImpl {
  public Epilepsia getEpilepsiaField() {
    return ((ceip.medicalissues.Epilepsia)this.getField("MedicalIssues", "Epilepsia"));
  }
  
  public Diabetes getDiabetesField() {
    return ((ceip.medicalissues.Diabetes)this.getField("MedicalIssues", "Diabetes"));
  }
  
  public Allergies getAllergiesField() {
    return ((ceip.medicalissues.Allergies)this.getField("MedicalIssues", "Allergies"));
  }
  
  public Others getOthersField() {
    return ((ceip.medicalissues.Others)this.getField("MedicalIssues", "Others"));
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static MedicalIssues createNew(final Node parent) {
    return (ceip.MedicalIssues)org.monet.bpi.NodeService.create(ceip.MedicalIssues.class, parent);
  }
}
