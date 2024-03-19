class Person{
   String name;
   int age;
   public void sayHello(){
      System.out.println("Hello," + name);
   }
  public void setName(String name){
  	this.name = name;
  }
  public String getName(String name){
  	return name;
  }
  public void setAge(int age){
  	this.age = age;
  }
  public int getAge(int age){
  	return age;
  }
}