import java.util.List;

public class Greeting implements Greeter{
	List<String> names;
	public void setNames(List<String> names){
		this.names = names;
	}
	
	public List getNames(){
		return names;
	}
	
	public String getGreeting(){
		return names.get(0);
		}
}
