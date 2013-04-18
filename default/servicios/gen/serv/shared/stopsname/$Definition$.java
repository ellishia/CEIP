package serv.shared.stopsname;

import org.monet.metamodel.ThesaurusDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ThesaurusDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "myyhbha";
    this._name = "serv.shared.StopsName";
    this._isAbstract = null;this._label = "StopsName";
    this._ontology = "ParadasDeServicios";
    this.setIsSelfGenerated(true);
    org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty selfGeneratedProperty3 = new org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty();
    selfGeneratedProperty3.setIndex(new org.monet.metamodel.internal.Ref("serv.Stops.Indice"));
    org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty.MappingProperty mappingProperty4 = new org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty.MappingProperty();
    mappingProperty4.setParent(new org.monet.metamodel.internal.Ref("Identifier","serv.Stops.Indice","serv.Stops.Indice.Identifier"));
    mappingProperty4.setLabel(new org.monet.metamodel.internal.Ref("Name","serv.Stops.Indice","serv.Stops.Indice.Name"));
    mappingProperty4.setKey(new org.monet.metamodel.internal.Ref("Identifier","serv.Stops.Indice","serv.Stops.Indice.Identifier"));
    selfGeneratedProperty3.setMapping(mappingProperty4);
    this.setSelfGenerated(selfGeneratedProperty3);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.shared.stopsname.$Definition$.class,"serv.shared.StopsName",null);
  }
  }
  
  public static String static_getName() {
    return "StopsName";
  }
  
  public String getClientBehaviour() {
    return "var myyhbha = new Object();myyhbha.refresh = function (node) {if (!node.isEditable()) return;};myyhbha.onChangeField = function (node, field) {};";
  }
}
