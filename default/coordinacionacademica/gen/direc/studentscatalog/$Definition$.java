package direc.studentscatalog;

import org.monet.metamodel.CatalogDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CatalogDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m7yc7wq";
    this._name = "direc.StudentsCatalog";
    this._isAbstract = null;this._label = "StudentsCatalog";
    this._index = new org.monet.metamodel.internal.Ref("direc.Students.Index");
    org.monet.metamodel.CatalogDefinition.SetViewProperty setViewProperty2 = new org.monet.metamodel.CatalogDefinition.SetViewProperty();
    setViewProperty2.setLabel("StudentsCatalog");
    setViewProperty2.setCode("my8hvjq");
    org.monet.metamodel.CatalogDefinition.SetViewProperty.AnalyzeProperty analyzeProperty3 = new org.monet.metamodel.CatalogDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CatalogDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty3 = new org.monet.metamodel.CatalogDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty3.getAttribute().add(new org.monet.metamodel.internal.Ref("Name","direc.Students.Index","direc.Students.Index.Name"));
    analyzeProperty3.setDimension(dimensionProperty3);
    org.monet.metamodel.CatalogDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty5 = new org.monet.metamodel.CatalogDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty5.getAttribute().add(new org.monet.metamodel.internal.Ref("Name","direc.Students.Index","direc.Students.Index.Name"));
    analyzeProperty3.setSorting(sortingProperty5);
    setViewProperty2.setAnalyze(analyzeProperty3);
    org.monet.metamodel.CatalogDefinition.SetViewProperty.ShowProperty showProperty8 = new org.monet.metamodel.CatalogDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CatalogDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty8 = new org.monet.metamodel.CatalogDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty8.setWithView(new org.monet.metamodel.internal.Ref("Item","direc.Students.Index","direc.Students.Index.Item"));
    indexProperty8.setSortBy(new org.monet.metamodel.internal.Ref("Name","direc.Students.Index","direc.Students.Index.Name"));
    showProperty8.setIndex(indexProperty8);
    setViewProperty2.setShow(showProperty8);
    org.monet.metamodel.CatalogDefinition.SetViewProperty.FilterProperty filterProperty12 = new org.monet.metamodel.CatalogDefinition.SetViewProperty.FilterProperty();
    filterProperty12.setAttribute(new org.monet.metamodel.internal.Ref("Level","direc.Students.Index","direc.Students.Index.Level"));
    filterProperty12.setValue("parameter(level)");
    setViewProperty2.getFilterList().add(filterProperty12);
    this.addView(setViewProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.studentscatalog.$Definition$.class,"direc.StudentsCatalog",null);
  }
  }
  
  public static String static_getName() {
    return "StudentsCatalog";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.StudentsCatalog.class;
  }
  
  public String getClientBehaviour() {
    return "var m7yc7wq = new Object();m7yc7wq.refresh = function (node) {if (!node.isEditable()) return;};m7yc7wq.onChangeField = function (node, field) {};";
  }
}
