package serv.dailyrecords.dailyrecord;

import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import serv.dailyrecords.dailyrecord.AbsencesProperty;
import serv.dailyrecords.dailyrecord.BusLineProperty;
import serv.dailyrecords.dailyrecord.DateProperty;
import serv.dailyrecords.dailyrecord.ManagerProperty;
import serv.dailyrecords.dailyrecord.SignatureProperty;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "ms3tapg";
    this._name = "serv.DailyRecords.DailyRecord";
    this._isAbstract = null;this._label = "Registro Diario";
    this.addDateFieldProperty(Date);
    this.addLinkFieldProperty(BusLine);
    this.addTextFieldProperty(Manager);
    this.addSectionFieldProperty(Absences);
    this.addTextFieldProperty(Signature);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty6 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty6.setIndex(new org.monet.metamodel.internal.Ref("serv.DailyRecords.Indice"));
    this.getMappingList().add(mappingProperty6);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty8 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty8.setLabel("Ficha");
    formViewProperty8.setCode("teaas");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty9 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Date","serv.DailyRecords.DailyRecord","serv.DailyRecords.DailyRecord.Date"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("BusLine","serv.DailyRecords.DailyRecord","serv.DailyRecords.DailyRecord.BusLine"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Manager","serv.DailyRecords.DailyRecord","serv.DailyRecords.DailyRecord.Manager"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Signature","serv.DailyRecords.DailyRecord","serv.DailyRecords.DailyRecord.Signature"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Absences","serv.DailyRecords.DailyRecord","serv.DailyRecords.DailyRecord.Absences"));
    formViewProperty8.setShow(showProperty9);
    this.addView(formViewProperty8);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.dailyrecords.dailyrecord.$Definition$.class,"serv.DailyRecords.DailyRecord",null);
  }
  }
  
  public static String static_getName() {
    return "DailyRecord";
  }
  
  public Class<?> getBehaviourClass() {
    return serv.dailyrecords.DailyRecord.class;
  }
  
  public String getClientBehaviour() {
    return "var ms3tapg = new Object();ms3tapg.refresh = function (node) {if (!node.isEditable()) return;};ms3tapg.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -832768778:
    return serv.dailyrecords.dailyrecord.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final DateProperty Date = new serv.dailyrecords.dailyrecord.DateProperty();
  
  private final BusLineProperty BusLine = new serv.dailyrecords.dailyrecord.BusLineProperty();
  
  private final ManagerProperty Manager = new serv.dailyrecords.dailyrecord.ManagerProperty();
  
  private final AbsencesProperty Absences = new serv.dailyrecords.dailyrecord.AbsencesProperty();
  
  private final SignatureProperty Signature = new serv.dailyrecords.dailyrecord.SignatureProperty();
}
