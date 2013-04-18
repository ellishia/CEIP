package ceip.student;

import org.monet.metamodel.ContainerDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ContainerDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mw39_ca";
    this._name = "ceip.Student";
    this._isAbstract = null;this._label = "Alumno/a";
    org.monet.metamodel.ContainerDefinition.ContainProperty containProperty1 = new org.monet.metamodel.ContainerDefinition.ContainProperty();
    containProperty1.getNode().add(new org.monet.metamodel.internal.Ref("ceip.BasicInfo"));
    containProperty1.getNode().add(new org.monet.metamodel.internal.Ref("ceip.MedicalIssues"));
    containProperty1.getNode().add(new org.monet.metamodel.internal.Ref("ceip.Relatives"));
    this.setContain(containProperty1);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty5 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty5.setLabel("Alumno/a");
    viewProperty5.setCode("mehmkfq");
    viewProperty5.setIsDefault(true);
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty7.getComponent().add(new org.monet.metamodel.internal.Ref("Vista","ceip.BasicInfo","ceip.BasicInfo.Vista"));
    viewProperty5.setShow(showProperty7);
    this.addView(viewProperty5);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty10 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty10.setLabel("Tutores");
    viewProperty10.setCode("muaxgvq");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty11 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty11.getComponent().add(new org.monet.metamodel.internal.Ref("Vista2","ceip.Relatives","ceip.Relatives.Vista2"));
    viewProperty10.setShow(showProperty11);
    this.addView(viewProperty10);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty14 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty14.setLabel("Familiares Autorizados");
    viewProperty14.setCode("mcaypxw");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty15 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty15.getComponent().add(new org.monet.metamodel.internal.Ref("RelativesView","ceip.Relatives","ceip.Relatives.RelativesView"));
    viewProperty14.setShow(showProperty15);
    this.addView(viewProperty14);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty18 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty18.setLabel("Afecciones médicas");
    viewProperty18.setCode("m0c7lxw");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty19 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty19.getComponent().add(new org.monet.metamodel.internal.Ref("MedicalView","ceip.MedicalIssues","ceip.MedicalIssues.MedicalView"));
    viewProperty18.setShow(showProperty19);
    this.addView(viewProperty18);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty22 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty22.setLabel("Boletines");
    viewProperty22.setCode("miorrbg");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty23 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty23.getComponent().add(new org.monet.metamodel.internal.Ref("VistaBoletin","ceip.BasicInfo","ceip.BasicInfo.VistaBoletin"));
    viewProperty22.setShow(showProperty23);
    this.addView(viewProperty22);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.student.$Definition$.class,"ceip.Student",null);
  }
  }
  
  public static String static_getName() {
    return "Student";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.Student.class;
  }
  
  public String getClientBehaviour() {
    return "var mw39_ca = new Object();mw39_ca.refresh = function (node) {if (!node.isEditable()) return;};mw39_ca.onChangeField = function (node, field) {};";
  }
}
