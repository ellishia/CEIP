package doc.subjectlevels;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m1ngrcq";
    this._name = "doc.SubjectLevels";
    this._isAbstract = null;this._label = "Asignaturas de Curso";
    this.setIsSingleton(true);
    this._index = new org.monet.metamodel.internal.Ref("doc.SubjectLevels.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("doc.SubjectLevels.SubjectLevel"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty6.setLabel("Todos");
    setViewProperty6.setCode("safa");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("Asignatura","doc.SubjectLevels.Indice","doc.SubjectLevels.Indice.Asignatura"));
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("Normal","doc.SubjectLevels.Indice","doc.SubjectLevels.Indice.Normal"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty6.setShow(showProperty7);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Asignatura","doc.SubjectLevels.Indice","doc.SubjectLevels.Indice.Asignatura"));
    analyzeProperty11.setDimension(dimensionProperty11);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty13 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("Asignatura","doc.SubjectLevels.Indice","doc.SubjectLevels.Indice.Asignatura"));
    analyzeProperty11.setSorting(sortingProperty13);
    setViewProperty6.setAnalyze(analyzeProperty11);
    this.addView(setViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.subjectlevels.$Definition$.class,"doc.SubjectLevels",null);
  }
  }
  
  public static String static_getName() {
    return "SubjectLevels";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.SubjectLevels.class;
  }
  
  public String getClientBehaviour() {
    return "var m1ngrcq = new Object();m1ngrcq.refresh = function (node) {if (!node.isEditable()) return;};m1ngrcq.onChangeField = function (node, field) {};";
  }
}
