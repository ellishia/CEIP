package solicitud.medicalissues;

import org.monet.bpi.FieldBoolean;
import org.monet.bpi.FieldSection;
import org.monet.bpi.FieldText;
import org.monet.bpi.java.FieldSectionImpl;

@SuppressWarnings("all")
public class Others extends FieldSectionImpl implements FieldSection {
  public FieldBoolean getHasField() {
    return ((org.monet.bpi.FieldBoolean)this.getField("MedicalIssues", "Has"));
  }
  
  public boolean getHas() {
    return ((org.monet.bpi.FieldBoolean)this.getField("MedicalIssues", "Has")).get();
  }
  
  public void setHas(final boolean value) {
    this.getHasField().set(value);
  }
  
  public FieldText getEspecifyField() {
    return ((org.monet.bpi.FieldText)this.getField("MedicalIssues", "Especify"));
  }
  
  public String getEspecify() {
    return ((org.monet.bpi.FieldText)this.getField("MedicalIssues", "Especify")).get();
  }
  
  public void setEspecify(final String value) {
    this.getEspecifyField().set(value);
  }
  
  public FieldText getObservationsField() {
    return ((org.monet.bpi.FieldText)this.getField("MedicalIssues", "Observations"));
  }
  
  public String getObservations() {
    return ((org.monet.bpi.FieldText)this.getField("MedicalIssues", "Observations")).get();
  }
  
  public void setObservations(final String value) {
    this.getObservationsField().set(value);
  }
}
