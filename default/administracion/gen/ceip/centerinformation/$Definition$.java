package ceip.centerinformation;

import ceip.centerinformation.AcademicYearProperty;
import ceip.centerinformation.CenterCodeProperty;
import ceip.centerinformation.CenterNameProperty;
import ceip.centerinformation.ComplementaryCriteriaProperty;
import ceip.centerinformation.ContactProperty;
import ceip.centerinformation.InfluenceAreasProperty;
import ceip.centerinformation.LimitingAreasProperty;
import ceip.centerinformation.ProximityCriteriaProperty;
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
    this.addTextFieldProperty(ProximityCriteria);
    this.addTextFieldProperty(ComplementaryCriteria);
    this.addFileFieldProperty(RequiredDocs);
    this.addSelectFieldProperty(AcademicYear);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty12 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty12.setLabel("Ficha de Centro");
    formViewProperty12.setCode("mlfxc3q");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty13 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty13.getField().add(new org.monet.metamodel.internal.Ref("CenterCode","ceip.CenterInformation","ceip.CenterInformation.CenterCode"));
    showProperty13.getField().add(new org.monet.metamodel.internal.Ref("CenterName","ceip.CenterInformation","ceip.CenterInformation.CenterName"));
    showProperty13.getField().add(new org.monet.metamodel.internal.Ref("Contact","ceip.CenterInformation","ceip.CenterInformation.Contact"));
    formViewProperty12.setShow(showProperty13);
    this.addView(formViewProperty12);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty18 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty18.setLabel("Información relativa de matriculación");
    formViewProperty18.setCode("mfk_kpw");
    formViewProperty18.setName("MatDatos");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty19 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty19.getField().add(new org.monet.metamodel.internal.Ref("InfluenceAreas","ceip.CenterInformation","ceip.CenterInformation.InfluenceAreas"));
    showProperty19.getField().add(new org.monet.metamodel.internal.Ref("LimitingAreas","ceip.CenterInformation","ceip.CenterInformation.LimitingAreas"));
    showProperty19.getField().add(new org.monet.metamodel.internal.Ref("RelatedPreeschools","ceip.CenterInformation","ceip.CenterInformation.RelatedPreeschools"));
    showProperty19.getField().add(new org.monet.metamodel.internal.Ref("Specifics","ceip.CenterInformation","ceip.CenterInformation.Specifics"));
    showProperty19.getField().add(new org.monet.metamodel.internal.Ref("ProximityCriteria","ceip.CenterInformation","ceip.CenterInformation.ProximityCriteria"));
    showProperty19.getField().add(new org.monet.metamodel.internal.Ref("ComplementaryCriteria","ceip.CenterInformation","ceip.CenterInformation.ComplementaryCriteria"));
    showProperty19.getField().add(new org.monet.metamodel.internal.Ref("RequiredDocs","ceip.CenterInformation","ceip.CenterInformation.RequiredDocs"));
    formViewProperty18.setShow(showProperty19);
    this.addView(formViewProperty18);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty28 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty28.setLabel("Ficha de Centro");
    formViewProperty28.setCode("mgfrgdg");
    formViewProperty28.setName("View");
    formViewProperty28.setIsWidget(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty30 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty30.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","ceip.CenterInformation","ceip.CenterInformation.AcademicYear"));
    showProperty30.getField().add(new org.monet.metamodel.internal.Ref("CenterCode","ceip.CenterInformation","ceip.CenterInformation.CenterCode"));
    showProperty30.getField().add(new org.monet.metamodel.internal.Ref("CenterName","ceip.CenterInformation","ceip.CenterInformation.CenterName"));
    showProperty30.getField().add(new org.monet.metamodel.internal.Ref("Contact","ceip.CenterInformation","ceip.CenterInformation.Contact"));
    formViewProperty28.setShow(showProperty30);
    this.addView(formViewProperty28);
    
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
  
  private final ProximityCriteriaProperty ProximityCriteria = new ceip.centerinformation.ProximityCriteriaProperty();
  
  private final ComplementaryCriteriaProperty ComplementaryCriteria = new ceip.centerinformation.ComplementaryCriteriaProperty();
  
  private final RequiredDocsProperty RequiredDocs = new ceip.centerinformation.RequiredDocsProperty();
  
  private final AcademicYearProperty AcademicYear = new ceip.centerinformation.AcademicYearProperty();
}
