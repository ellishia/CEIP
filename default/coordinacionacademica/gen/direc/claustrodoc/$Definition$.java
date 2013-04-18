package direc.claustrodoc;

import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasSchema;

@SuppressWarnings("all")
public class $Definition$ extends direc.documentocentro.$Definition$ implements HasBehaviour, HasClientBehaviour, HasSchema, HasMappings {
  public $Definition$() {
    super();this._code = "m6utwha";
    this._name = "direc.ClaustroDoc";
    this._parent = "direc.DocumentoCentro";
    this._isAbstract = null;this._label = "Convocatoria de Claustro";
    this._template = direc.Resources.Template.ClaustroDoc;
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.claustrodoc.$Definition$.class,"direc.ClaustroDoc","direc.DocumentoCentro");
  }
  }
  
  public static String static_getName() {
    return "ClaustroDoc";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.ClaustroDoc.class;
  }
  
  public String getClientBehaviour() {
    return "var m6utwha = new Object();m6utwha.refresh = function (node) {if (!node.isEditable()) return;};m6utwha.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSchemaClass() {
    return direc.claustrodoc.Schema.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
}
