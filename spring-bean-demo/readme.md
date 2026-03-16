# SpringBoot Beans(Making)

## First Method to make beans using component annotations

- firstly created a Calc Interface and implemented it in Implement Calc Class

@Component annotation used in class ImplementCalc


# in Memory  :
- The beans are stored in a HashMap "names" in Beans annotation or constructor will be in 
keys

- and oject refrences are the values 
- hence if we make multiple one then beans will not be created multiple times
- We need to change bean names for making multiple objects of same class


## Scope are 

- prototype for multiple objects 

=>
This is only for WebAnnotationConext 
- request // for web request creates new obj
- session // for new Session creates new obj
- application //for new application creates new obj

#Annotations
- @Component  create it as a bean or component for a bean 
- @Primary   Set the class or bean configuration as primary of making 
- @Autowired create the dependent Objects =>   can be  done for a constructor and property
- @PostConstructor run commands after constructor is called 
- @PreDestroy run some command  before destroying some objects
- @Qualifiers resolve ambiguity when the Dependency Injection (DI) container finds multiple beans of the same type available for autowiring


## Bean Life cycle
- instantiate the object creation 
- inject the dependency 
- post constructor 
- preDestroy
- destroy



## Autowiring
Injecting the dependent object to needed class
can be done through 3 steps
- constructor
- property
- setters

can also be done through xml 

* injecting myRepo to myService at time of creation 

# Code
```xml
<bean id = "myRepo" class = "com.gal.jdbcRepo"/>
- <bean id = "myService" class"com.gal.reportService">
- <property name = "repository" ref ="MyRepo"/></bean>```
