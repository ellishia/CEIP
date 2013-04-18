package ceip.relatives;

import ceip.relatives.AuthorizedRelativesProperty;
import ceip.relatives.ParentProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mttvylq";
    this._name = "ceip.Relatives";
    this._isAbstract = null;this._label = "Familiares";
    this.setIsComponent(true);
    this.addSectionFieldProperty(Parent);
    this.addSectionFieldProperty(AuthorizedRelatives);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty4 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty4.setLabel("Tutores");
    formViewProperty4.setCode("mrutlga");
    formViewProperty4.setIsDefault(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty6.getField().add(new org.monet.metamodel.internal.Ref("Parent","ceip.Relatives","ceip.Relatives.Parent"));
    formViewProperty4.setShow(showProperty6);
    this.addView(formViewProperty4);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty9 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty9.setLabel("Datos de tutores");
    formViewProperty9.setCode("m0hc6va");
    formViewProperty9.setName("Vista2");
    formViewProperty9.setIsWidget(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty11 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Parent","ceip.Relatives","ceip.Relatives.Parent"));
    formViewProperty9.setShow(showProperty11);
    this.addView(formViewProperty9);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty14 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty14.setCode("mzfknwa");
    formViewProperty14.setName("RelativesView");
    formViewProperty14.setIsWidget(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty15 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("AuthorizedRelatives","ceip.Relatives","ceip.Relatives.AuthorizedRelatives"));
    formViewProperty14.setShow(showProperty15);
    this.addView(formViewProperty14);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.relatives.$Definition$.class,"ceip.Relatives",null);
  }
  }
  
  public static String static_getName() {
    return "Relatives";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.Relatives.class;
  }
  
  public String getClientBehaviour() {
    return "var mttvylq = new Object();mttvylq.refresh = function (node) {if (!node.isEditable()) return;};mttvylq.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final ParentProperty Parent = new ceip.relatives.ParentProperty();
  
  private final AuthorizedRelativesProperty AuthorizedRelatives = new ceip.relatives.AuthorizedRelativesProperty();
}
