package solicitud.relatives;

import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import solicitud.relatives.AuthorizedRelativesProperty;
import solicitud.relatives.ParentProperty;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mttvylq";
    this._name = "solicitud.Relatives";
    this._isAbstract = null;this.setIsComponent(true);
    this._label = "Familiares";
    this.addSectionFieldProperty(Parent);
    this.addSectionFieldProperty(AuthorizedRelatives);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty4 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty4.setLabel("Tutores");
    formViewProperty4.setCode("mrutlga");
    formViewProperty4.setIsDefault(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty6.getField().add(new org.monet.metamodel.internal.Ref("Parent","solicitud.Relatives","solicitud.Relatives.Parent"));
    formViewProperty4.setShow(showProperty6);
    this.addView(formViewProperty4);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty9 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty9.setLabel("Datos de tutores");
    formViewProperty9.setCode("m0hc6va");
    formViewProperty9.setName("Vista2");
    formViewProperty9.setIsWidget(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty11 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Parent","solicitud.Relatives","solicitud.Relatives.Parent"));
    formViewProperty9.setShow(showProperty11);
    this.addView(formViewProperty9);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty14 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty14.setCode("mzfknwa");
    formViewProperty14.setName("RelativesView");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty14 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty14.getField().add(new org.monet.metamodel.internal.Ref("AuthorizedRelatives","solicitud.Relatives","solicitud.Relatives.AuthorizedRelatives"));
    formViewProperty14.setShow(showProperty14);
    this.addView(formViewProperty14);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.relatives.$Definition$.class,"solicitud.Relatives",null);
  }
  }
  
  public static String static_getName() {
    return "Relatives";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.Relatives.class;
  }
  
  public String getClientBehaviour() {
    return "var mttvylq = new Object();mttvylq.refresh = function (node) {if (!node.isEditable()) return;};mttvylq.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final ParentProperty Parent = new solicitud.relatives.ParentProperty();
  
  private final AuthorizedRelativesProperty AuthorizedRelatives = new solicitud.relatives.AuthorizedRelativesProperty();
}
