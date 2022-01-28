import java.util.Scanner;

class ShopSimulation extends Simulation {
  private final Customer[] customers;
  private final int numOfCounters;
  private final int numOfCustomers;

  public ShopSimulation(Scanner sc) {
    numOfCustomers = sc.nextInt();
    customers = new Customer[numOfCustomers];
    numOfCounters = sc.nextInt();

    for (int i = 0; i < numOfCustomers; i++)
      customers[i] = new Customer(i, sc.nextDouble(), sc.nextDouble());
  }

  @Override
  public Event[] getInitialEvents() {
    Counter[] counters = new Counter[numOfCounters];
    for (int i = 0; i < numOfCounters; i++)
      counters[i] = new Counter(i);
    
    Event[] initEvents = new Event[numOfCustomers];
    for (int i = 0; i < numOfCustomers; i++)
      initEvents[i] = new ArrivalEvent(
          counters,
          customers[i]
      );

    return initEvents;
  }
}
