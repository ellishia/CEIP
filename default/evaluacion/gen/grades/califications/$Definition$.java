package grades.califications;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "minbk5w";
    this._name = "grades.Califications";
    this._isAbstract = null;this._label = "Calificaciones";
    this.setIsSingleton(true);
    this._index = new org.monet.metamodel.internal.Ref("grades.Califications.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("grades.Califications.Calification"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty5 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty5.setCode("muf9cnq");
    setViewProperty5.setName("ViewAll");
    setViewProperty5.setIsDefault(true);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty6.setSortBy(new org.monet.metamodel.internal.Ref("Subject","grades.Califications.Indice","grades.Califications.Indice.Subject"));
    indexProperty6.setWithView(new org.monet.metamodel.internal.Ref("Normal","grades.Califications.Indice","grades.Califications.Indice.Normal"));
    showProperty6.setIndex(indexProperty6);
    setViewProperty5.setShow(showProperty6);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Subject","grades.Califications.Indice","grades.Califications.Indice.Subject"));
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Level","grades.Califications.Indice","grades.Califications.Indice.Level"));
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Student","grades.Califications.Indice","grades.Califications.Indice.Student"));
    analyzeProperty10.setDimension(dimensionProperty10);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty14 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty14.getAttribute().add(new org.monet.metamodel.internal.Ref("AcademicYear","grades.Califications.Indice","grades.Califications.Indice.AcademicYear"));
    sortingProperty14.getAttribute().add(new org.monet.metamodel.internal.Ref("Subject","grades.Califications.Indice","grades.Califications.Indice.Subject"));
    sortingProperty14.getAttribute().add(new org.monet.metamodel.internal.Ref("Level","grades.Califications.Indice","grades.Califications.Indice.Level"));
    sortingProperty14.getAttribute().add(new org.monet.metamodel.internal.Ref("Student","grades.Califications.Indice","grades.Califications.Indice.Student"));
    analyzeProperty10.setSorting(sortingProperty14);
    setViewProperty5.setAnalyze(analyzeProperty10);
    this.addView(setViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.califications.$Definition$.class,"grades.Califications",null);
  }
  }
  
  public static String static_getName() {
    return "Califications";
  }
  
  public Class<?> getBehaviourClass() {
    return grades.Califications.class;
  }
  
  public String getClientBehaviour() {
    return "var minbk5w = new Object();minbk5w.refresh = function (node) {if (!node.isEditable()) return;};minbk5w.onChangeField = function (node, field) {};";
  }
}
