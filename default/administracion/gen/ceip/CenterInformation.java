package ceip;

import ceip.Hours;
import ceip.hours.Hour;
import ceip.hours.Index;
import com.google.common.base.Objects;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.monet.bpi.FieldFile;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSection;
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
  
  public FieldSelect getOpeningHourField() {
    return ((org.monet.bpi.FieldSelect)this.getField("CenterInformation", "OpeningHour"));
  }
  
  public Term getOpeningHour() {
    return ((org.monet.bpi.FieldSelect)this.getField("CenterInformation", "OpeningHour")).get();
  }
  
  public void setOpeningHour(final Term value) {
    this.getOpeningHourField().set(value);
  }
  
  public FieldSelect getClosingHourField() {
    return ((org.monet.bpi.FieldSelect)this.getField("CenterInformation", "ClosingHour"));
  }
  
  public Term getClosingHour() {
    return ((org.monet.bpi.FieldSelect)this.getField("CenterInformation", "ClosingHour")).get();
  }
  
  public void setClosingHour(final Term value) {
    this.getClosingHourField().set(value);
  }
  
  public FieldText getAcademicHoursField() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "AcademicHours"));
  }
  
  public String getAcademicHours() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "AcademicHours")).get();
  }
  
  public void setAcademicHours(final String value) {
    this.getAcademicHoursField().set(value);
  }
  
  public FieldSection getContactField() {
    return ((org.monet.bpi.FieldSection)this.getField("CenterInformation", "Contact"));
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
  
  public FieldText getProximityCriteriaField() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "ProximityCriteria"));
  }
  
  public String getProximityCriteria() {
    return ((org.monet.bpi.FieldText)this.getField("CenterInformation", "ProximityCriteria")).get();
  }
  
  public void setProximityCriteria(final String value) {
    this.getProximityCriteriaField().set(value);
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
  
  public void onSaved() {
    this.GenerateHours(this);
  }
  
  public void GenerateHours(final Node centerInfo) {
    CenterInformation centerI = ((CenterInformation) centerInfo);
    String _academicHours = centerI.getAcademicHours();
    Integer horaslec = Integer.getInteger(_academicHours);
    Hours coleccion = Hours.getInstance();
    String _note = this.getNote("Horas");
    boolean _equals = Objects.equal(_note, null);
    if (_equals) {
      String _academicHours_1 = centerI.getAcademicHours();
      this.addNote("Horas", _academicHours_1);
      this.saveNotes();
      boolean _greaterThan = ((horaslec).intValue() > 0);
      boolean _while = _greaterThan;
      while (_while) {
        {
          Hour hora = Hour.createNew(coleccion);
          String _string = horaslec.toString();
          String _plus = (_string + "\u00AA");
          hora.setName(_plus);
          hora.setOrden((horaslec).intValue());
          int _minus = ((horaslec).intValue() - 1);
          horaslec = Integer.valueOf(_minus);
        }
        boolean _greaterThan_1 = ((horaslec).intValue() > 0);
        _while = _greaterThan_1;
      }
    } else {
      String _note_1 = this.getNote("Horas");
      String horas = ((String) _note_1);
      String _academicHours_2 = centerI.getAcademicHours();
      boolean _notEquals = (!Objects.equal(horas, _academicHours_2));
      if (_notEquals) {
        String _academicHours_3 = centerI.getAcademicHours();
        Integer actual = Integer.getInteger(_academicHours_3);
        Integer antig = Integer.getInteger(horas);
        boolean _lessThan = (antig.compareTo(actual) < 0);
        boolean _while_1 = _lessThan;
        while (_while_1) {
          {
            Hour hora = Hour.createNew(coleccion);
            String _string = actual.toString();
            String _plus = (_string + "\u00AA");
            hora.setName(_plus);
            hora.setOrden((actual).intValue());
            int _minus = ((actual).intValue() - 1);
            actual = Integer.valueOf(_minus);
          }
          boolean _lessThan_1 = (antig.compareTo(actual) < 0);
          _while_1 = _lessThan_1;
        }
        String _academicHours_4 = centerI.getAcademicHours();
        Integer _integer = Integer.getInteger(_academicHours_4);
        actual = _integer;
        Iterable<Index> nodos = coleccion.getAll();
        boolean _greaterThan_1 = (antig.compareTo(actual) > 0);
        boolean _while_2 = _greaterThan_1;
        while (_while_2) {
          {
            final Iterable<Index> _converted_nodos = (Iterable<Index>)nodos;
            int _minus = ((antig).intValue() - 1);
            Index nodo = ((Index[])Conversions.unwrapArray(_converted_nodos, Index.class))[_minus];
            int _minus_1 = ((antig).intValue() - 1);
            antig = Integer.valueOf(_minus_1);
          }
          boolean _greaterThan_2 = (antig.compareTo(actual) > 0);
          _while_2 = _greaterThan_2;
        }
        String _academicHours_5 = centerI.getAcademicHours();
        this.addNote("Horas", _academicHours_5);
        this.saveNotes();
      }
    }
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static CenterInformation createNew(final Node parent) {
    return (ceip.CenterInformation)org.monet.bpi.NodeService.create(ceip.CenterInformation.class, parent);
  }
}
