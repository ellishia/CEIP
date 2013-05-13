package direc.teachers;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mjmrgqg";
    this._name = "direc.Teachers";
    this._isAbstract = null;this._label = "Docentes";
    this.setIsSingleton(true);
    this._index = new org.monet.metamodel.internal.Ref("direc.Teachers.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("direc.Teachers.Teacher"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty6.setLabel("Todos");
    setViewProperty6.setCode("aasfdsa");
    setViewProperty6.setName("View");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("Surname","direc.Teachers.Indice","direc.Teachers.Indice.Surname"));
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("Normal","direc.Teachers.Indice","direc.Teachers.Indice.Normal"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty6.setShow(showProperty7);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Surname","direc.Teachers.Indice","direc.Teachers.Indice.Surname"));
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Identifier","direc.Teachers.Indice","direc.Teachers.Indice.Identifier"));
    analyzeProperty11.setDimension(dimensionProperty11);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty14 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty14.getAttribute().add(new org.monet.metamodel.internal.Ref("Surname","direc.Teachers.Indice","direc.Teachers.Indice.Surname"));
    sortingProperty14.getAttribute().add(new org.monet.metamodel.internal.Ref("Identifier","direc.Teachers.Indice","direc.Teachers.Indice.Identifier"));
    analyzeProperty11.setSorting(sortingProperty14);
    setViewProperty6.setAnalyze(analyzeProperty11);
    this.addView(setViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.teachers.$Definition$.class,"direc.Teachers",null);
  }
  }
  
  public static String static_getName() {
    return "Teachers";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.Teachers.class;
  }
  
  public String getClientBehaviour() {
    return "var mjmrgqg = new Object();mjmrgqg.refresh = function (node) {if (!node.isEditable()) return;};mjmrgqg.onChangeField = function (node, field) {};";
  }
}
