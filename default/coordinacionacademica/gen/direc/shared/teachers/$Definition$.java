package direc.shared.teachers;

import org.monet.metamodel.ThesaurusDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ThesaurusDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "myyhbha";
    this._name = "direc.shared.Teachers";
    this._isAbstract = null;this._label = "Docentes";
    this._ontology = "DocentesDeCoordinacion";
    this.setIsSelfGenerated(true);
    org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty selfGeneratedProperty3 = new org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty();
    selfGeneratedProperty3.setIndex(new org.monet.metamodel.internal.Ref("direc.Teachers.Indice"));
    org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty.MappingProperty mappingProperty4 = new org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty.MappingProperty();
    mappingProperty4.setParent(new org.monet.metamodel.internal.Ref("Identifier","direc.Teachers.Indice","direc.Teachers.Indice.Identifier"));
    mappingProperty4.setLabel(new org.monet.metamodel.internal.Ref("Surname","direc.Teachers.Indice","direc.Teachers.Indice.Surname"));
    mappingProperty4.setKey(new org.monet.metamodel.internal.Ref("Identifier","direc.Teachers.Indice","direc.Teachers.Indice.Identifier"));
    selfGeneratedProperty3.setMapping(mappingProperty4);
    this.setSelfGenerated(selfGeneratedProperty3);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.shared.teachers.$Definition$.class,"direc.shared.Teachers",null);
  }
  }
  
  public static String static_getName() {
    return "Teachers";
  }
  
  public String getClientBehaviour() {
    return "var myyhbha = new Object();myyhbha.refresh = function (node) {if (!node.isEditable()) return;};myyhbha.onChangeField = function (node, field) {};";
  }
}
