package direc.teacherasignations;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mbdn_ew";
    this._name = "direc.TeacherAsignations";
    this._isAbstract = null;this._label = "Asignaciones de Slots";
    this._index = new org.monet.metamodel.internal.Ref("direc.TeacherAsignations.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty2 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("direc.TeacherAsignations.TeacherAsignation"));
    this.setAdd(addProperty2);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty5 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty5.setLabel("Todos");
    setViewProperty5.setCode("mxunqha");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty6.setSortBy(new org.monet.metamodel.internal.Ref("Teacher","direc.TeacherAsignations.Indice","direc.TeacherAsignations.Indice.Teacher"));
    indexProperty6.setWithView(new org.monet.metamodel.internal.Ref("Normal","direc.TeacherAsignations.Indice","direc.TeacherAsignations.Indice.Normal"));
    showProperty6.setIndex(indexProperty6);
    setViewProperty5.setShow(showProperty6);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Teacher","direc.TeacherAsignations.Indice","direc.TeacherAsignations.Indice.Teacher"));
    analyzeProperty10.setDimension(dimensionProperty10);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty12 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty12.getAttribute().add(new org.monet.metamodel.internal.Ref("Teacher","direc.TeacherAsignations.Indice","direc.TeacherAsignations.Indice.Teacher"));
    analyzeProperty10.setSorting(sortingProperty12);
    setViewProperty5.setAnalyze(analyzeProperty10);
    this.addView(setViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.teacherasignations.$Definition$.class,"direc.TeacherAsignations",null);
  }
  }
  
  public static String static_getName() {
    return "TeacherAsignations";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.TeacherAsignations.class;
  }
  
  public String getClientBehaviour() {
    return "var mbdn_ew = new Object();mbdn_ew.refresh = function (node) {if (!node.isEditable()) return;};mbdn_ew.onChangeField = function (node, field) {};";
  }
}
