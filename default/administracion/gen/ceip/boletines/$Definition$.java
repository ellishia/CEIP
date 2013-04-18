package ceip.boletines;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "msskukg";
    this._name = "ceip.Boletines";
    this._isAbstract = null;this._label = "Boletines";
    this.setIsSingleton(true);
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty2 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("ceip.Boletin"));
    this.setAdd(addProperty2);
    this._index = new org.monet.metamodel.internal.Ref("ceip.Boletines.Index");
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty5 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty5.setLabel("Boletines");
    setViewProperty5.setCode("mv6f4nw");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty6.setSortBy(new org.monet.metamodel.internal.Ref("Name","ceip.Boletines.Index","ceip.Boletines.Index.Name"));
    indexProperty6.setWithView(new org.monet.metamodel.internal.Ref("Normal","ceip.Boletines.Index","ceip.Boletines.Index.Normal"));
    showProperty6.setIndex(indexProperty6);
    setViewProperty5.setShow(showProperty6);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Name","ceip.Boletines.Index","ceip.Boletines.Index.Name"));
    analyzeProperty10.setDimension(dimensionProperty10);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty12 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty12.getAttribute().add(new org.monet.metamodel.internal.Ref("Name","ceip.Boletines.Index","ceip.Boletines.Index.Name"));
    analyzeProperty10.setSorting(sortingProperty12);
    setViewProperty5.setAnalyze(analyzeProperty10);
    this.addView(setViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.boletines.$Definition$.class,"ceip.Boletines",null);
  }
  }
  
  public static String static_getName() {
    return "Boletines";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.Boletines.class;
  }
  
  public String getClientBehaviour() {
    return "var msskukg = new Object();msskukg.refresh = function (node) {if (!node.isEditable()) return;};msskukg.onChangeField = function (node, field) {};";
  }
}
