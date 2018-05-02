import java.util.ArrayList;
import java.util.List;

public class Invoker {
	private List<Command> commandList=new ArrayList<Command>();
	
	public void setCommand(Command command) {
		commandList.add(command);
	}
	
	public void placeCommand() {
		for(Command command:commandList) {
			command.execute();
		}
		commandList.clear();
	}
	
	public void undoCommand() {
		for(Command command:commandList) {
			command.undo();
		}
		commandList.clear();
	}
}
