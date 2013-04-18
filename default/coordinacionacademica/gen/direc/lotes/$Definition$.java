package direc.lotes;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "muol0_w";
    this._name = "direc.Lotes";
    this._isAbstract = null;this._label = "Lotes";
    this.setIsSingleton(true);
    this._index = new org.monet.metamodel.internal.Ref("direc.Lotes.Index");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("direc.Lotes.Lote"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty6.setLabel("Lotes");
    setViewProperty6.setCode("mt8xdcq");
    setViewProperty6.setName("View");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("Identifier","direc.Lotes.Index","direc.Lotes.Index.Identifier"));
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("LoteView","direc.Lotes.Index","direc.Lotes.Index.LoteView"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty6.setShow(showProperty7);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Identifier","direc.Lotes.Index","direc.Lotes.Index.Identifier"));
    analyzeProperty11.setDimension(dimensionProperty11);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty13 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("Identifier","direc.Lotes.Index","direc.Lotes.Index.Identifier"));
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("AcademicYear","direc.Lotes.Index","direc.Lotes.Index.AcademicYear"));
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("Level","direc.Lotes.Index","direc.Lotes.Index.Level"));
    analyzeProperty11.setSorting(sortingProperty13);
    setViewProperty6.setAnalyze(analyzeProperty11);
    this.addView(setViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.lotes.$Definition$.class,"direc.Lotes",null);
  }
  }
  
  public static String static_getName() {
    return "Lotes";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.Lotes.class;
  }
  
  public String getClientBehaviour() {
    return "var muol0_w = new Object();muol0_w.refresh = function (node) {if (!node.isEditable()) return;};muol0_w.onChangeField = function (node, field) {};";
  }
}
