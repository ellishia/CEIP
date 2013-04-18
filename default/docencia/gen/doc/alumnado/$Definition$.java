package doc.alumnado;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mezq0ha";
    this._name = "doc.Alumnado";
    this._isAbstract = null;this._label = "Alumnado";
    this._index = new org.monet.metamodel.internal.Ref("doc.Alumnado.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty2 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("doc.Alumnado.Student"));
    this.setAdd(addProperty2);
    this.setIsSingleton(true);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty7.setLabel("Todos");
    setViewProperty7.setCode("asda");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty8 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty8 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty8.setSortBy(new org.monet.metamodel.internal.Ref("Surname","doc.Alumnado.Indice","doc.Alumnado.Indice.Surname"));
    indexProperty8.setWithView(new org.monet.metamodel.internal.Ref("Normal","doc.Alumnado.Indice","doc.Alumnado.Indice.Normal"));
    showProperty8.setIndex(indexProperty8);
    setViewProperty7.setShow(showProperty8);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty12 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty12 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty12.getAttribute().add(new org.monet.metamodel.internal.Ref("Name","doc.Alumnado.Indice","doc.Alumnado.Indice.Name"));
    analyzeProperty12.setDimension(dimensionProperty12);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty14 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty14.getAttribute().add(new org.monet.metamodel.internal.Ref("Name","doc.Alumnado.Indice","doc.Alumnado.Indice.Name"));
    analyzeProperty12.setSorting(sortingProperty14);
    setViewProperty7.setAnalyze(analyzeProperty12);
    this.addView(setViewProperty7);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.alumnado.$Definition$.class,"doc.Alumnado",null);
  }
  }
  
  public static String static_getName() {
    return "Alumnado";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.Alumnado.class;
  }
  
  public String getClientBehaviour() {
    return "var mezq0ha = new Object();mezq0ha.refresh = function (node) {if (!node.isEditable()) return;};mezq0ha.onChangeField = function (node, field) {};";
  }
}
