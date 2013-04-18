package grades.examresults;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m4ewvpq";
    this._name = "grades.ExamResults";
    this._isAbstract = null;this._label = "Resultados de Exámenes";
    this._index = new org.monet.metamodel.internal.Ref("grades.ExamResults.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty2 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("grades.ExamResults.ExamResult"));
    this.setAdd(addProperty2);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty5 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty5.setLabel("Todos");
    setViewProperty5.setCode("mi5clga");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty6.setSortBy(new org.monet.metamodel.internal.Ref("Date","grades.ExamResults.Indice","grades.ExamResults.Indice.Date"));
    indexProperty6.setWithView(new org.monet.metamodel.internal.Ref("Normal","grades.ExamResults.Indice","grades.ExamResults.Indice.Normal"));
    showProperty6.setIndex(indexProperty6);
    setViewProperty5.setShow(showProperty6);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Date","grades.ExamResults.Indice","grades.ExamResults.Indice.Date"));
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Group","grades.ExamResults.Indice","grades.ExamResults.Indice.Group"));
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Subject","grades.ExamResults.Indice","grades.ExamResults.Indice.Subject"));
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Teacher","grades.ExamResults.Indice","grades.ExamResults.Indice.Teacher"));
    analyzeProperty10.setDimension(dimensionProperty10);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty15 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty15.getAttribute().add(new org.monet.metamodel.internal.Ref("Date","grades.ExamResults.Indice","grades.ExamResults.Indice.Date"));
    analyzeProperty10.setSorting(sortingProperty15);
    setViewProperty5.setAnalyze(analyzeProperty10);
    this.addView(setViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.examresults.$Definition$.class,"grades.ExamResults",null);
  }
  }
  
  public static String static_getName() {
    return "ExamResults";
  }
  
  public Class<?> getBehaviourClass() {
    return grades.ExamResults.class;
  }
  
  public String getClientBehaviour() {
    return "var m4ewvpq = new Object();m4ewvpq.refresh = function (node) {if (!node.isEditable()) return;};m4ewvpq.onChangeField = function (node, field) {};";
  }
}
