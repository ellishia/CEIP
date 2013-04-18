package direc.asignationscards;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m0qb0ga";
    this._name = "direc.AsignationsCards";
    this._isAbstract = null;this._label = "Asignaciones de Tarjetas";
    this._index = new org.monet.metamodel.internal.Ref("direc.Asignations.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty2 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("direc.AsignationsCards.AsignationCard"));
    this.setAdd(addProperty2);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty4 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty4.setLabel("Todos");
    setViewProperty4.setCode("fadf");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty5 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty5.setSortBy(new org.monet.metamodel.internal.Ref("AcademicYear","direc.Asignations.Indice","direc.Asignations.Indice.AcademicYear"));
    indexProperty5.setWithView(new org.monet.metamodel.internal.Ref("Normal","direc.Asignations.Indice","direc.Asignations.Indice.Normal"));
    showProperty5.setIndex(indexProperty5);
    setViewProperty4.setShow(showProperty5);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty9 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty9 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty9.getAttribute().add(new org.monet.metamodel.internal.Ref("AcademicYear","direc.Asignations.Indice","direc.Asignations.Indice.AcademicYear"));
    analyzeProperty9.setDimension(dimensionProperty9);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("AcademicYear","direc.Asignations.Indice","direc.Asignations.Indice.AcademicYear"));
    analyzeProperty9.setSorting(sortingProperty11);
    setViewProperty4.setAnalyze(analyzeProperty9);
    this.addView(setViewProperty4);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.asignationscards.$Definition$.class,"direc.AsignationsCards",null);
  }
  }
  
  public static String static_getName() {
    return "AsignationsCards";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.AsignationsCards.class;
  }
  
  public String getClientBehaviour() {
    return "var m0qb0ga = new Object();m0qb0ga.refresh = function (node) {if (!node.isEditable()) return;};m0qb0ga.onChangeField = function (node, field) {};";
  }
}
