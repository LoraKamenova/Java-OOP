package Reflection_Exercises.BarracksWarsANewFactory.contracts;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
