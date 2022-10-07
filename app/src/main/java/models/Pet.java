package models;

public class Pet {

  private int id;
  private String name;
  private int age;
  private String gender;
  private boolean status;

  public Pet() {
  }

  public Pet(int id, String name, int age, String gender, boolean status) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.status = status;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }
}
