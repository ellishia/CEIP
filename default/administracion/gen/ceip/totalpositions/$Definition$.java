package ceip.totalpositions;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m_waeqq";
    this._name = "ceip.TotalPositions";
    this._isAbstract = null;this._label = "Total Positions";
    this.setIsComponent(true);
    this._index = new org.monet.metamodel.internal.Ref("ceip.AvailablePositions.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("ceip.Position"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty5 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty5.setLabel("Todos");
    setViewProperty5.setCode("m7ky88q");
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
    setViewProperty17.setCode("mdcppsa");
    setViewProperty17.setName("View");
    setViewProperty17.setIsWidget(true);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty18 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty18 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty18.setSortBy(new org.monet.metamodel.internal.Ref("Anyo","ceip.AvailablePositions.Indice","ceip.AvailablePositions.Indice.Anyo"));
    indexProperty18.setWithView(new org.monet.metamodel.internal.Ref("Item","ceip.AvailablePositions.Indice","ceip.AvailablePositions.Indice.Item"));
    showProperty18.setIndex(indexProperty18);
    setViewProperty17.setShow(showProperty18);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty22 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty22 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty22.getAttribute().add(new org.monet.metamodel.internal.Ref("Anyo","ceip.AvailablePositions.Indice","ceip.AvailablePositions.Indice.Anyo"));
    analyzeProperty22.setDimension(dimensionProperty22);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty24 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty24.getAttribute().add(new org.monet.metamodel.internal.Ref("Anyo","ceip.AvailablePositions.Indice","ceip.AvailablePositions.Indice.Anyo"));
    analyzeProperty22.setSorting(sortingProperty24);
    setViewProperty17.setAnalyze(analyzeProperty22);
    this.addView(setViewProperty17);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.totalpositions.$Definition$.class,"ceip.TotalPositions",null);
  }
  }
  
  public static String static_getName() {
    return "TotalPositions";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.TotalPositions.class;
  }
  
  public String getClientBehaviour() {
    return "var m_waeqq = new Object();m_waeqq.refresh = function (node) {if (!node.isEditable()) return;};m_waeqq.onChangeField = function (node, field) {};";
  }
}
