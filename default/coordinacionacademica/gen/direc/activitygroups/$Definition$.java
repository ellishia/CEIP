package direc.activitygroups;

import direc.activitygroups.GroupsProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "m_nqm9g";
    this._name = "direc.ActivityGroups";
    this._isAbstract = null;this._label = "Grupos participantes";
    this.addLinkFieldProperty(Groups);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty2 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty2.setLabel("Grupos");
    formViewProperty2.setCode("mksm0_a");
    formViewProperty2.setName("View");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty3 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty3.getField().add(new org.monet.metamodel.internal.Ref("Groups","direc.ActivityGroups","direc.ActivityGroups.Groups"));
    formViewProperty2.setShow(showProperty3);
    this.addView(formViewProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.activitygroups.$Definition$.class,"direc.ActivityGroups",null);
  }
  }
  
  public static String static_getName() {
    return "ActivityGroups";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.ActivityGroups.class;
  }
  
  public String getClientBehaviour() {
    return "var m_nqm9g = new Object();m_nqm9g.refresh = function (node) {if (!node.isEditable()) return;};m_nqm9g.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final GroupsProperty Groups = new direc.activitygroups.GroupsProperty();
}
