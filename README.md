# Effective Java

### 1. Consider static factory methods instead of constructors

* Static factory method is not the same thing as the Factory Method pattern
from Design Patterns book
* Factory methods can have custom names
  * `BigInteger.probablePrime`
* Can reuse objects
  * instance caching
  * flyweight pattern
* Instance control
  * singleton
  * prohibit instantiation
  * use `==` instead of `.equals` for performance
    * enum types
* Interface-based frameworks
  * only interfaces are public
  * all implementations are hidden (private)
  * reduce amount of API
  * usually kept in class which name is plural (`Collections`, `Maps`, `Sets`)
  * `java.util.Collections`
  * `java.util.EnumSet`
    * `java.util.EnumSet.noneOf`
    * `JumboEnumSet`
    * `RegularEnumSet`
* Reduce verbosity of parametrized types
  * `Map<String, List<String>> m = new HashMap<String, List<String>>();`
  * `com.google.common.collect.Maps.newHashMap()`
* Proposed names
  * `valueOf` - same values, type conversion
  * `of` - shorter form, from `EnumSet`
  * `getInstance`
    * not necessarily the same value
    * used also for singletons if no parameters
  * `newInstance` guarantees new object creation
  * `get/Type/`
    * indicates type
    * `java.lang.Runtime.getRuntime`
  * `new/Type/`
    * always new instance
    * `java.util.concurrent.Executors.newSingleThreadExecutor()`
