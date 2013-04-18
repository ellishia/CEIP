package doc.subjects;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m4e62wg";
    this._name = "doc.Subjects";
    this._isAbstract = null;this._label = "Asignaturas";
    this.setIsSingleton(true);
    this._index = new org.monet.metamodel.internal.Ref("doc.Subjects.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty3 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty3.getNode().add(new org.monet.metamodel.internal.Ref("doc.Subjects.Subject"));
    this.setAdd(addProperty3);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty6.setLabel("Todos");
    setViewProperty6.setCode("may_d_w");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("Name","doc.Subjects.Indice","doc.Subjects.Indice.Name"));
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("Normal","doc.Subjects.Indice","doc.Subjects.Indice.Normal"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty6.setShow(showProperty7);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Name","doc.Subjects.Indice","doc.Subjects.Indice.Name"));
    analyzeProperty11.setDimension(dimensionProperty11);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty13 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("Name","doc.Subjects.Indice","doc.Subjects.Indice.Name"));
    analyzeProperty11.setSorting(sortingProperty13);
    setViewProperty6.setAnalyze(analyzeProperty11);
    this.addView(setViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.subjects.$Definition$.class,"doc.Subjects",null);
  }
  }
  
  public static String static_getName() {
    return "Subjects";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.Subjects.class;
  }
  
  public String getClientBehaviour() {
    return "var m4e62wg = new Object();m4e62wg.refresh = function (node) {if (!node.isEditable()) return;};m4e62wg.onChangeField = function (node, field) {};";
  }
}
