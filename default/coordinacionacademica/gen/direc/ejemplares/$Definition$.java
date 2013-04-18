package direc.ejemplares;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mzk7skg";
    this._name = "direc.Ejemplares";
    this._isAbstract = null;this._label = "Ejemplares";
    this.setIsSingleton(true);
    this._index = new org.monet.metamodel.internal.Ref("direc.Ejemplares.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("direc.Ejemplares.Ejemplar"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty5 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty5.setLabel("Todos");
    setViewProperty5.setCode("mkg42zq");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty6.setSortBy(new org.monet.metamodel.internal.Ref("Libro","direc.Ejemplares.Indice","direc.Ejemplares.Indice.Libro"));
    indexProperty6.setWithView(new org.monet.metamodel.internal.Ref("Normal","direc.Ejemplares.Indice","direc.Ejemplares.Indice.Normal"));
    showProperty6.setIndex(indexProperty6);
    setViewProperty5.setShow(showProperty6);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Libro","direc.Ejemplares.Indice","direc.Ejemplares.Indice.Libro"));
    analyzeProperty10.setDimension(dimensionProperty10);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty12 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty12.getAttribute().add(new org.monet.metamodel.internal.Ref("Libro","direc.Ejemplares.Indice","direc.Ejemplares.Indice.Libro"));
    analyzeProperty10.setSorting(sortingProperty12);
    setViewProperty5.setAnalyze(analyzeProperty10);
    this.addView(setViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.ejemplares.$Definition$.class,"direc.Ejemplares",null);
  }
  }
  
  public static String static_getName() {
    return "Ejemplares";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.Ejemplares.class;
  }
  
  public String getClientBehaviour() {
    return "var mzk7skg = new Object();mzk7skg.refresh = function (node) {if (!node.isEditable()) return;};mzk7skg.onChangeField = function (node, field) {};";
  }
}
