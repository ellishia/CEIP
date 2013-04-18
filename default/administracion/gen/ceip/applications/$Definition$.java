package ceip.applications;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mzjznhq";
    this._name = "ceip.Applications";
    this._isAbstract = null;this._label = "Solicitudes";
    this.setIsSingleton(true);
    this._index = new org.monet.metamodel.internal.Ref("ceip.Applications.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("ceip.Applications.Application"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.OperationProperty operationProperty5 = new org.monet.metamodel.CollectionDefinition.OperationProperty();
    operationProperty5.setLabel("Publicar listado de admitidos/as");
    operationProperty5.setCode("m4xjxow");
    operationProperty5.setName("NuevosAlumnos");
    this.addOperation(operationProperty5);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty8 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty8.setLabel("Todos");
    setViewProperty8.setCode("mtoc7dg");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty9 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty9 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty9.setSortBy(new org.monet.metamodel.internal.Ref("Identifier","ceip.Applications.Indice","ceip.Applications.Indice.Identifier"));
    indexProperty9.setWithView(new org.monet.metamodel.internal.Ref("Normal","ceip.Applications.Indice","ceip.Applications.Indice.Normal"));
    showProperty9.setIndex(indexProperty9);
    setViewProperty8.setShow(showProperty9);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty13 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty13 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("Identifier","ceip.Applications.Indice","ceip.Applications.Indice.Identifier"));
    dimensionProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("StudentSurname","ceip.Applications.Indice","ceip.Applications.Indice.StudentSurname"));
    analyzeProperty13.setDimension(dimensionProperty13);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty16 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty16.getAttribute().add(new org.monet.metamodel.internal.Ref("Identifier","ceip.Applications.Indice","ceip.Applications.Indice.Identifier"));
    sortingProperty16.getAttribute().add(new org.monet.metamodel.internal.Ref("StudentSurname","ceip.Applications.Indice","ceip.Applications.Indice.StudentSurname"));
    sortingProperty16.getAttribute().add(new org.monet.metamodel.internal.Ref("Level","ceip.Applications.Indice","ceip.Applications.Indice.Level"));
    analyzeProperty13.setSorting(sortingProperty16);
    setViewProperty8.setAnalyze(analyzeProperty13);
    this.addView(setViewProperty8);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.applications.$Definition$.class,"ceip.Applications",null);
  }
  }
  
  public static String static_getName() {
    return "Applications";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.Applications.class;
  }
  
  public String getClientBehaviour() {
    return "var mzjznhq = new Object();mzjznhq.refresh = function (node) {if (!node.isEditable()) return;};mzjznhq.onChangeField = function (node, field) {};";
  }
}
