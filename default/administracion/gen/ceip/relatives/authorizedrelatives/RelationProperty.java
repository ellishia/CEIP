package ceip.relatives.authorizedrelatives;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class RelationProperty extends SelectFieldProperty {
  public RelationProperty() {
    super();this._code = "mq25pag";
    this._name = "Relation";
    this._label = "Vínculo";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("ceip.shared.PersonalRelation"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Relation";
  }
}
