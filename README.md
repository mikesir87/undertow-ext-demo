1. Install the module jar file using module name folder structure under modules 
in the Wildfly installation.  e.g. modules/ceh/undertow/ext/main

2. Add a module.xml to the same folder with contents something like this:
```
<?xml version="1.0" encoding="UTF-8"?>
<module xmlns="urn:jboss:module:1.0" name="ceh.undertow.ext">

    <resources>
        <resource-root path="undertow-ext-impl-1.0.0-SNAPSHOT.jar" />
    </resources>

    <dependencies>
        <module name="io.undertow.servlet"/>
        <module name="javax.servlet.api"/>
    </dependencies>

</module>
```
