# SpringEventListners
This Project will be showing how to invoke the Spring Event Listeners in Sync and Async ways

<b>Dependency Jars</b></br>
aopalliance-1.0.jar</br>
commons-beanutils-1.9.2.jar</br>
commons-beanutils-core-1.8.3.jar</br>
commons-codec-1.9.jar</br>
commons-lang-2.6.jar</br>
commons-logging-1.2.jar</br>
dom4j-1.6.1.jar</br>
log4j-1.2.17.jar</br>
slf4j-api-1.7.7.jar</br>
slf4j-log4j12-1.7.7.jar</br>
spring-aop-4.2.8.RELEASE.jar</br>
spring-beans-4.2.8.RELEASE.jar</br>
spring-boot-1.2.3.RELEASE.jar</br>
spring-boot-1.4.2.RELEASE.jar</br>
spring-boot-autoconfigure-1.2.7.RELEASE.jar</br>
spring-boot-test-1.4.2.RELEASE.jar</br>
spring-context-4.2.8.RELEASE.jar</br>
spring-core-4.2.8.RELEASE.jar</br>
spring-expression-4.2.8.RELEASE.jar</br>
spring-test-4.3.0.RELEASE.jar</br>
spring-tx-4.2.6.RELEASE.jar</br>

<b>AsyncConfiguration</b></br>
Here we are configuring about the async thread configuration with initial count</br>
</br></br>
<b>How to define the class as Async</b></br>
By setting the <i>@Async<i> at the EventListner method level that class will become a Async class and will be running on the</br>
different thread .i.e, whatever the thread we are configured in the <i>AsyncConfiguration</i></br>

<b>@EventListener</b></br>
This is the annation which needs to be used instead of implementing the <i>ApplicationListener</i></br>
put the <i>@EventListener</i> in the method level in the Listner class . 
