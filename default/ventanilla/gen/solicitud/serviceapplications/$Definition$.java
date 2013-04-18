package solicitud.serviceapplications;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mg7bi6g";
    this._name = "solicitud.ServiceApplications";
    this._isAbstract = null;this._label = "Solicitud de Servicios";
    this.setIsSingleton(true);
    this._index = new org.monet.metamodel.internal.Ref("solicitud.ServiceApplications.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("solicitud.ServiceApplications.ServiceApplication"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty6.setLabel("Solicitudes");
    setViewProperty6.setCode("mhn1mbq");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("Date","solicitud.ServiceApplications.Indice","solicitud.ServiceApplications.Indice.Date"));
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("Normal","solicitud.ServiceApplications.Indice","solicitud.ServiceApplications.Indice.Normal"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty6.setShow(showProperty7);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Date","solicitud.ServiceApplications.Indice","solicitud.ServiceApplications.Indice.Date"));
    analyzeProperty11.setDimension(dimensionProperty11);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty13 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("Date","solicitud.ServiceApplications.Indice","solicitud.ServiceApplications.Indice.Date"));
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("StudentSurname","solicitud.ServiceApplications.Indice","solicitud.ServiceApplications.Indice.StudentSurname"));
    analyzeProperty11.setSorting(sortingProperty13);
    setViewProperty6.setAnalyze(analyzeProperty11);
    this.addView(setViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.serviceapplications.$Definition$.class,"solicitud.ServiceApplications",null);
  }
  }
  
  public static String static_getName() {
    return "ServiceApplications";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.ServiceApplications.class;
  }
  
  public String getClientBehaviour() {
    return "var mg7bi6g = new Object();mg7bi6g.refresh = function (node) {if (!node.isEditable()) return;};mg7bi6g.onChangeField = function (node, field) {};";
  }
}
