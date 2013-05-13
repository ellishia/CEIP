package direc.teacherasignations;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mbdn_ew";
    this._name = "direc.TeacherAsignations";
    this._isAbstract = null;this._label = "Asignaciones de Horas";
    this.setIsSingleton(true);
    this._index = new org.monet.metamodel.internal.Ref("direc.TeacherAsignations.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("direc.TeacherAsignations.TeacherAsignation"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty6.setLabel("Todos");
    setViewProperty6.setCode("mxunqha");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("Teacher","direc.TeacherAsignations.Indice","direc.TeacherAsignations.Indice.Teacher"));
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("Normal","direc.TeacherAsignations.Indice","direc.TeacherAsignations.Indice.Normal"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty6.setShow(showProperty7);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Teacher","direc.TeacherAsignations.Indice","direc.TeacherAsignations.Indice.Teacher"));
    analyzeProperty11.setDimension(dimensionProperty11);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty13 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("Teacher","direc.TeacherAsignations.Indice","direc.TeacherAsignations.Indice.Teacher"));
    analyzeProperty11.setSorting(sortingProperty13);
    setViewProperty6.setAnalyze(analyzeProperty11);
    this.addView(setViewProperty6);
    
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
