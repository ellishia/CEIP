package ceip.availablepositions;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mljgmza";
    this._name = "ceip.AvailablePositions";
    this._isAbstract = null;this._label = "Available Positions";
    this.setIsComponent(true);
    this._index = new org.monet.metamodel.internal.Ref("ceip.AvailablePositions.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("ceip.Position"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty5 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty5.setLabel("Todos");
    setViewProperty5.setCode("mv_rrrw");
    setViewProperty5.setIsDefault(true);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("Anyo","ceip.AvailablePositions.Indice","ceip.AvailablePositions.Indice.Anyo"));
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("Item","ceip.AvailablePositions.Indice","ceip.AvailablePositions.Indice.Item"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty5.setShow(showProperty7);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Anyo","ceip.AvailablePositions.Indice","ceip.AvailablePositions.Indice.Anyo"));
    analyzeProperty11.setDimension(dimensionProperty11);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty13 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("Anyo","ceip.AvailablePositions.Indice","ceip.AvailablePositions.Indice.Anyo"));
    analyzeProperty11.setSorting(sortingProperty13);
    setViewProperty5.setAnalyze(analyzeProperty11);
    this.addView(setViewProperty5);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty17 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty17.setCode("mf9ania");
    setViewProperty17.setName("Vista");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty17 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty17 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty17.setSortBy(new org.monet.metamodel.internal.Ref("Anyo","ceip.AvailablePositions.Indice","ceip.AvailablePositions.Indice.Anyo"));
    indexProperty17.setWithView(new org.monet.metamodel.internal.Ref("Item","ceip.AvailablePositions.Indice","ceip.AvailablePositions.Indice.Item"));
    showProperty17.setIndex(indexProperty17);
    setViewProperty17.setShow(showProperty17);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty21 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty21 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty21.getAttribute().add(new org.monet.metamodel.internal.Ref("Anyo","ceip.AvailablePositions.Indice","ceip.AvailablePositions.Indice.Anyo"));
    analyzeProperty21.setDimension(dimensionProperty21);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty23 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty23.getAttribute().add(new org.monet.metamodel.internal.Ref("Anyo","ceip.AvailablePositions.Indice","ceip.AvailablePositions.Indice.Anyo"));
    analyzeProperty21.setSorting(sortingProperty23);
    setViewProperty17.setAnalyze(analyzeProperty21);
    this.addView(setViewProperty17);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.availablepositions.$Definition$.class,"ceip.AvailablePositions",null);
  }
  }
  
  public static String static_getName() {
    return "AvailablePositions";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.AvailablePositions.class;
  }
  
  public String getClientBehaviour() {
    return "var mljgmza = new Object();mljgmza.refresh = function (node) {if (!node.isEditable()) return;};mljgmza.onChangeField = function (node, field) {};";
  }
}
