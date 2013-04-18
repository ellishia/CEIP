package direc.claustros;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mnsmu6a";
    this._name = "direc.Claustros";
    this._isAbstract = null;this._label = "Claustros de profesores";
    this._index = new org.monet.metamodel.internal.Ref("direc.Claustros.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty2 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("direc.Claustros.Claustro"));
    this.setAdd(addProperty2);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty5 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty5.setLabel("Todos");
    setViewProperty5.setCode("myar8gg");
    setViewProperty5.setName("View");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty6.setSortBy(new org.monet.metamodel.internal.Ref("Title","direc.Claustros.Indice","direc.Claustros.Indice.Title"));
    indexProperty6.setWithView(new org.monet.metamodel.internal.Ref("Normal","direc.Claustros.Indice","direc.Claustros.Indice.Normal"));
    showProperty6.setIndex(indexProperty6);
    setViewProperty5.setShow(showProperty6);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Title","direc.Claustros.Indice","direc.Claustros.Indice.Title"));
    analyzeProperty10.setDimension(dimensionProperty10);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty12 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty12.getAttribute().add(new org.monet.metamodel.internal.Ref("Title","direc.Claustros.Indice","direc.Claustros.Indice.Title"));
    analyzeProperty10.setSorting(sortingProperty12);
    setViewProperty5.setAnalyze(analyzeProperty10);
    this.addView(setViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.claustros.$Definition$.class,"direc.Claustros",null);
  }
  }
  
  public static String static_getName() {
    return "Claustros";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.Claustros.class;
  }
  
  public String getClientBehaviour() {
    return "var mnsmu6a = new Object();mnsmu6a.refresh = function (node) {if (!node.isEditable()) return;};mnsmu6a.onChangeField = function (node, field) {};";
  }
}
