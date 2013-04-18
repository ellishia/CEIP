package serv.specialmenus.specialmenu;

import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import serv.specialmenus.specialmenu.DessertProperty;
import serv.specialmenus.specialmenu.FirstCourseProperty;
import serv.specialmenus.specialmenu.IdentifierProperty;
import serv.specialmenus.specialmenu.MainCourseProperty;
import serv.specialmenus.specialmenu.SuitableProperty;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "ms3tapg";
    this._name = "serv.SpecialMenus.SpecialMenu";
    this._isAbstract = null;this._label = "Menu";
    this.addTextFieldProperty(FirstCourse);
    this.addTextFieldProperty(MainCourse);
    this.addTextFieldProperty(Dessert);
    this.addTextFieldProperty(Suitable);
    this.addSerialFieldProperty(Identifier);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty6 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty6.setIndex(new org.monet.metamodel.internal.Ref("serv.SpecialMenus.Indice"));
    this.getMappingList().add(mappingProperty6);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty8 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty8.setLabel("Ficha");
    formViewProperty8.setCode("teaas");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty9 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("FirstCourse","serv.SpecialMenus.SpecialMenu","serv.SpecialMenus.SpecialMenu.FirstCourse"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("MainCourse","serv.SpecialMenus.SpecialMenu","serv.SpecialMenus.SpecialMenu.MainCourse"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Dessert","serv.SpecialMenus.SpecialMenu","serv.SpecialMenus.SpecialMenu.Dessert"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Suitable","serv.SpecialMenus.SpecialMenu","serv.SpecialMenus.SpecialMenu.Suitable"));
    formViewProperty8.setShow(showProperty9);
    this.addView(formViewProperty8);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.specialmenus.specialmenu.$Definition$.class,"serv.SpecialMenus.SpecialMenu",null);
  }
  }
  
  public static String static_getName() {
    return "SpecialMenu";
  }
  
  public Class<?> getBehaviourClass() {
    return serv.specialmenus.SpecialMenu.class;
  }
  
  public String getClientBehaviour() {
    return "var ms3tapg = new Object();ms3tapg.refresh = function (node) {if (!node.isEditable()) return;};ms3tapg.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -832768778:
    return serv.specialmenus.specialmenu.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final FirstCourseProperty FirstCourse = new serv.specialmenus.specialmenu.FirstCourseProperty();
  
  private final MainCourseProperty MainCourse = new serv.specialmenus.specialmenu.MainCourseProperty();
  
  private final DessertProperty Dessert = new serv.specialmenus.specialmenu.DessertProperty();
  
  private final SuitableProperty Suitable = new serv.specialmenus.specialmenu.SuitableProperty();
  
  private final IdentifierProperty Identifier = new serv.specialmenus.specialmenu.IdentifierProperty();
}
