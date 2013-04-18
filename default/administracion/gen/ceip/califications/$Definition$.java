package ceip.califications;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "minbk5w";
    this._name = "ceip.Califications";
    this._isAbstract = null;this._label = "Calificaciones";
    this.setIsSingleton(true);
    this._index = new org.monet.metamodel.internal.Ref("ceip.Califications.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("ceip.Califications.Calification"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.OperationProperty operationProperty5 = new org.monet.metamodel.CollectionDefinition.OperationProperty();
    operationProperty5.setLabel("Generar Boletines");
    operationProperty5.setCode("mho6x0q");
    operationProperty5.setName("Boletines");
    this.addOperation(operationProperty5);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty8 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty8.setCode("muf9cnq");
    setViewProperty8.setIsDefault(true);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty9 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty9 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty9.setSortBy(new org.monet.metamodel.internal.Ref("Subject","ceip.Califications.Indice","ceip.Califications.Indice.Subject"));
    indexProperty9.setWithView(new org.monet.metamodel.internal.Ref("Normal","ceip.Califications.Indice","ceip.Califications.Indice.Normal"));
    showProperty9.setIndex(indexProperty9);
    setViewProperty8.setShow(showProperty9);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty13 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty13 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("Subject","ceip.Califications.Indice","ceip.Califications.Indice.Subject"));
    dimensionProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("Level","ceip.Califications.Indice","ceip.Califications.Indice.Level"));
    dimensionProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("Student","ceip.Califications.Indice","ceip.Califications.Indice.Student"));
    analyzeProperty13.setDimension(dimensionProperty13);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty17 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty17.getAttribute().add(new org.monet.metamodel.internal.Ref("AcademicYear","ceip.Califications.Indice","ceip.Califications.Indice.AcademicYear"));
    sortingProperty17.getAttribute().add(new org.monet.metamodel.internal.Ref("Subject","ceip.Califications.Indice","ceip.Califications.Indice.Subject"));
    sortingProperty17.getAttribute().add(new org.monet.metamodel.internal.Ref("Level","ceip.Califications.Indice","ceip.Califications.Indice.Level"));
    sortingProperty17.getAttribute().add(new org.monet.metamodel.internal.Ref("Student","ceip.Califications.Indice","ceip.Califications.Indice.Student"));
    analyzeProperty13.setSorting(sortingProperty17);
    setViewProperty8.setAnalyze(analyzeProperty13);
    this.addView(setViewProperty8);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.califications.$Definition$.class,"ceip.Califications",null);
  }
  }
  
  public static String static_getName() {
    return "Califications";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.Califications.class;
  }
  
  public String getClientBehaviour() {
    return "var minbk5w = new Object();minbk5w.refresh = function (node) {if (!node.isEditable()) return;};minbk5w.onChangeField = function (node, field) {};";
  }
}
