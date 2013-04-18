package doc.incidents;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mjn7npq";
    this._name = "doc.Incidents";
    this._isAbstract = null;this._label = "Incidencias";
    this.setIsSingleton(true);
    this._index = new org.monet.metamodel.internal.Ref("doc.Incidents.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("doc.Incidents.Incident"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty6.setLabel("Todos");
    setViewProperty6.setCode("mstcbrq");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("Student","doc.Incidents.Indice","doc.Incidents.Indice.Student"));
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("Normal","doc.Incidents.Indice","doc.Incidents.Indice.Normal"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty6.setShow(showProperty7);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Student","doc.Incidents.Indice","doc.Incidents.Indice.Student"));
    analyzeProperty11.setDimension(dimensionProperty11);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty13 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("Student","doc.Incidents.Indice","doc.Incidents.Indice.Student"));
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("Date","doc.Incidents.Indice","doc.Incidents.Indice.Date"));
    analyzeProperty11.setSorting(sortingProperty13);
    setViewProperty6.setAnalyze(analyzeProperty11);
    this.addView(setViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.incidents.$Definition$.class,"doc.Incidents",null);
  }
  }
  
  public static String static_getName() {
    return "Incidents";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.Incidents.class;
  }
  
  public String getClientBehaviour() {
    return "var mjn7npq = new Object();mjn7npq.refresh = function (node) {if (!node.isEditable()) return;};mjn7npq.onChangeField = function (node, field) {};";
  }
}
