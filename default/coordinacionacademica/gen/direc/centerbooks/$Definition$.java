package direc.centerbooks;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mrycfjw";
    this._name = "direc.CenterBooks";
    this._isAbstract = null;this._label = "Referencias Bibliográficas";
    this.setIsSingleton(true);
    this._index = new org.monet.metamodel.internal.Ref("direc.CenterBooks.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("direc.CenterBook"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty6.setLabel("Todos");
    setViewProperty6.setCode("mso22_g");
    setViewProperty6.setName("View");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("Title","direc.CenterBooks.Indice","direc.CenterBooks.Indice.Title"));
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("Normal","direc.CenterBooks.Indice","direc.CenterBooks.Indice.Normal"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty6.setShow(showProperty7);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Title","direc.CenterBooks.Indice","direc.CenterBooks.Indice.Title"));
    analyzeProperty11.setDimension(dimensionProperty11);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty13 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("Title","direc.CenterBooks.Indice","direc.CenterBooks.Indice.Title"));
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("Level","direc.CenterBooks.Indice","direc.CenterBooks.Indice.Level"));
    analyzeProperty11.setSorting(sortingProperty13);
    setViewProperty6.setAnalyze(analyzeProperty11);
    this.addView(setViewProperty6);
    org.monet.metamodel.CollectionDefinition.OperationProperty operationProperty18 = new org.monet.metamodel.CollectionDefinition.OperationProperty();
    operationProperty18.setLabel("Añadir Ejemplares");
    operationProperty18.setCode("m8cc6yq");
    operationProperty18.setName("ExemplairAddition");
    this.addOperation(operationProperty18);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.centerbooks.$Definition$.class,"direc.CenterBooks",null);
  }
  }
  
  public static String static_getName() {
    return "CenterBooks";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.CenterBooks.class;
  }
  
  public String getClientBehaviour() {
    return "var mrycfjw = new Object();mrycfjw.refresh = function (node) {if (!node.isEditable()) return;};mrycfjw.onChangeField = function (node, field) {};";
  }
}
