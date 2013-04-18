package grades.controls;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m7ze6fa";
    this._name = "grades.Controls";
    this._isAbstract = null;this._label = "Controles";
    this._index = new org.monet.metamodel.internal.Ref("grades.Controls.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty2 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("grades.Controls.Control"));
    this.setAdd(addProperty2);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty5 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty5.setLabel("Todos");
    setViewProperty5.setCode("mdawhcg");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty6.setSortBy(new org.monet.metamodel.internal.Ref("Date","grades.Controls.Indice","grades.Controls.Indice.Date"));
    indexProperty6.setWithView(new org.monet.metamodel.internal.Ref("Normal","grades.Controls.Indice","grades.Controls.Indice.Normal"));
    showProperty6.setIndex(indexProperty6);
    setViewProperty5.setShow(showProperty6);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Date","grades.Controls.Indice","grades.Controls.Indice.Date"));
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Group","grades.Controls.Indice","grades.Controls.Indice.Group"));
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Subject","grades.Controls.Indice","grades.Controls.Indice.Subject"));
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Teacher","grades.Controls.Indice","grades.Controls.Indice.Teacher"));
    analyzeProperty10.setDimension(dimensionProperty10);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty15 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty15.getAttribute().add(new org.monet.metamodel.internal.Ref("Date","grades.Controls.Indice","grades.Controls.Indice.Date"));
    analyzeProperty10.setSorting(sortingProperty15);
    setViewProperty5.setAnalyze(analyzeProperty10);
    this.addView(setViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.controls.$Definition$.class,"grades.Controls",null);
  }
  }
  
  public static String static_getName() {
    return "Controls";
  }
  
  public Class<?> getBehaviourClass() {
    return grades.Controls.class;
  }
  
  public String getClientBehaviour() {
    return "var m7ze6fa = new Object();m7ze6fa.refresh = function (node) {if (!node.isEditable()) return;};m7ze6fa.onChangeField = function (node, field) {};";
  }
}
