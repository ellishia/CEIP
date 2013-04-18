package direc.asignationslotes;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mt7wjka";
    this._name = "direc.AsignationsLotes";
    this._isAbstract = null;this._label = "Asignaciones de Lotes";
    this._index = new org.monet.metamodel.internal.Ref("direc.Asignations.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty2 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("direc.AsignationsLotes.AsignationLote"));
    this.setAdd(addProperty2);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty4 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty4.setLabel("Todos");
    setViewProperty4.setCode("mleze1a");
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
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.asignationslotes.$Definition$.class,"direc.AsignationsLotes",null);
  }
  }
  
  public static String static_getName() {
    return "AsignationsLotes";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.AsignationsLotes.class;
  }
  
  public String getClientBehaviour() {
    return "var mt7wjka = new Object();mt7wjka.refresh = function (node) {if (!node.isEditable()) return;};mt7wjka.onChangeField = function (node, field) {};";
  }
}
