package cars;
import
public class CarFactory {
public static Model CreateFactory(ModelNames name) {
	Model d = null;
	    
	    if (name == null)
	      return null;
	    
	    switch(name)
	    {
	      case FORD:
	        d = new Ford();
	        break;
	      case HONDA:
	        d = new Honda();
	        break;
	      case TOYOTA:
	        d = new Toyata();
	        break;
	      default:
	        // no op
	    }
	    return d; 
}
}
