package grades.trimestralevaluations;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m9lbsog";
    this._name = "grades.TrimestralEvaluations";
    this._isAbstract = null;this._label = "Evaluaciones Trimestrales";
    this._index = new org.monet.metamodel.internal.Ref("grades.TrimestralEvaluations.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty2 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("grades.TrimestralEvaluations.TrimestralEvaluation"));
    this.setAdd(addProperty2);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty5 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty5.setLabel("Todos");
    setViewProperty5.setCode("mp6envq");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty6.setSortBy(new org.monet.metamodel.internal.Ref("AcademicYear","grades.TrimestralEvaluations.Indice","grades.TrimestralEvaluations.Indice.AcademicYear"));
    indexProperty6.setWithView(new org.monet.metamodel.internal.Ref("Normal","grades.TrimestralEvaluations.Indice","grades.TrimestralEvaluations.Indice.Normal"));
    showProperty6.setIndex(indexProperty6);
    setViewProperty5.setShow(showProperty6);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Group","grades.TrimestralEvaluations.Indice","grades.TrimestralEvaluations.Indice.Group"));
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Teacher","grades.TrimestralEvaluations.Indice","grades.TrimestralEvaluations.Indice.Teacher"));
    analyzeProperty10.setDimension(dimensionProperty10);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty13 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("AcademicYear","grades.TrimestralEvaluations.Indice","grades.TrimestralEvaluations.Indice.AcademicYear"));
    analyzeProperty10.setSorting(sortingProperty13);
    setViewProperty5.setAnalyze(analyzeProperty10);
    this.addView(setViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.trimestralevaluations.$Definition$.class,"grades.TrimestralEvaluations",null);
  }
  }
  
  public static String static_getName() {
    return "TrimestralEvaluations";
  }
  
  public Class<?> getBehaviourClass() {
    return grades.TrimestralEvaluations.class;
  }
  
  public String getClientBehaviour() {
    return "var m9lbsog = new Object();m9lbsog.refresh = function (node) {if (!node.isEditable()) return;};m9lbsog.onChangeField = function (node, field) {};";
  }
}
