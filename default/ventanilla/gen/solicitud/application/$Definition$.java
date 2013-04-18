package solicitud.application;

import org.monet.metamodel.ContainerDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ContainerDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "md_rleg";
    this._name = "solicitud.Application";
    this._isAbstract = null;this._label = "Solicitud";
    org.monet.metamodel.ContainerDefinition.ContainProperty containProperty1 = new org.monet.metamodel.ContainerDefinition.ContainProperty();
    containProperty1.getNode().add(new org.monet.metamodel.internal.Ref("solicitud.ApplicationInfo"));
    containProperty1.getNode().add(new org.monet.metamodel.internal.Ref("solicitud.MedicalIssues"));
    containProperty1.getNode().add(new org.monet.metamodel.internal.Ref("solicitud.Relatives"));
    this.setContain(containProperty1);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty5 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty5.setLabel("Solicitud");
    viewProperty5.setCode("m5xbohw");
    viewProperty5.setIsDefault(true);
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty7.getComponent().add(new org.monet.metamodel.internal.Ref("View","solicitud.ApplicationInfo","solicitud.ApplicationInfo.View"));
    viewProperty5.setShow(showProperty7);
    this.addView(viewProperty5);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty10 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty10.setLabel("Domicilio");
    viewProperty10.setCode("mohlgtw");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty11 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty11.getComponent().add(new org.monet.metamodel.internal.Ref("HomeAdd","solicitud.ApplicationInfo","solicitud.ApplicationInfo.HomeAdd"));
    viewProperty10.setShow(showProperty11);
    this.addView(viewProperty10);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty14 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty14.setLabel("Padres o Tutores");
    viewProperty14.setCode("mpan5ga");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty15 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty15.getComponent().add(new org.monet.metamodel.internal.Ref("Vista2","solicitud.Relatives","solicitud.Relatives.Vista2"));
    viewProperty14.setShow(showProperty15);
    this.addView(viewProperty14);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty18 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty18.setLabel("Centros y Baremos Adicionales");
    viewProperty18.setCode("mnano_g");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty19 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty19.getComponent().add(new org.monet.metamodel.internal.Ref("Criteria","solicitud.ApplicationInfo","solicitud.ApplicationInfo.Criteria"));
    viewProperty18.setShow(showProperty19);
    this.addView(viewProperty18);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty22 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty22.setLabel("Aspectos médicos");
    viewProperty22.setCode("ms_eg2q");
    viewProperty22.setName("MedicalAspects");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty23 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty23.getComponent().add(new org.monet.metamodel.internal.Ref("MedicalView","solicitud.MedicalIssues","solicitud.MedicalIssues.MedicalView"));
    viewProperty22.setShow(showProperty23);
    this.addView(viewProperty22);
    org.monet.metamodel.ContainerDefinition.RuleViewProperty ruleViewProperty26 = new org.monet.metamodel.ContainerDefinition.RuleViewProperty();
    ruleViewProperty26.getAddFlag().add(org.monet.metamodel.NodeDefinitionBase.RuleViewProperty.AddFlagEnumeration.HIDDEN);
    ruleViewProperty26.setCode("mg6acbg");
    org.monet.metamodel.ContainerDefinition.RuleViewProperty.ToProperty toProperty28 = new org.monet.metamodel.ContainerDefinition.RuleViewProperty.ToProperty();
    toProperty28.getView().add(new org.monet.metamodel.internal.Ref("MedicalAspects","solicitud.Application","solicitud.Application.MedicalAspects"));
    toProperty28.getView().add(new org.monet.metamodel.internal.Ref("RelativesView","solicitud.Application","solicitud.Application.RelativesView"));
    ruleViewProperty26.setTo(toProperty28);
    this.getRuleViewList().add(ruleViewProperty26);
    org.monet.metamodel.ContainerDefinition.OperationProperty operationProperty32 = new org.monet.metamodel.ContainerDefinition.OperationProperty();
    operationProperty32.setLabel("Formalizar Matricula");
    operationProperty32.setCode("ma25txg");
    operationProperty32.setName("Formalizar");
    this.addOperation(operationProperty32);
    org.monet.metamodel.ContainerDefinition.RuleOperationProperty ruleOperationProperty35 = new org.monet.metamodel.ContainerDefinition.RuleOperationProperty();
    ruleOperationProperty35.getAddFlag().add(org.monet.metamodel.NodeDefinitionBase.RuleOperationProperty.AddFlagEnumeration.HIDDEN);
    ruleOperationProperty35.setCode("mypr_bq");
    org.monet.metamodel.ContainerDefinition.RuleOperationProperty.ToProperty toProperty37 = new org.monet.metamodel.ContainerDefinition.RuleOperationProperty.ToProperty();
    toProperty37.getOperation().add(new org.monet.metamodel.internal.Ref("Formalizar","solicitud.Application","solicitud.Application.Formalizar"));
    ruleOperationProperty35.setTo(toProperty37);
    this.getRuleOperationList().add(ruleOperationProperty35);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty40 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty40.setLabel("Familiares");
    viewProperty40.setCode("mz4gh_q");
    viewProperty40.setName("RelativesView");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty41 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty41.getComponent().add(new org.monet.metamodel.internal.Ref("RelativesView","solicitud.Relatives","solicitud.Relatives.RelativesView"));
    viewProperty40.setShow(showProperty41);
    this.addView(viewProperty40);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.application.$Definition$.class,"solicitud.Application",null);
  }
  }
  
  public static String static_getName() {
    return "Application";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.Application.class;
  }
  
  public String getClientBehaviour() {
    return "var md_rleg = new Object();md_rleg.refresh = function (node) {if (!node.isEditable()) return;};md_rleg.onChangeField = function (node, field) {};";
  }
}
