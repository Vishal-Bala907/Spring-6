
# How to configure using Java Code

	
## Basic Concepts: @Bean and @Configuration

##  The **@Bean** annotation is used to indicate that a method instantiates, configures, and initializes a new  object to be managed by the Spring IoC container.

## Annotating a class with **@Configuration** indicates that its primary purpose is as a source of bean  definitions. 

## To auto detect these classes and register the corresponding beans, you need to 	add **@ComponentScan** to your **@Configuration** class,
