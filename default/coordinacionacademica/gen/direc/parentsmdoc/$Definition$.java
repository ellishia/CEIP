package direc.parentsmdoc;

import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasSchema;

@SuppressWarnings("all")
public class $Definition$ extends direc.documentocentro.$Definition$ implements HasBehaviour, HasClientBehaviour, HasSchema, HasMappings {
  public $Definition$() {
    super();this._code = "ms9cs4q";
    this._name = "direc.ParentsMDoc";
    this._parent = "direc.DocumentoCentro";
    this._isAbstract = null;this._label = "Convocatoria de Reunión de Padres";
    this._template = direc.Resources.Template.ParentsMDoc;
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.parentsmdoc.$Definition$.class,"direc.ParentsMDoc","direc.DocumentoCentro");
  }
  }
  
  public static String static_getName() {
    return "ParentsMDoc";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.ParentsMDoc.class;
  }
  
  public String getClientBehaviour() {
    return "var ms9cs4q = new Object();ms9cs4q.refresh = function (node) {if (!node.isEditable()) return;};ms9cs4q.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSchemaClass() {
    return direc.parentsmdoc.Schema.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
}
