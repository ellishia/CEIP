package serv.buslines;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mpnt0eg";
    this._name = "serv.Buslines";
    this._isAbstract = null;this._label = "Rutas";
    this._index = new org.monet.metamodel.internal.Ref("serv.Buslines.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty2 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("serv.Buslines.Busline"));
    this.setAdd(addProperty2);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty6.setLabel("Todos");
    setViewProperty6.setCode("mrcegxw");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("Name","serv.Buslines.Indice","serv.Buslines.Indice.Name"));
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("Normal","serv.Buslines.Indice","serv.Buslines.Indice.Normal"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty6.setShow(showProperty7);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Name","serv.Buslines.Indice","serv.Buslines.Indice.Name"));
    analyzeProperty11.setDimension(dimensionProperty11);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty13 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("Name","serv.Buslines.Indice","serv.Buslines.Indice.Name"));
    analyzeProperty11.setSorting(sortingProperty13);
    setViewProperty6.setAnalyze(analyzeProperty11);
    this.addView(setViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.buslines.$Definition$.class,"serv.Buslines",null);
  }
  }
  
  public static String static_getName() {
    return "Buslines";
  }
  
  public Class<?> getBehaviourClass() {
    return serv.Buslines.class;
  }
  
  public String getClientBehaviour() {
    return "var mpnt0eg = new Object();mpnt0eg.refresh = function (node) {if (!node.isEditable()) return;};mpnt0eg.onChangeField = function (node, field) {};";
  }
}
