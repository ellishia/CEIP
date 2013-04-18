package ceip.medicalissues;

import ceip.medicalissues.AllergiesProperty;
import ceip.medicalissues.DiabetesProperty;
import ceip.medicalissues.EpilepsiaProperty;
import ceip.medicalissues.OthersProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "m1hdzww";
    this._name = "ceip.MedicalIssues";
    this._isAbstract = null;this._label = "Afecciones";
    this.setIsComponent(true);
    this.addSectionFieldProperty(Epilepsia);
    this.addSectionFieldProperty(Diabetes);
    this.addSectionFieldProperty(Allergies);
    this.addSectionFieldProperty(Others);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty6 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty6.setLabel("Afecciones médicas");
    formViewProperty6.setCode("mg_jwwq");
    formViewProperty6.setIsDefault(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty8 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("Epilepsia","ceip.MedicalIssues","ceip.MedicalIssues.Epilepsia"));
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("Diabetes","ceip.MedicalIssues","ceip.MedicalIssues.Diabetes"));
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("Allergies","ceip.MedicalIssues","ceip.MedicalIssues.Allergies"));
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("Others","ceip.MedicalIssues","ceip.MedicalIssues.Others"));
    formViewProperty6.setShow(showProperty8);
    this.addView(formViewProperty6);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty14 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty14.setLabel("Afecciones médicas");
    formViewProperty14.setCode("m3igw_w");
    formViewProperty14.setName("MedicalView");
    formViewProperty14.setIsWidget(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty16 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty16.getField().add(new org.monet.metamodel.internal.Ref("Epilepsia","ceip.MedicalIssues","ceip.MedicalIssues.Epilepsia"));
    showProperty16.getField().add(new org.monet.metamodel.internal.Ref("Diabetes","ceip.MedicalIssues","ceip.MedicalIssues.Diabetes"));
    showProperty16.getField().add(new org.monet.metamodel.internal.Ref("Allergies","ceip.MedicalIssues","ceip.MedicalIssues.Allergies"));
    showProperty16.getField().add(new org.monet.metamodel.internal.Ref("Others","ceip.MedicalIssues","ceip.MedicalIssues.Others"));
    formViewProperty14.setShow(showProperty16);
    this.addView(formViewProperty14);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.medicalissues.$Definition$.class,"ceip.MedicalIssues",null);
  }
  }
  
  public static String static_getName() {
    return "MedicalIssues";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.MedicalIssues.class;
  }
  
  public String getClientBehaviour() {
    return "var m1hdzww = new Object();m1hdzww.refresh = function (node) {if (!node.isEditable()) return;};m1hdzww.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final EpilepsiaProperty Epilepsia = new ceip.medicalissues.EpilepsiaProperty();
  
  private final DiabetesProperty Diabetes = new ceip.medicalissues.DiabetesProperty();
  
  private final AllergiesProperty Allergies = new ceip.medicalissues.AllergiesProperty();
  
  private final OthersProperty Others = new ceip.medicalissues.OthersProperty();
}
