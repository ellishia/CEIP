package direc.activityfile;

import direc.activityfile.DescriptionProperty;
import direc.activityfile.EducationalValuesProperty;
import direc.activityfile.EndDateProperty;
import direc.activityfile.NameProperty;
import direc.activityfile.StartDateProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "muz9b0a";
    this._name = "direc.ActivityFile";
    this._isAbstract = null;this._label = "Ficha de la Actividad";
    this.setIsComponent(true);
    this.addDateFieldProperty(StartDate);
    this.addDateFieldProperty(EndDate);
    this.addTextFieldProperty(Description);
    this.addTextFieldProperty(Name);
    this.addTextFieldProperty(EducationalValues);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty7 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty7.setIndex(new org.monet.metamodel.internal.Ref("direc.Activities.Indice"));
    this.getMappingList().add(mappingProperty7);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty9 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty9.setLabel("Ficha");
    formViewProperty9.setCode("mvqpq2q");
    formViewProperty9.setName("View");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty10 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("Name","direc.ActivityFile","direc.ActivityFile.Name"));
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("StartDate","direc.ActivityFile","direc.ActivityFile.StartDate"));
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("EndDate","direc.ActivityFile","direc.ActivityFile.EndDate"));
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("Description","direc.ActivityFile","direc.ActivityFile.Description"));
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("EducationalValues","direc.ActivityFile","direc.ActivityFile.EducationalValues"));
    formViewProperty9.setShow(showProperty10);
    this.addView(formViewProperty9);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.activityfile.$Definition$.class,"direc.ActivityFile",null);
  }
  }
  
  public static String static_getName() {
    return "ActivityFile";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.ActivityFile.class;
  }
  
  public String getClientBehaviour() {
    return "var muz9b0a = new Object();muz9b0a.refresh = function (node) {if (!node.isEditable()) return;};muz9b0a.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case 976237007:
    return direc.activityfile.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final StartDateProperty StartDate = new direc.activityfile.StartDateProperty();
  
  private final EndDateProperty EndDate = new direc.activityfile.EndDateProperty();
  
  private final DescriptionProperty Description = new direc.activityfile.DescriptionProperty();
  
  private final NameProperty Name = new direc.activityfile.NameProperty();
  
  private final EducationalValuesProperty EducationalValues = new direc.activityfile.EducationalValuesProperty();
}
