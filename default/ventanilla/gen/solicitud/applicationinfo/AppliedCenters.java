package solicitud.applicationinfo;

import org.monet.bpi.FieldSection;
import org.monet.bpi.FieldSerial;
import org.monet.bpi.FieldText;
import org.monet.bpi.java.FieldSectionImpl;

@SuppressWarnings("all")
public class AppliedCenters extends FieldSectionImpl implements FieldSection {
  public FieldSerial getPreferenceField() {
    return ((org.monet.bpi.FieldSerial)this.getField("ApplicationInfo", "Preference"));
  }
  
  public String getPreference() {
    return ((org.monet.bpi.FieldSerial)this.getField("ApplicationInfo", "Preference")).get();
  }
  
  public void setPreference(final String value) {
    this.getPreferenceField().set(value);
  }
  
  public FieldText getCenterNameField() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "CenterName"));
  }
  
  public String getCenterName() {
    return ((org.monet.bpi.FieldText)this.getField("ApplicationInfo", "CenterName")).get();
  }
  
  public void setCenterName(final String value) {
    this.getCenterNameField().set(value);
  }
}
