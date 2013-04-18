package ceip.academiccalendars;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m2imvha";
    this._name = "ceip.AcademicCalendars";
    this._isAbstract = null;this._label = "Calendarios Académicos";
    this.setIsSingleton(true);
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty2 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("ceip.AcademicCalendars.AcademicCalendar"));
    this.setAdd(addProperty2);
    this._index = new org.monet.metamodel.internal.Ref("ceip.AcademicCalendars.Index");
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty5 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty5.setLabel("Calendarios Académicos");
    setViewProperty5.setCode("mrfh_hq");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty6.setSortBy(new org.monet.metamodel.internal.Ref("academicYear","ceip.AcademicCalendars.Index","ceip.AcademicCalendars.Index.academicYear"));
    indexProperty6.setWithView(new org.monet.metamodel.internal.Ref("Normal","ceip.AcademicCalendars.Index","ceip.AcademicCalendars.Index.Normal"));
    showProperty6.setIndex(indexProperty6);
    setViewProperty5.setShow(showProperty6);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("academicYear","ceip.AcademicCalendars.Index","ceip.AcademicCalendars.Index.academicYear"));
    analyzeProperty10.setDimension(dimensionProperty10);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty12 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty12.getAttribute().add(new org.monet.metamodel.internal.Ref("academicYear","ceip.AcademicCalendars.Index","ceip.AcademicCalendars.Index.academicYear"));
    analyzeProperty10.setSorting(sortingProperty12);
    setViewProperty5.setAnalyze(analyzeProperty10);
    this.addView(setViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.academiccalendars.$Definition$.class,"ceip.AcademicCalendars",null);
  }
  }
  
  public static String static_getName() {
    return "AcademicCalendars";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.AcademicCalendars.class;
  }
  
  public String getClientBehaviour() {
    return "var m2imvha = new Object();m2imvha.refresh = function (node) {if (!node.isEditable()) return;};m2imvha.onChangeField = function (node, field) {};";
  }
}
