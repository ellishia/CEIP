package serv.specialmenus;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "majfevw";
    this._name = "serv.SpecialMenus";
    this._isAbstract = null;this._label = "Registro Diario";
    this._index = new org.monet.metamodel.internal.Ref("serv.SpecialMenus.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty2 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("serv.SpecialMenus.SpecialMenu"));
    this.setAdd(addProperty2);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty6.setLabel("Todos");
    setViewProperty6.setCode("mrcnlva");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("Suitable","serv.SpecialMenus.Indice","serv.SpecialMenus.Indice.Suitable"));
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("Normal","serv.SpecialMenus.Indice","serv.SpecialMenus.Indice.Normal"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty6.setShow(showProperty7);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Suitable","serv.SpecialMenus.Indice","serv.SpecialMenus.Indice.Suitable"));
    analyzeProperty11.setDimension(dimensionProperty11);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty13 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("Suitable","serv.SpecialMenus.Indice","serv.SpecialMenus.Indice.Suitable"));
    analyzeProperty11.setSorting(sortingProperty13);
    setViewProperty6.setAnalyze(analyzeProperty11);
    this.addView(setViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.specialmenus.$Definition$.class,"serv.SpecialMenus",null);
  }
  }
  
  public static String static_getName() {
    return "SpecialMenus";
  }
  
  public Class<?> getBehaviourClass() {
    return serv.SpecialMenus.class;
  }
  
  public String getClientBehaviour() {
    return "var majfevw = new Object();majfevw.refresh = function (node) {if (!node.isEditable()) return;};majfevw.onChangeField = function (node, field) {};";
  }
}
