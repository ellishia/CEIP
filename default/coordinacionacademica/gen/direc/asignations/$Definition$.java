package direc.asignations;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mrqfygw";
    this._name = "direc.Asignations";
    this._isAbstract = null;this._label = "Asignaciones";
    this.setIsSingleton(true);
    this._index = new org.monet.metamodel.internal.Ref("direc.Asignations.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("direc.Asignations.AsignationDefault"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty6.setLabel("Todos");
    setViewProperty6.setCode("mbszzya");
    setViewProperty6.setName("ViewIndice");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("AcademicYear","direc.Asignations.Indice","direc.Asignations.Indice.AcademicYear"));
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("Normal","direc.Asignations.Indice","direc.Asignations.Indice.Normal"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty6.setShow(showProperty7);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("AcademicYear","direc.Asignations.Indice","direc.Asignations.Indice.AcademicYear"));
    analyzeProperty11.setDimension(dimensionProperty11);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty13 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("AcademicYear","direc.Asignations.Indice","direc.Asignations.Indice.AcademicYear"));
    analyzeProperty11.setSorting(sortingProperty13);
    setViewProperty6.setAnalyze(analyzeProperty11);
    this.addView(setViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.asignations.$Definition$.class,"direc.Asignations",null);
  }
  }
  
  public static String static_getName() {
    return "Asignations";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.Asignations.class;
  }
  
  public String getClientBehaviour() {
    return "var mrqfygw = new Object();mrqfygw.refresh = function (node) {if (!node.isEditable()) return;};mrqfygw.onChangeField = function (node, field) {};";
  }
}
