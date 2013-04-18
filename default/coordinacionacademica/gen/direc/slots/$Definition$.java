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
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty2 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("direc.Slots.Slot"));
    this.setAdd(addProperty2);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty5 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty5.setLabel("Todos");
    setViewProperty5.setCode("mkri5ug");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty6.setSortBy(new org.monet.metamodel.internal.Ref("Nombre","direc.Slots.Indice","direc.Slots.Indice.Nombre"));
    indexProperty6.setWithView(new org.monet.metamodel.internal.Ref("Normal","direc.Slots.Indice","direc.Slots.Indice.Normal"));
    showProperty6.setIndex(indexProperty6);
    setViewProperty5.setShow(showProperty6);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Nombre","direc.Slots.Indice","direc.Slots.Indice.Nombre"));
    analyzeProperty10.setDimension(dimensionProperty10);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty12 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty12.getAttribute().add(new org.monet.metamodel.internal.Ref("Nombre","direc.Slots.Indice","direc.Slots.Indice.Nombre"));
    analyzeProperty10.setSorting(sortingProperty12);
    setViewProperty5.setAnalyze(analyzeProperty10);
    this.addView(setViewProperty5);
    
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
