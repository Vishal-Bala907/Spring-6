#To integrate your custom scope(s) into the Spring container, you need to implement the 	org.springframework.beans.factory.config.Scope interface. 
This Scope interface contains four methods,



- Object get(String name, ObjectFactory objectFactory)
- Object remove(String name)
- void registerDestructionCallback(String name, Runnable destructionCallback)
- String getConversationId()

## step 1: create custom bean scope class and extend **Scope** class  (CustomThreadScope)
	