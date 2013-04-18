package direc.parentsmeetings;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mjceiga";
    this._name = "direc.ParentsMeetings";
    this._isAbstract = null;this._label = "Reuniones de Padres";
    this._index = new org.monet.metamodel.internal.Ref("direc.ParentsMeetings.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty2 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("direc.ParentsMeetings.ParentsMeeting"));
    this.setAdd(addProperty2);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty5 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty5.setLabel("Todos");
    setViewProperty5.setCode("sss");
    setViewProperty5.setName("View");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty6.setSortBy(new org.monet.metamodel.internal.Ref("Title","direc.ParentsMeetings.Indice","direc.ParentsMeetings.Indice.Title"));
    indexProperty6.setWithView(new org.monet.metamodel.internal.Ref("Normal","direc.ParentsMeetings.Indice","direc.ParentsMeetings.Indice.Normal"));
    showProperty6.setIndex(indexProperty6);
    setViewProperty5.setShow(showProperty6);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Title","direc.ParentsMeetings.Indice","direc.ParentsMeetings.Indice.Title"));
    analyzeProperty10.setDimension(dimensionProperty10);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty12 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty12.getAttribute().add(new org.monet.metamodel.internal.Ref("Title","direc.ParentsMeetings.Indice","direc.ParentsMeetings.Indice.Title"));
    sortingProperty12.getAttribute().add(new org.monet.metamodel.internal.Ref("Date","direc.ParentsMeetings.Indice","direc.ParentsMeetings.Indice.Date"));
    sortingProperty12.getAttribute().add(new org.monet.metamodel.internal.Ref("Group","direc.ParentsMeetings.Indice","direc.ParentsMeetings.Indice.Group"));
    sortingProperty12.getAttribute().add(new org.monet.metamodel.internal.Ref("Teacher","direc.ParentsMeetings.Indice","direc.ParentsMeetings.Indice.Teacher"));
    analyzeProperty10.setSorting(sortingProperty12);
    setViewProperty5.setAnalyze(analyzeProperty10);
    this.addView(setViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.parentsmeetings.$Definition$.class,"direc.ParentsMeetings",null);
  }
  }
  
  public static String static_getName() {
    return "ParentsMeetings";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.ParentsMeetings.class;
  }
  
  public String getClientBehaviour() {
    return "var mjceiga = new Object();mjceiga.refresh = function (node) {if (!node.isEditable()) return;};mjceiga.onChangeField = function (node, field) {};";
  }
}
