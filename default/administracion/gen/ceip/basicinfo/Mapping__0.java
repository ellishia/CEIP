package ceip.basicinfo;

import ceip.BasicInfo;
import ceip.students.Index;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    ceip.BasicInfo node = (ceip.BasicInfo) this.genericGetNode();
    ceip.students.Index reference = (ceip.students.Index) this.genericGetReference();
    reference.setName(node.getName());
    reference.setSurname(node.getSurname());
    reference.setCial(node.getCial());
    
  }
  
  public Index getReference() {
    return (ceip.students.Index) this.genericGetReference();
  }
  
  public BasicInfo getNode() {
    return (ceip.BasicInfo) this.genericGetNode();
  }
}
