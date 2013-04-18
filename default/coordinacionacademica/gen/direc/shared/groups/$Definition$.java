package direc.shared.groups;

import org.monet.metamodel.ThesaurusDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ThesaurusDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mm8o_pa";
    this._name = "direc.shared.Groups";
    this._isAbstract = null;this._label = "Grupos";
    this._ontology = "GruposDeCoordinacion";
    this.setIsSelfGenerated(true);
    org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty selfGeneratedProperty3 = new org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty();
    selfGeneratedProperty3.setIndex(new org.monet.metamodel.internal.Ref("direc.Groups.Indice"));
    org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty.MappingProperty mappingProperty4 = new org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty.MappingProperty();
    mappingProperty4.setParent(new org.monet.metamodel.internal.Ref("Name","direc.Groups.Indice","direc.Groups.Indice.Name"));
    mappingProperty4.setLabel(new org.monet.metamodel.internal.Ref("Name","direc.Groups.Indice","direc.Groups.Indice.Name"));
    mappingProperty4.setKey(new org.monet.metamodel.internal.Ref("Identifier","direc.Groups.Indice","direc.Groups.Indice.Identifier"));
    selfGeneratedProperty3.setMapping(mappingProperty4);
    this.setSelfGenerated(selfGeneratedProperty3);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.shared.groups.$Definition$.class,"direc.shared.Groups",null);
  }
  }
  
  public static String static_getName() {
    return "Groups";
  }
  
  public String getClientBehaviour() {
    return "var mm8o_pa = new Object();mm8o_pa.refresh = function (node) {if (!node.isEditable()) return;};mm8o_pa.onChangeField = function (node, field) {};";
  }
}
