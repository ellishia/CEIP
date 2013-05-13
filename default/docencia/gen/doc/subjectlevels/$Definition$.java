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
    org.monet.metamodel.CollectionDefinition.OperationProperty operationProperty5 = new org.monet.metamodel.CollectionDefinition.OperationProperty();
    operationProperty5.setLabel("Añadir Asignaturas");
    operationProperty5.setCode("mc5fyfg");
    operationProperty5.setName("AddSubjects");
    this.addOperation(operationProperty5);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty9 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty9.setLabel("Todos");
    setViewProperty9.setCode("safa");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty10.setSortBy(new org.monet.metamodel.internal.Ref("Asignatura","doc.SubjectLevels.Indice","doc.SubjectLevels.Indice.Asignatura"));
    indexProperty10.setWithView(new org.monet.metamodel.internal.Ref("Normal","doc.SubjectLevels.Indice","doc.SubjectLevels.Indice.Normal"));
    showProperty10.setIndex(indexProperty10);
    setViewProperty9.setShow(showProperty10);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty14 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty14 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty14.getAttribute().add(new org.monet.metamodel.internal.Ref("Asignatura","doc.SubjectLevels.Indice","doc.SubjectLevels.Indice.Asignatura"));
    analyzeProperty14.setDimension(dimensionProperty14);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty16 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty16.getAttribute().add(new org.monet.metamodel.internal.Ref("Asignatura","doc.SubjectLevels.Indice","doc.SubjectLevels.Indice.Asignatura"));
    analyzeProperty14.setSorting(sortingProperty16);
    setViewProperty9.setAnalyze(analyzeProperty14);
    this.addView(setViewProperty9);
    
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
