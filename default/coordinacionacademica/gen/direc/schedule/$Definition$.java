package direc.schedule;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mv6fg6g";
    this._name = "direc.Schedule";
    this._isAbstract = null;this._label = "Horario";
    this.setIsComponent(true);
    this._index = new org.monet.metamodel.internal.Ref("direc.Schedule.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("direc.Schedule.ScheduleSlot"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty6.setLabel("Todos");
    setViewProperty6.setCode("mzbdz6a");
    setViewProperty6.setName("View");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("Teacher","direc.Schedule.Indice","direc.Schedule.Indice.Teacher"));
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("Normal","direc.Schedule.Indice","direc.Schedule.Indice.Normal"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty6.setShow(showProperty7);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Weekday","direc.Schedule.Indice","direc.Schedule.Indice.Weekday"));
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("DayHour","direc.Schedule.Indice","direc.Schedule.Indice.DayHour"));
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Teacher","direc.Schedule.Indice","direc.Schedule.Indice.Teacher"));
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Group","direc.Schedule.Indice","direc.Schedule.Indice.Group"));
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Subject","direc.Schedule.Indice","direc.Schedule.Indice.Subject"));
    analyzeProperty11.setDimension(dimensionProperty11);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty17 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty17.getAttribute().add(new org.monet.metamodel.internal.Ref("Teacher","direc.Schedule.Indice","direc.Schedule.Indice.Teacher"));
    analyzeProperty11.setSorting(sortingProperty17);
    setViewProperty6.setAnalyze(analyzeProperty11);
    this.addView(setViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.schedule.$Definition$.class,"direc.Schedule",null);
  }
  }
  
  public static String static_getName() {
    return "Schedule";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.Schedule.class;
  }
  
  public String getClientBehaviour() {
    return "var mv6fg6g = new Object();mv6fg6g.refresh = function (node) {if (!node.isEditable()) return;};mv6fg6g.onChangeField = function (node, field) {};";
  }
}
