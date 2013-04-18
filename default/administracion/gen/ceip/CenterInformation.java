package ceip;

import ceip.centerinformation.Contact;
import java.util.ArrayList;
import org.monet.bpi.FieldFile;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.File;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class CenterInformation extends NodeFormImpl {
  public FieldText getCenterCodeField() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "CenterCode"));
  }
  
  public String getCenterCode() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "CenterCode")).get();
  }
  
  public void setCenterCode(final String value) {
    this.getCenterCodeField().set(value);
  }
  
  public FieldText getCenterNameField() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "CenterName"));
  }
  
  public String getCenterName() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "CenterName")).get();
  }
  
  public void setCenterName(final String value) {
    this.getCenterNameField().set(value);
  }
  
  public Contact getContactField() {
    return ((ceip.centerinformation.Contact)this.getField("CenterInformation", "Contact"));
  }
  
  public FieldText getInfluenceAreasField() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "InfluenceAreas"));
  }
  
  public String getInfluenceAreas() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "InfluenceAreas")).get();
  }
  
  public void setInfluenceAreas(final String value) {
    this.getInfluenceAreasField().set(value);
  }
  
  public FieldText getLimitingAreasField() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "LimitingAreas"));
  }
  
  public String getLimitingAreas() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "LimitingAreas")).get();
  }
  
  public void setLimitingAreas(final String value) {
    this.getLimitingAreasField().set(value);
  }
  
  public FieldMultiple<FieldText,String> getRelatedPreeschoolsField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldText, java.lang.String>)this.getField("CenterInformation", "RelatedPreeschools"));
  }
  
  public ArrayList<String> getRelatedPreeschools() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldText, java.lang.String>)this.getField("CenterInformation", "RelatedPreeschools")).getAll();
  }
  
  public FieldMultiple<FieldText,String> getSpecificsField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldText, java.lang.String>)this.getField("CenterInformation", "Specifics"));
  }
  
  public ArrayList<String> getSpecifics() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldText, java.lang.String>)this.getField("CenterInformation", "Specifics")).getAll();
  }
  
  public FieldText getComplementaryCriteriaField() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "ComplementaryCriteria"));
  }
  
  public String getComplementaryCriteria() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "ComplementaryCriteria")).get();
  }
  
  public void setComplementaryCriteria(final String value) {
    this.getComplementaryCriteriaField().set(value);
  }
  
  public FieldMultiple<FieldFile,File> getRequiredDocsField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldFile, org.monet.bpi.types.File>)this.getField("CenterInformation", "RequiredDocs"));
  }
  
  public ArrayList<File> getRequiredDocs() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldFile, org.monet.bpi.types.File>)this.getField("CenterInformation", "RequiredDocs")).getAll();
  }
  
  public FieldSelect getAcademicYearField() {
    return ((org.monet.bpi.FieldSelect)this.getField("CenterInformation", "AcademicYear"));
  }
  
  public Term getAcademicYear() {
    return ((org.monet.bpi.FieldSelect)this.getField("CenterInformation", "AcademicYear")).get();
  }
  
  public void setAcademicYear(final Term value) {
    this.getAcademicYearField().set(value);
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static CenterInformation createNew(final Node parent) {
    return (ceip.CenterInformation)org.monet.bpi.NodeService.create(ceip.CenterInformation.class, parent);
  }
}
