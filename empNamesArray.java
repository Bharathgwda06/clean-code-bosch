/**
 * @author QWB1KOR
 */
public class Test {

  /**
   * @param args
   */
  public static void main(final String[] args) {
    List<String> empNames = Arrays.asList("Bharath", "Bosch", "sharath", "rahul");

    displayString(empNames);

  }

  /**
   * @param empNames List of  Names
   */
  private static void displayString(final List<String> empNames) {
    // prints the name starting with letter "B"
    empNames.stream().filter(emp -> emp.startsWith("B")).forEach(System.out::println);
  }

}
