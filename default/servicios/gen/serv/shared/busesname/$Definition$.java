package serv.shared.busesname;

import org.monet.metamodel.ThesaurusDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ThesaurusDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mvwqkrw";
    this._name = "serv.shared.BusesName";
    this._isAbstract = null;this._label = "Ruta";
    this._ontology = "RutaDeServicios";
    this.setIsSelfGenerated(true);
    org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty selfGeneratedProperty3 = new org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty();
    selfGeneratedProperty3.setIndex(new org.monet.metamodel.internal.Ref("serv.Buslines.Indice"));
    org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty.MappingProperty mappingProperty4 = new org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty.MappingProperty();
    mappingProperty4.setParent(new org.monet.metamodel.internal.Ref("Id","serv.Buslines.Indice","serv.Buslines.Indice.Id"));
    mappingProperty4.setLabel(new org.monet.metamodel.internal.Ref("Name","serv.Buslines.Indice","serv.Buslines.Indice.Name"));
    mappingProperty4.setKey(new org.monet.metamodel.internal.Ref("Id","serv.Buslines.Indice","serv.Buslines.Indice.Id"));
    selfGeneratedProperty3.setMapping(mappingProperty4);
    this.setSelfGenerated(selfGeneratedProperty3);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.shared.busesname.$Definition$.class,"serv.shared.BusesName",null);
  }
  }
  
  public static String static_getName() {
    return "BusesName";
  }
  
  public String getClientBehaviour() {
    return "var mvwqkrw = new Object();mvwqkrw.refresh = function (node) {if (!node.isEditable()) return;};mvwqkrw.onChangeField = function (node, field) {};";
  }
}
