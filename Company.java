public abstract class Company {
  private String name;

  public Company(String name) {
    this.name = name;
  }

  public abstract void oneYear();

  @Override
  public String toString() {
    return this.name;
  }
}
