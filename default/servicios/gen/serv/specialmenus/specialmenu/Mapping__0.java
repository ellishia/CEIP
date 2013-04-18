package serv.specialmenus.specialmenu;

import org.monet.bpi.java.MappingImpl;
import serv.specialmenus.Indice;
import serv.specialmenus.SpecialMenu;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    serv.specialmenus.SpecialMenu node = (serv.specialmenus.SpecialMenu) this.genericGetNode();
    serv.specialmenus.Indice reference = (serv.specialmenus.Indice) this.genericGetReference();
    reference.setSuitable(node.getSuitable());
    reference.setIdentifier(node.getIdentifier());
    
  }
  
  public Indice getReference() {
    return (serv.specialmenus.Indice) this.genericGetReference();
  }
  
  public SpecialMenu getNode() {
    return (serv.specialmenus.SpecialMenu) this.genericGetNode();
  }
}
