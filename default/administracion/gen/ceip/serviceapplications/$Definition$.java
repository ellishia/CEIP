package ceip.serviceapplications;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mg7bi6g";
    this._name = "ceip.ServiceApplications";
    this._isAbstract = null;this._label = "Solicitud de Servicios";
    this._index = new org.monet.metamodel.internal.Ref("ceip.ServiceApplications.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty2 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("ceip.ServiceApplications.ServiceApplication"));
    this.setAdd(addProperty2);
    this.setIsSingleton(true);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty6.setLabel("Solicitudes");
    setViewProperty6.setCode("mhn1mbq");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("Date","ceip.ServiceApplications.Indice","ceip.ServiceApplications.Indice.Date"));
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("Normal","ceip.ServiceApplications.Indice","ceip.ServiceApplications.Indice.Normal"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty6.setShow(showProperty7);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Date","ceip.ServiceApplications.Indice","ceip.ServiceApplications.Indice.Date"));
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("StudentSurname","ceip.ServiceApplications.Indice","ceip.ServiceApplications.Indice.StudentSurname"));
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Cial","ceip.ServiceApplications.Indice","ceip.ServiceApplications.Indice.Cial"));
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Identifier","ceip.ServiceApplications.Indice","ceip.ServiceApplications.Indice.Identifier"));
    analyzeProperty11.setDimension(dimensionProperty11);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty16 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty16.getAttribute().add(new org.monet.metamodel.internal.Ref("Date","ceip.ServiceApplications.Indice","ceip.ServiceApplications.Indice.Date"));
    sortingProperty16.getAttribute().add(new org.monet.metamodel.internal.Ref("StudentSurname","ceip.ServiceApplications.Indice","ceip.ServiceApplications.Indice.StudentSurname"));
    sortingProperty16.getAttribute().add(new org.monet.metamodel.internal.Ref("Cial","ceip.ServiceApplications.Indice","ceip.ServiceApplications.Indice.Cial"));
    sortingProperty16.getAttribute().add(new org.monet.metamodel.internal.Ref("Identifier","ceip.ServiceApplications.Indice","ceip.ServiceApplications.Indice.Identifier"));
    analyzeProperty11.setSorting(sortingProperty16);
    setViewProperty6.setAnalyze(analyzeProperty11);
    this.addView(setViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.serviceapplications.$Definition$.class,"ceip.ServiceApplications",null);
  }
  }
  
  public static String static_getName() {
    return "ServiceApplications";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.ServiceApplications.class;
  }
  
  public String getClientBehaviour() {
    return "var mg7bi6g = new Object();mg7bi6g.refresh = function (node) {if (!node.isEditable()) return;};mg7bi6g.onChangeField = function (node, field) {};";
  }
}
