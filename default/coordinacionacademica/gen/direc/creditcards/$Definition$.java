package direc.creditcards;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mhtm1na";
    this._name = "direc.CreditCards";
    this._isAbstract = null;this._label = "Tarjetas de Credito";
    this.setIsSingleton(true);
    this._index = new org.monet.metamodel.internal.Ref("direc.CreditCards.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("direc.CreditCards.CreditCard"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty6.setLabel("Todos");
    setViewProperty6.setCode("mdx4mta");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("AcademicYear","direc.CreditCards.Indice","direc.CreditCards.Indice.AcademicYear"));
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("Normal","direc.CreditCards.Indice","direc.CreditCards.Indice.Normal"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty6.setShow(showProperty7);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("AcademicYear","direc.CreditCards.Indice","direc.CreditCards.Indice.AcademicYear"));
    analyzeProperty11.setDimension(dimensionProperty11);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty13 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("AcademicYear","direc.CreditCards.Indice","direc.CreditCards.Indice.AcademicYear"));
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("CardNumber","direc.CreditCards.Indice","direc.CreditCards.Indice.CardNumber"));
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("Bank","direc.CreditCards.Indice","direc.CreditCards.Indice.Bank"));
    analyzeProperty11.setSorting(sortingProperty13);
    setViewProperty6.setAnalyze(analyzeProperty11);
    this.addView(setViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.creditcards.$Definition$.class,"direc.CreditCards",null);
  }
  }
  
  public static String static_getName() {
    return "CreditCards";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.CreditCards.class;
  }
  
  public String getClientBehaviour() {
    return "var mhtm1na = new Object();mhtm1na.refresh = function (node) {if (!node.isEditable()) return;};mhtm1na.onChangeField = function (node, field) {};";
  }
}
