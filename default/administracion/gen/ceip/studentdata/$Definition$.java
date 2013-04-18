package ceip.studentdata;

import org.monet.metamodel.ContainerDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ContainerDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "md_rleg";
    this._name = "ceip.StudentData";
    this._isAbstract = null;this._label = "StudentData";
    org.monet.metamodel.ContainerDefinition.ContainProperty containProperty1 = new org.monet.metamodel.ContainerDefinition.ContainProperty();
    containProperty1.getNode().add(new org.monet.metamodel.internal.Ref("ceip.MedicalIssues"));
    containProperty1.getNode().add(new org.monet.metamodel.internal.Ref("ceip.Relatives"));
    this.setContain(containProperty1);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty4 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty4.setLabel("Aspectos médicos");
    viewProperty4.setCode("m8c7e4a");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty5.getComponent().add(new org.monet.metamodel.internal.Ref("MedicalView","ceip.MedicalIssues","ceip.MedicalIssues.MedicalView"));
    viewProperty4.setShow(showProperty5);
    this.addView(viewProperty4);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty8 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty8.setLabel("Familiares");
    viewProperty8.setCode("mz4gh_q");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty9 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty9.getComponent().add(new org.monet.metamodel.internal.Ref("RelativesView","ceip.Relatives","ceip.Relatives.RelativesView"));
    viewProperty8.setShow(showProperty9);
    this.addView(viewProperty8);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.studentdata.$Definition$.class,"ceip.StudentData",null);
  }
  }
  
  public static String static_getName() {
    return "StudentData";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.StudentData.class;
  }
  
  public String getClientBehaviour() {
    return "var md_rleg = new Object();md_rleg.refresh = function (node) {if (!node.isEditable()) return;};md_rleg.onChangeField = function (node, field) {};";
  }
}
