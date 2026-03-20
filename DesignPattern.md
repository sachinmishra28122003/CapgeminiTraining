# Design Pattern 
**SOLID PRINCIPLE**   Single Responsibility Open Closed, Liskov Substituion , Interface , Dependency Inversion 
---
## Sigleton Design Principle

TO make a single object of any class.
Like making a single object of a single class

```java
class MyApp {
  private MyApp app = null;
  private MyApp(){
    System.out.println("MyAPP");
  }
  public static MyApp get() {
      if(app == null) {
        app = new MyApp();
      }
      return app;
    }
}
```

//  Every time app will give same object ever called for gettinng app object.  


##  Design Pattern are divide into 3 types : 
- Creational  way to create the objects   while hirding login
- Structural  class and object  compositon and concept of inheritance and interfaces
- Behavioural working on behaviour 

## Factory Design Pattern 
Support we have different gateway of payment and we can configure any of them 
like we want payTm or billDesk thing we can do anything 

so  we make a factory class will make the object according to need 

---

Note - creating a new object is costly but copying it is cheaper

## Builder DesignPattern 
