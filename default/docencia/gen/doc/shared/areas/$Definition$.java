package doc.shared.areas;

import org.monet.metamodel.ThesaurusDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ThesaurusDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "myyhbha";
    this._name = "doc.shared.Areas";
    this._isAbstract = null;this._label = "Materias";
    this._ontology = "MateriasDeDocencia";
    this.setIsSelfGenerated(true);
    org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty selfGeneratedProperty3 = new org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty();
    selfGeneratedProperty3.setIndex(new org.monet.metamodel.internal.Ref("doc.SubjectLevels.Indice"));
    org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty.MappingProperty mappingProperty4 = new org.monet.metamodel.ThesaurusDefinition.SelfGeneratedProperty.MappingProperty();
    mappingProperty4.setLabel(new org.monet.metamodel.internal.Ref("AsignaturaCompleta","doc.SubjectLevels.Indice","doc.SubjectLevels.Indice.AsignaturaCompleta"));
    mappingProperty4.setKey(new org.monet.metamodel.internal.Ref("Identifier","doc.SubjectLevels.Indice","doc.SubjectLevels.Indice.Identifier"));
    selfGeneratedProperty3.setMapping(mappingProperty4);
    this.setSelfGenerated(selfGeneratedProperty3);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.shared.areas.$Definition$.class,"doc.shared.Areas",null);
  }
  }
  
  public static String static_getName() {
    return "Areas";
  }
  
  public String getClientBehaviour() {
    return "var myyhbha = new Object();myyhbha.refresh = function (node) {if (!node.isEditable()) return;};myyhbha.onChangeField = function (node, field) {};";
  }
}
