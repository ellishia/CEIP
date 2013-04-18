package serv.userscanteen;

import org.monet.metamodel.CollectionDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends CollectionDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m7p1bbq";
    this._name = "serv.UsersCanteen";
    this._isAbstract = null;this._label = "Usuarios de Comedor";
    this._index = new org.monet.metamodel.internal.Ref("serv.UsersCanteen.Indice");
    org.monet.metamodel.CollectionDefinition.AddProperty addProperty2 = new org.monet.metamodel.CollectionDefinition.AddProperty();
    addProperty2.getNode().add(new org.monet.metamodel.internal.Ref("serv.UsersCanteen.UserCanteen"));
    this.setAdd(addProperty2);
    org.monet.metamodel.CollectionDefinition.SetViewProperty setViewProperty6 = new org.monet.metamodel.CollectionDefinition.SetViewProperty();
    setViewProperty6.setLabel("Todos");
    setViewProperty6.setCode("maurmiw");
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty indexProperty7 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.ShowProperty.IndexProperty();
    indexProperty7.setSortBy(new org.monet.metamodel.internal.Ref("Schedule","serv.UsersCanteen.Indice","serv.UsersCanteen.Indice.Schedule"));
    indexProperty7.setWithView(new org.monet.metamodel.internal.Ref("Normal","serv.UsersCanteen.Indice","serv.UsersCanteen.Indice.Normal"));
    showProperty7.setIndex(indexProperty7);
    setViewProperty6.setShow(showProperty7);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty analyzeProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty();
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty dimensionProperty11 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.DimensionProperty();
    dimensionProperty11.getAttribute().add(new org.monet.metamodel.internal.Ref("Schedule","serv.UsersCanteen.Indice","serv.UsersCanteen.Indice.Schedule"));
    analyzeProperty11.setDimension(dimensionProperty11);
    org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty sortingProperty13 = new org.monet.metamodel.CollectionDefinition.SetViewProperty.AnalyzeProperty.SortingProperty();
    sortingProperty13.getAttribute().add(new org.monet.metamodel.internal.Ref("Schedule","serv.UsersCanteen.Indice","serv.UsersCanteen.Indice.Schedule"));
    analyzeProperty11.setSorting(sortingProperty13);
    setViewProperty6.setAnalyze(analyzeProperty11);
    this.addView(setViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.userscanteen.$Definition$.class,"serv.UsersCanteen",null);
  }
  }
  
  public static String static_getName() {
    return "UsersCanteen";
  }
  
  public Class<?> getBehaviourClass() {
    return serv.UsersCanteen.class;
  }
  
  public String getClientBehaviour() {
    return "var m7p1bbq = new Object();m7p1bbq.refresh = function (node) {if (!node.isEditable()) return;};m7p1bbq.onChangeField = function (node, field) {};";
  }
}
