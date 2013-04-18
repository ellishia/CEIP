package direc.evaluationsesions;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mp4ki8q";
    this._name = "direc.EvaluationSesions";
    this._isAbstract = null;this._label = "Sesiones de Evaluación";
    this._index = new org.monet.metamodel.internal.Ref("direc.EvaluationSesions.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty2 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("direc.EvaluationSesions.EvaluationSesion"));
    this.setAdd(addProperty2);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty5 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty5.setLabel("Todos");
    setViewProperty5.setCode("mue3juw");
    setViewProperty5.setName("View");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty6.setSortBy(new org.monet.metamodel.internal.Ref("Title","direc.EvaluationSesions.Indice","direc.EvaluationSesions.Indice.Title"));
    indexProperty6.setWithView(new org.monet.metamodel.internal.Ref("Normal","direc.EvaluationSesions.Indice","direc.EvaluationSesions.Indice.Normal"));
    showProperty6.setIndex(indexProperty6);
    setViewProperty5.setShow(showProperty6);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Title","direc.EvaluationSesions.Indice","direc.EvaluationSesions.Indice.Title"));
    analyzeProperty10.setDimension(dimensionProperty10);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty12 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty12.getAttribute().add(new org.monet.metamodel.internal.Ref("Title","direc.EvaluationSesions.Indice","direc.EvaluationSesions.Indice.Title"));
    analyzeProperty10.setSorting(sortingProperty12);
    setViewProperty5.setAnalyze(analyzeProperty10);
    this.addView(setViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.evaluationsesions.$Definition$.class,"direc.EvaluationSesions",null);
  }
  }
  
  public static String static_getName() {
    return "EvaluationSesions";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.EvaluationSesions.class;
  }
  
  public String getClientBehaviour() {
    return "var mp4ki8q = new Object();mp4ki8q.refresh = function (node) {if (!node.isEditable()) return;};mp4ki8q.onChangeField = function (node, field) {};";
  }
}
