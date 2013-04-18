package serv.stops;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mkbvrmw";
    this._name = "serv.Stops";
    this._isAbstract = null;this._label = "Paradas";
    this._index = new org.monet.metamodel.internal.Ref("serv.Stops.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty2 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("serv.Stops.Stop"));
    this.setAdd(addProperty2);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty6.setLabel("Todos");
    setViewProperty6.setCode("m5y7afg");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("Name","serv.Stops.Indice","serv.Stops.Indice.Name"));
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("Normal","serv.Stops.Indice","serv.Stops.Indice.Normal"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty6.setShow(showProperty7);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Name","serv.Stops.Indice","serv.Stops.Indice.Name"));
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Identifier","serv.Stops.Indice","serv.Stops.Indice.Identifier"));
    analyzeProperty11.setDimension(dimensionProperty11);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty14 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty14.getAttribute().add(new org.monet.metamodel.internal.Ref("Name","serv.Stops.Indice","serv.Stops.Indice.Name"));
    analyzeProperty11.setSorting(sortingProperty14);
    setViewProperty6.setAnalyze(analyzeProperty11);
    this.addView(setViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.stops.$Definition$.class,"serv.Stops",null);
  }
  }
  
  public static String static_getName() {
    return "Stops";
  }
  
  public Class<?> getBehaviourClass() {
    return serv.Stops.class;
  }
  
  public String getClientBehaviour() {
    return "var mkbvrmw = new Object();mkbvrmw.refresh = function (node) {if (!node.isEditable()) return;};mkbvrmw.onChangeField = function (node, field) {};";
  }
}
