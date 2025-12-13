Spring Framework Annotations – Detailed Notes
<details> <summary><strong>@Component</strong></summary>

Marks a class as a Spring-managed component (bean).

Automatically detected through component scanning.

</details>
<details> <summary><strong>@Autowired</strong></summary>

Injects a bean automatically from the Spring IoC container.

</details>
<details> <summary><strong>@Qualifier</strong></summary>

Used when multiple beans implement the same interface.

Helps avoid ambiguity by specifying which bean to inject.

</details>
<details> <summary><strong>@Primary</strong></summary>

Gives higher preference to a bean when multiple beans of the same type exist.

Acts as an alternative to using @Qualifier.

</details>
<details> <summary><strong>@Bean</strong></summary>

Indicates that a method produces a bean managed by the Spring container.

Typically used inside @Configuration classes.

Default bean name = method name.

Custom bean name example:

@Bean(name = "beanName")


Supports lifecycle hooks:

initMethod: run before initialization

destroyMethod: run before destruction

</details>
Stereotype Annotations
<details> <summary><strong>Main Stereotype: @Component</strong></summary>

Parent stereotype used for automatic bean registration.

</details>
<details> <summary><strong>@Service</strong></summary>

Used to create a Spring bean at the service layer.

</details>
<details> <summary><strong>@Repository</strong></summary>

Used to create a Spring bean at the DAO layer.

Also applies exception translation.

</details>
<details> <summary><strong>@Controller</strong></summary>

Used to create a Spring bean at the controller layer.

Handles incoming HTTP requests.

Specialized form of @Component enabling auto detection.

</details>
<details> <summary><strong>@Lazy</strong></summary>

Spring eagerly creates all singleton beans at startup.

@Lazy loads beans only when needed.

Can be used with:

@Configuration

@Component

@Bean

</details>
<details> <summary><strong>@Scope</strong></summary>
Supported Scopes:

Singleton

Prototype

Request

Session

Application

WebSocket

Notes:

Last four scopes apply only to web-aware applications.

Default scope = Singleton.

@Scope is used to define the lifecycle and visibility of a bean.

Behavior:

Singleton: one shared instance across the application

Prototype: new instance every time it's requested

</details>
<details> <summary><strong>@Value</strong></summary>

Assigns default values to fields or method arguments.

Used to retrieve:

Property values

Environment variables

System variables

</details>
<details> <summary><strong>@PropertySource & @PropertySources</strong></summary>

@PropertySource: loads a single properties file into the Spring Environment.

@PropertySources: loads multiple property files.

Typically used with @Configuration classes.

</details>
<details> <summary><strong>@Controller (Detailed)</strong></summary>

Marks a class as a Spring MVC controller.

Handles incoming HTTP requests.

Specialized form of @Component enabling automatic scanning.

Works with mapping annotations such as @RequestMapping.

</details>
