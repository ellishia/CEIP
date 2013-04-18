package doc.subjectlevels.subjectlevel;

import doc.subjectlevels.subjectlevel.AsignaturaProperty;
import doc.subjectlevels.subjectlevel.ExamsProperty;
import doc.subjectlevels.subjectlevel.GradeProperty;
import doc.subjectlevels.subjectlevel.IdentifierProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasProperties;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasProperties, HasMappings {
  public $Definition$() {
    super();this._code = "mgkdizq";
    this._name = "doc.SubjectLevels.SubjectLevel";
    this._isAbstract = null;this._label = "Asignatura y Curso";
    this.addLinkFieldProperty(Asignatura);
    this.addSelectFieldProperty(Grade);
    this.addLinkFieldProperty(Exams);
    this.addSerialFieldProperty(Identifier);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty5 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty5.setIndex(new org.monet.metamodel.internal.Ref("doc.SubjectLevels.Indice"));
    this.getMappingList().add(mappingProperty5);
    org.monet.metamodel.FormDefinition.PropertiesProperty propertiesProperty8 = new org.monet.metamodel.FormDefinition.PropertiesProperty();
    this.setProperties(propertiesProperty8);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty10 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty10.setLabel("Especificación de Asignatura");
    formViewProperty10.setCode("mu0lnya");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty11 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Asignatura","doc.SubjectLevels.SubjectLevel","doc.SubjectLevels.SubjectLevel.Asignatura"));
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Grade","doc.SubjectLevels.SubjectLevel","doc.SubjectLevels.SubjectLevel.Grade"));
    formViewProperty10.setShow(showProperty11);
    this.addView(formViewProperty10);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty15 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty15.setLabel("Examenes");
    formViewProperty15.setCode("m2t_rqa");
    formViewProperty15.setName("ExamView");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty16 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty.LinksInProperty linksInProperty16 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty.LinksInProperty();
    linksInProperty16.getNode().add(new org.monet.metamodel.internal.Ref("doc.Exams.Exam"));
    showProperty16.setLinksIn(linksInProperty16);
    formViewProperty15.setShow(showProperty16);
    this.addView(formViewProperty15);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.subjectlevels.subjectlevel.$Definition$.class,"doc.SubjectLevels.SubjectLevel",null);
  }
  }
  
  public static String static_getName() {
    return "SubjectLevel";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.subjectlevels.SubjectLevel.class;
  }
  
  public String getClientBehaviour() {
    return "var mgkdizq = new Object();mgkdizq.refresh = function (node) {if (!node.isEditable()) return;};mgkdizq.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getPropertiesClass() {
    return doc.subjectlevels.subjectlevel.$Properties$.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -457877089:
    return doc.subjectlevels.subjectlevel.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final AsignaturaProperty Asignatura = new doc.subjectlevels.subjectlevel.AsignaturaProperty();
  
  private final GradeProperty Grade = new doc.subjectlevels.subjectlevel.GradeProperty();
  
  private final ExamsProperty Exams = new doc.subjectlevels.subjectlevel.ExamsProperty();
  
  private final IdentifierProperty Identifier = new doc.subjectlevels.subjectlevel.IdentifierProperty();
}
