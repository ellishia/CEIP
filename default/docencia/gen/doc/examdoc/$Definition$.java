package doc.examdoc;

import org.monet.metamodel.DocumentDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasSchema;

@SuppressWarnings("all")
public class $Definition$ extends DocumentDefinition implements HasBehaviour, HasClientBehaviour, HasSchema, HasMappings {
  public $Definition$() {
    super();this._code = "ml2_wla";
    this._name = "doc.ExamDoc";
    this._isAbstract = null;this._label = "Examen";
    this._template = prof.Resources.Template.ExamDoc;
    org.monet.metamodel.DocumentDefinition.MappingProperty mappingProperty2 = new org.monet.metamodel.DocumentDefinition.MappingProperty();
    mappingProperty2.setIndex(new org.monet.metamodel.internal.Ref("doc.ExamDocs.Indice"));
    this.getMappingList().add(mappingProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.examdoc.$Definition$.class,"doc.ExamDoc",null);
  }
  }
  
  public static String static_getName() {
    return "ExamDoc";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.ExamDoc.class;
  }
  
  public String getClientBehaviour() {
    return "var ml2_wla = new Object();ml2_wla.refresh = function (node) {if (!node.isEditable()) return;};ml2_wla.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSchemaClass() {
    return doc.examdoc.Schema.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -615565657:
    return doc.examdoc.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
}
