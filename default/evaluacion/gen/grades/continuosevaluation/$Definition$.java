package grades.continuosevaluation;

import org.monet.metamodel.CatalogDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CatalogDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mtmtz3w";
    this._name = "grades.ContinuosEvaluation";
    this._isAbstract = null;this._label = "Evaluación Continua";
    this._index = new org.monet.metamodel.internal.Ref("grades.ContinuosEvaluation.Index");
    org.monet.metamodel.CatalogDefinition.SetViewProperty setViewProperty3 = new org.monet.metamodel.CatalogDefinition.SetViewProperty();
    setViewProperty3.setLabel("Todos");
    setViewProperty3.setCode("fasf");
    org.monet.metamodel.CatalogDefinition.SetViewProperty.ShowProperty showProperty4 = new org.monet.metamodel.CatalogDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CatalogDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty4 = new org.monet.metamodel.CatalogDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty4.setSortBy(new org.monet.metamodel.internal.Ref("Subject","grades.ContinuosEvaluation.Index","grades.ContinuosEvaluation.Index.Subject"));
    indexProperty4.setWithView(new org.monet.metamodel.internal.Ref("Normal","grades.ContinuosEvaluation.Index","grades.ContinuosEvaluation.Index.Normal"));
    showProperty4.setIndex(indexProperty4);
    setViewProperty3.setShow(showProperty4);
    org.monet.metamodel.CatalogDefinition.SetViewProperty.AnalyzeProperty analyzeProperty8 = new org.monet.metamodel.CatalogDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CatalogDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty8 = new org.monet.metamodel.CatalogDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty8.getAttribute().add(new org.monet.metamodel.internal.Ref("Subject","grades.ContinuosEvaluation.Index","grades.ContinuosEvaluation.Index.Subject"));
    analyzeProperty8.setDimension(dimensionProperty8);
    org.monet.metamodel.CatalogDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty10 = new org.monet.metamodel.CatalogDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Subject","grades.ContinuosEvaluation.Index","grades.ContinuosEvaluation.Index.Subject"));
    analyzeProperty8.setSorting(sortingProperty10);
    setViewProperty3.setAnalyze(analyzeProperty8);
    this.addView(setViewProperty3);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.continuosevaluation.$Definition$.class,"grades.ContinuosEvaluation",null);
  }
  }
  
  public static String static_getName() {
    return "ContinuosEvaluation";
  }
  
  public Class<?> getBehaviourClass() {
    return grades.ContinuosEvaluation.class;
  }
  
  public String getClientBehaviour() {
    return "var mtmtz3w = new Object();mtmtz3w.refresh = function (node) {if (!node.isEditable()) return;};mtmtz3w.onChangeField = function (node, field) {};";
  }
}
