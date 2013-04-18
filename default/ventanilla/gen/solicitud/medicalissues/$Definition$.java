package solicitud.medicalissues;

import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import solicitud.medicalissues.AllergiesProperty;
import solicitud.medicalissues.DiabetesProperty;
import solicitud.medicalissues.EpilepsiaProperty;
import solicitud.medicalissues.OthersProperty;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "m1hdzww";
    this._name = "solicitud.MedicalIssues";
    this._isAbstract = null;this._label = "Afecciones";
    this.setIsComponent(true);
    this.addSectionFieldProperty(Epilepsia);
    this.addSectionFieldProperty(Diabetes);
    this.addSectionFieldProperty(Allergies);
    this.addSectionFieldProperty(Others);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty6 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty6.setLabel("Afecciones médicas");
    formViewProperty6.setCode("mlcr_6q");
    formViewProperty6.setIsDefault(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty8 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("Epilepsia","solicitud.MedicalIssues","solicitud.MedicalIssues.Epilepsia"));
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("Diabetes","solicitud.MedicalIssues","solicitud.MedicalIssues.Diabetes"));
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("Allergies","solicitud.MedicalIssues","solicitud.MedicalIssues.Allergies"));
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("Others","solicitud.MedicalIssues","solicitud.MedicalIssues.Others"));
    formViewProperty6.setShow(showProperty8);
    this.addView(formViewProperty6);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty14 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty14.setLabel("Afecciones médicas");
    formViewProperty14.setCode("m3igw_w");
    formViewProperty14.setName("MedicalView");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty15 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Epilepsia","solicitud.MedicalIssues","solicitud.MedicalIssues.Epilepsia"));
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Diabetes","solicitud.MedicalIssues","solicitud.MedicalIssues.Diabetes"));
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Allergies","solicitud.MedicalIssues","solicitud.MedicalIssues.Allergies"));
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Others","solicitud.MedicalIssues","solicitud.MedicalIssues.Others"));
    formViewProperty14.setShow(showProperty15);
    this.addView(formViewProperty14);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.medicalissues.$Definition$.class,"solicitud.MedicalIssues",null);
  }
  }
  
  public static String static_getName() {
    return "MedicalIssues";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.MedicalIssues.class;
  }
  
  public String getClientBehaviour() {
    return "var m1hdzww = new Object();m1hdzww.refresh = function (node) {if (!node.isEditable()) return;};m1hdzww.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final EpilepsiaProperty Epilepsia = new solicitud.medicalissues.EpilepsiaProperty();
  
  private final DiabetesProperty Diabetes = new solicitud.medicalissues.DiabetesProperty();
  
  private final AllergiesProperty Allergies = new solicitud.medicalissues.AllergiesProperty();
  
  private final OthersProperty Others = new solicitud.medicalissues.OthersProperty();
}
