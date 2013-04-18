package solicitud.applications;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mgioqeq";
    this._name = "solicitud.Applications";
    this._isAbstract = null;this._label = "Solicitudes";
    this.setIsSingleton(true);
    this.setIsReadonly(true);
    this._index = new org.monet.metamodel.internal.Ref("solicitud.Applications.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty4 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty4.getNode().add(new org.monet.metamodel.internal.Ref("solicitud.Application"));
    this.setAdd(addProperty4);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty6.setLabel("Todos");
    setViewProperty6.setCode("mtoc7dg");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("Identifier","solicitud.Applications.Indice","solicitud.Applications.Indice.Identifier"));
    indexProperty7.setSortMode(org.monet.metamodel.SetDefinitionBase.SetViewPropertyBase.ShowProperty.IndexProperty.SortModeEnumeration.ASC);
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("Normal","solicitud.Applications.Indice","solicitud.Applications.Indice.Normal"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty6.setShow(showProperty7);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty12 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty12 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty12.getAttribute().add(new org.monet.metamodel.internal.Ref("Identifier","solicitud.Applications.Indice","solicitud.Applications.Indice.Identifier"));
    dimensionProperty12.getAttribute().add(new org.monet.metamodel.internal.Ref("Cial","solicitud.Applications.Indice","solicitud.Applications.Indice.Cial"));
    analyzeProperty12.setDimension(dimensionProperty12);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty15 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty15.getAttribute().add(new org.monet.metamodel.internal.Ref("Identifier","solicitud.Applications.Indice","solicitud.Applications.Indice.Identifier"));
    sortingProperty15.getAttribute().add(new org.monet.metamodel.internal.Ref("Cial","solicitud.Applications.Indice","solicitud.Applications.Indice.Cial"));
    analyzeProperty12.setSorting(sortingProperty15);
    setViewProperty6.setAnalyze(analyzeProperty12);
    this.addView(setViewProperty6);
    org.monet.metamodel.CollectionDefinition.OperationProperty operationProperty20 = new org.monet.metamodel.CollectionDefinition.OperationProperty();
    operationProperty20.setLabel("Añadir Solicitud");
    operationProperty20.setCode("m0s48tg");
    operationProperty20.setName("AnadirSolicitud");
    this.addOperation(operationProperty20);
    org.monet.metamodel.CollectionDefinition.RuleOperationProperty ruleOperationProperty23 = new org.monet.metamodel.CollectionDefinition.RuleOperationProperty();
    ruleOperationProperty23.getAddFlag().add(org.monet.metamodel.NodeDefinitionBase.RuleOperationProperty.AddFlagEnumeration.HIDDEN);
    ruleOperationProperty23.setCode("msl_2ia");
    org.monet.metamodel.CollectionDefinition.RuleOperationProperty.ToProperty toProperty25 = new org.monet.metamodel.CollectionDefinition.RuleOperationProperty.ToProperty();
    toProperty25.getOperation().add(new org.monet.metamodel.internal.Ref("AnadirSolicitud","solicitud.Applications","solicitud.Applications.AnadirSolicitud"));
    ruleOperationProperty23.setTo(toProperty25);
    this.getRuleOperationList().add(ruleOperationProperty23);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.applications.$Definition$.class,"solicitud.Applications",null);
  }
  }
  
  public static String static_getName() {
    return "Applications";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.Applications.class;
  }
  
  public String getClientBehaviour() {
    return "var mgioqeq = new Object();mgioqeq.refresh = function (node) {if (!node.isEditable()) return;};mgioqeq.onChangeField = function (node, field) {};";
  }
}
