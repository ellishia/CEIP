package direc.slots;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mobp_3a";
    this._name = "direc.Slots";
    this._isAbstract = null;this._label = "Slots";
    this._index = new org.monet.metamodel.internal.Ref("direc.Slots.Indice");
    this.setIsSingleton(true);
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("direc.Slots.Slot"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty6.setLabel("Todos");
    setViewProperty6.setCode("mkri5ug");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("Weekday","direc.Slots.Indice","direc.Slots.Indice.Weekday"));
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("Normal","direc.Slots.Indice","direc.Slots.Indice.Normal"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty6.setShow(showProperty7);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Group","direc.Slots.Indice","direc.Slots.Indice.Group"));
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Weekday","direc.Slots.Indice","direc.Slots.Indice.Weekday"));
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("DayHour","direc.Slots.Indice","direc.Slots.Indice.DayHour"));
    analyzeProperty11.setDimension(dimensionProperty11);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty15 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty15.getAttribute().add(new org.monet.metamodel.internal.Ref("Group","direc.Slots.Indice","direc.Slots.Indice.Group"));
    sortingProperty15.getAttribute().add(new org.monet.metamodel.internal.Ref("Weekday","direc.Slots.Indice","direc.Slots.Indice.Weekday"));
    sortingProperty15.getAttribute().add(new org.monet.metamodel.internal.Ref("DayHour","direc.Slots.Indice","direc.Slots.Indice.DayHour"));
    analyzeProperty11.setSorting(sortingProperty15);
    setViewProperty6.setAnalyze(analyzeProperty11);
    this.addView(setViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.slots.$Definition$.class,"direc.Slots",null);
  }
  }
  
  public static String static_getName() {
    return "Slots";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.Slots.class;
  }
  
  public String getClientBehaviour() {
    return "var mobp_3a = new Object();mobp_3a.refresh = function (node) {if (!node.isEditable()) return;};mobp_3a.onChangeField = function (node, field) {};";
  }
}
