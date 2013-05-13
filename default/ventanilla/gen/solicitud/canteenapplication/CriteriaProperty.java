package solicitud.canteenapplication;

import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;
import solicitud.canteenapplication.criteria.AnualIncomeProperty;
import solicitud.canteenapplication.criteria.HandicapedProperty;
import solicitud.canteenapplication.criteria.MonoParentalorNumberusFamilyProperty;
import solicitud.canteenapplication.criteria.ParentsInSchoolProperty;
import solicitud.canteenapplication.criteria.SiblingsProperty;
import solicitud.canteenapplication.criteria.WorkingPersonalLifeProperty;

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
    this.addBooleanFieldProperty(Handicaped);
    this.addBooleanFieldProperty(MonoParentalorNumberusFamily);
    
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.canteenapplication.Criteria.class;
  }
  
  public static String static_getName() {
    return "Criteria";
  }
  
  private final WorkingPersonalLifeProperty WorkingPersonalLife = new solicitud.canteenapplication.criteria.WorkingPersonalLifeProperty();
  
  private final SiblingsProperty Siblings = new solicitud.canteenapplication.criteria.SiblingsProperty();
  
  private final ParentsInSchoolProperty ParentsInSchool = new solicitud.canteenapplication.criteria.ParentsInSchoolProperty();
  
  private final AnualIncomeProperty AnualIncome = new solicitud.canteenapplication.criteria.AnualIncomeProperty();
  
  private final HandicapedProperty Handicaped = new solicitud.canteenapplication.criteria.HandicapedProperty();
  
  private final MonoParentalorNumberusFamilyProperty MonoParentalorNumberusFamily = new solicitud.canteenapplication.criteria.MonoParentalorNumberusFamilyProperty();
}
