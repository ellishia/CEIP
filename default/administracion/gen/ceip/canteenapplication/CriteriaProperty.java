package ceip.canteenapplication;

import ceip.canteenapplication.criteria.AnualIncomeProperty;
import ceip.canteenapplication.criteria.HandcapedProperty;
import ceip.canteenapplication.criteria.MonoParentalorNumberusFamilyProperty;
import ceip.canteenapplication.criteria.ParentsInSchoolProperty;
import ceip.canteenapplication.criteria.SiblingsProperty;
import ceip.canteenapplication.criteria.WorkingPersonalLifeProperty;
import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;

@SuppressWarnings("all")
public class CriteriaProperty extends SectionFieldProperty implements HasBehaviour {
  public CriteriaProperty() {
    super();this._code = "mchengw";
    this._name = "Criteria";
    this._label = "Criterios";
    this.addBooleanFieldProperty(WorkingPersonalLife);
    this.addBooleanFieldProperty(Siblings);
    this.addBooleanFieldProperty(ParentsInSchool);
    this.addBooleanFieldProperty(AnualIncome);
    this.addBooleanFieldProperty(Handcaped);
    this.addBooleanFieldProperty(MonoParentalorNumberusFamily);
    
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.canteenapplication.Criteria.class;
  }
  
  public static String static_getName() {
    return "Criteria";
  }
  
  private final WorkingPersonalLifeProperty WorkingPersonalLife = new ceip.canteenapplication.criteria.WorkingPersonalLifeProperty();
  
  private final SiblingsProperty Siblings = new ceip.canteenapplication.criteria.SiblingsProperty();
  
  private final ParentsInSchoolProperty ParentsInSchool = new ceip.canteenapplication.criteria.ParentsInSchoolProperty();
  
  private final AnualIncomeProperty AnualIncome = new ceip.canteenapplication.criteria.AnualIncomeProperty();
  
  private final HandcapedProperty Handcaped = new ceip.canteenapplication.criteria.HandcapedProperty();
  
  private final MonoParentalorNumberusFamilyProperty MonoParentalorNumberusFamily = new ceip.canteenapplication.criteria.MonoParentalorNumberusFamilyProperty();
}
