package InterfacesAndAbstraction_Exercises.MultipleImplementation;

public interface Person extends Identifiable, Birthable {
    String getName();
    int getAge();
}
