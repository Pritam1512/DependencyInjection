Commit 1. @Components 

Components are the central mechanism for DI. 
It act as a bridge between "Moduels" and the classes which needs those modules.

It's an interface which defines methods to get the object while runtime. 


Commit 2. @Inject

Field Injection

If we need 50 objects from component, we cannot define one separate method inside @Component for each objects.
Hence we use Field injection using @Inject

eg: @Inject
    lateinit var someObject: SomeObject


and we have to define inject(className: ClassName) method inside components to inject the class(consumer) to @Components
and call it from consumer class. 

DaggerComponent().builder().build().inject(this)


Commit 3. Reason for @Provider approach

What if we want to inject methos which needs arguments within it's constructor. We cannot use @Inject constructor(). 
We have to use Factory/Provider

