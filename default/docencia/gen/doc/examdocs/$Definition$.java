package doc.examdocs;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mqczzuw";
    this._name = "doc.ExamDocs";
    this._isAbstract = null;this._label = "Documentos de Examen";
    this._index = new org.monet.metamodel.internal.Ref("doc.ExamDocs.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty2 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("doc.ExamDoc"));
    this.setAdd(addProperty2);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty5 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty5.setLabel("Todos");
    setViewProperty5.setCode("dafa");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty6.setSortBy(new org.monet.metamodel.internal.Ref("Name","doc.ExamDocs.Indice","doc.ExamDocs.Indice.Name"));
    indexProperty6.setWithView(new org.monet.metamodel.internal.Ref("Normal","doc.ExamDocs.Indice","doc.ExamDocs.Indice.Normal"));
    showProperty6.setIndex(indexProperty6);
    setViewProperty5.setShow(showProperty6);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty10 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty10.getAttribute().add(new org.monet.metamodel.internal.Ref("Name","doc.ExamDocs.Indice","doc.ExamDocs.Indice.Name"));
    analyzeProperty10.setDimension(dimensionProperty10);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty12 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty12.getAttribute().add(new org.monet.metamodel.internal.Ref("Name","doc.ExamDocs.Indice","doc.ExamDocs.Indice.Name"));
    analyzeProperty10.setSorting(sortingProperty12);
    setViewProperty5.setAnalyze(analyzeProperty10);
    this.addView(setViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.examdocs.$Definition$.class,"doc.ExamDocs",null);
  }
  }
  
  public static String static_getName() {
    return "ExamDocs";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.ExamDocs.class;
  }
  
  public String getClientBehaviour() {
    return "var mqczzuw = new Object();mqczzuw.refresh = function (node) {if (!node.isEditable()) return;};mqczzuw.onChangeField = function (node, field) {};";
  }
}
