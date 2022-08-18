- Before declaring bean in spring.xml file.

  Doctor doctor = context.getBean(Doctor.class).

  it will raise:

  `Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException:
  No qualifying bean of type 'com.spring.model.Doctor' available`

- After adding

  `<bean name="doctor" id="doctor" class="com.spring.model.Doctor"></bean>`

  it would print <i>"Doctor is Assisting"</i> as expected.

  The control is delegated to the IOC container i.e Spring will create and instantiate object of Doctor class
  and give us the object reference whenever requested by context.getBean(<class-name>.class) Method.
  
## Dependency Injection

- ### Constructor & Setter Injection.
  `<bean name="doctor" id="doctor" class="com.spring.model.Doctor">
  <property name="qualification" value="MBS"></property>
  <constructor-arg value="101"></constructor-arg>
  <constructor-arg value="Sameer"></constructor-arg>
  </bean>`
  
  Explanation:
  - <b>`<constructor-arg>`</b> values are injected using parameterised constructor, so it needs to be defined before we can use it.
    Similarly, <b> `<property>` </b> tag values are injected through Setter methods.