package ceip.centerinformation;

import ceip.centerinformation.AcademicYearProperty;
import ceip.centerinformation.CenterCodeProperty;
import ceip.centerinformation.CenterNameProperty;
import ceip.centerinformation.ComplementaryCriteriaProperty;
import ceip.centerinformation.ContactProperty;
import ceip.centerinformation.InfluenceAreasProperty;
import ceip.centerinformation.LimitingAreasProperty;
import ceip.centerinformation.RelatedPreeschoolsProperty;
import ceip.centerinformation.RequiredDocsProperty;
import ceip.centerinformation.SpecificsProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "m23vtdw";
    this._name = "ceip.CenterInformation";
    this._isAbstract = null;this._label = "Información del Centro";
    this.addTextFieldProperty(CenterCode);
    this.addTextFieldProperty(CenterName);
    this.addSectionFieldProperty(Contact);
    this.addTextFieldProperty(InfluenceAreas);
    this.addTextFieldProperty(LimitingAreas);
    this.addTextFieldProperty(RelatedPreeschools);
    this.addTextFieldProperty(Specifics);
    this.addTextFieldProperty(ComplementaryCriteria);
    this.addFileFieldProperty(RequiredDocs);
    this.addSelectFieldProperty(AcademicYear);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty11 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty11.setLabel("Ficha de Centro");
    formViewProperty11.setCode("mlfxc3q");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty12 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("CenterCode","ceip.CenterInformation","ceip.CenterInformation.CenterCode"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("CenterName","ceip.CenterInformation","ceip.CenterInformation.CenterName"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Contact","ceip.CenterInformation","ceip.CenterInformation.Contact"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("InfluenceAreas","ceip.CenterInformation","ceip.CenterInformation.InfluenceAreas"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("LimitingAreas","ceip.CenterInformation","ceip.CenterInformation.LimitingAreas"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("RelatedPreeschools","ceip.CenterInformation","ceip.CenterInformation.RelatedPreeschools"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Specifics","ceip.CenterInformation","ceip.CenterInformation.Specifics"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("ComplementaryCriteria","ceip.CenterInformation","ceip.CenterInformation.ComplementaryCriteria"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("RequiredDocs","ceip.CenterInformation","ceip.CenterInformation.RequiredDocs"));
    formViewProperty11.setShow(showProperty12);
    this.addView(formViewProperty11);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty23 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty23.setLabel("Ficha de Centro");
    formViewProperty23.setCode("mgfrgdg");
    formViewProperty23.setName("View");
    formViewProperty23.setIsWidget(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty25 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty25.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","ceip.CenterInformation","ceip.CenterInformation.AcademicYear"));
    showProperty25.getField().add(new org.monet.metamodel.internal.Ref("CenterCode","ceip.CenterInformation","ceip.CenterInformation.CenterCode"));
    showProperty25.getField().add(new org.monet.metamodel.internal.Ref("CenterName","ceip.CenterInformation","ceip.CenterInformation.CenterName"));
    showProperty25.getField().add(new org.monet.metamodel.internal.Ref("Contact","ceip.CenterInformation","ceip.CenterInformation.Contact"));
    showProperty25.getField().add(new org.monet.metamodel.internal.Ref("InfluenceAreas","ceip.CenterInformation","ceip.CenterInformation.InfluenceAreas"));
    showProperty25.getField().add(new org.monet.metamodel.internal.Ref("LimitingAreas","ceip.CenterInformation","ceip.CenterInformation.LimitingAreas"));
    showProperty25.getField().add(new org.monet.metamodel.internal.Ref("RelatedPreeschools","ceip.CenterInformation","ceip.CenterInformation.RelatedPreeschools"));
    showProperty25.getField().add(new org.monet.metamodel.internal.Ref("Specifics","ceip.CenterInformation","ceip.CenterInformation.Specifics"));
    showProperty25.getField().add(new org.monet.metamodel.internal.Ref("ComplementaryCriteria","ceip.CenterInformation","ceip.CenterInformation.ComplementaryCriteria"));
    showProperty25.getField().add(new org.monet.metamodel.internal.Ref("RequiredDocs","ceip.CenterInformation","ceip.CenterInformation.RequiredDocs"));
    formViewProperty23.setShow(showProperty25);
    this.addView(formViewProperty23);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.centerinformation.$Definition$.class,"ceip.CenterInformation",null);
  }
  }
  
  public static String static_getName() {
    return "CenterInformation";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.CenterInformation.class;
  }
  
  public String getClientBehaviour() {
    return "var m23vtdw = new Object();m23vtdw.refresh = function (node) {if (!node.isEditable()) return;};m23vtdw.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final CenterCodeProperty CenterCode = new ceip.centerinformation.CenterCodeProperty();
  
  private final CenterNameProperty CenterName = new ceip.centerinformation.CenterNameProperty();
  
  private final ContactProperty Contact = new ceip.centerinformation.ContactProperty();
  
  private final InfluenceAreasProperty InfluenceAreas = new ceip.centerinformation.InfluenceAreasProperty();
  
  private final LimitingAreasProperty LimitingAreas = new ceip.centerinformation.LimitingAreasProperty();
  
  private final RelatedPreeschoolsProperty RelatedPreeschools = new ceip.centerinformation.RelatedPreeschoolsProperty();
  
  private final SpecificsProperty Specifics = new ceip.centerinformation.SpecificsProperty();
  
  private final ComplementaryCriteriaProperty ComplementaryCriteria = new ceip.centerinformation.ComplementaryCriteriaProperty();
  
  private final RequiredDocsProperty RequiredDocs = new ceip.centerinformation.RequiredDocsProperty();
  
  private final AcademicYearProperty AcademicYear = new ceip.centerinformation.AcademicYearProperty();
}
