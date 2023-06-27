public abstract class BatchBase {

  public void execute() {
    start();
    process();
    end();
  }

  public void start() {
    System.out.println("----- start -----");
  }

  public abstract void process();

  public void end() {
    System.out.println("----- end -----");
  }
}