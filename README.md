# Lenguajes-de-Programacipppon
Materia segundo semestre USBBOG 2020

## Walter Alturo Aparicio
I am a student of Software Development in the second semester, and in this workspace I will upload the works that are necessary as university jobs of Programming languages subject and other subjects, and also as CV just in case. 
I have done some projects with my colleagues that I will also upload, among them is an application for a dentistry, and a pet nursery.

![app petN](https://github.com/WalterAlturoaAparicio/Lenguajes-de-Programacion/blob/master/PetNursery/src/Recurso/Pikachu.png)

- <a href="https://github.com/WalterAlturoaAparicio/Lenguajes-de-Programacion/tree/master/PetStore" target="_blank">Pet nursery</a> 

![Logo fruithz](https://github.com/WalterAlturoaAparicio/Lenguajes-de-Programacion/blob/master/Proyecto1/src/Imagenes/logoFrui.jpg)
- <a href="https://github.com/WalterAlturoaAparicio/Lenguajes-de-Programacion/tree/master/Proyecto1" target="_blank">fruithz (dentistry application)</a> 

#### 1. Descripción del Problema

En la mayoría de las odontologías se lleva el control de las citas de los pacientes en forma física, por lo general estos controles se llevan en una carpeta donde se anexan todos los registros con sus radiografías y otras cosas; cuando la clínica odontológica tiene varios pacientes se emplea un cuarto grande donde se ponen estantes con separadores, en los cuales se ubican las carpetas de las personas separadas por las iniciales de su nombre.

El trabajo de buscar, modificar, añadir o borrar algún elemento de las carpetas de los pacientes, es de los auxiliares, por lo general hay varios de ellos trabajando, al haber mucho trafico de personas moviendo y buscando la carpeta necesaria, sean presentado muchas veces perdida de información de la carpeta, o, se modifica la carpeta que no era la requerida, ya que otro auxiliar no se percató del orden correcto de los separadores, finalmente todo esto perjudica tanto al cliente como al odontólogo y a la clínica odontológica.

##### 1.2 Solución al Problema

Se desarrollará una aplicación que pueda tener la opción de facilitar el proceso de almacenamiento, consulta y editar de las carpetas de cada uno de los pacientes, esta aplicación facilitará considerablemente la búsqueda de las carpetas, de igual forma, a que se evite la perdida o confusión de información de esta misma.

### 2. Desarrollo de Prototipo

#### 2.1. Identificación de Stakeholder

|Nombre|Representa a|Responsabilidad|
---------------:|:---------------:|:---------------
|Empresario Odontología | Gerente, dueño, personas encargada de la clínica odontológica | Revisar información de todos sus empleados, carpetas y clientes. Crear, eliminar, editar y actualizar, carpetas y empleados|
| Trabajador |Odontólogos y auxiliares de odontología |Consultar, actualizar y editar información de clientes y de sus carpetas. Crear y editar clientes|
|Cliente|Persona que ya tiene un servicio con la clínica odontológica |Entregar información personal y necesaria a Trabajadores o Empresarios para poder ser atendido.|
|Desarrollador|Desarrolladores de Software|Debe realizar los prototipos necesarios para desarrollar la aplicación |

#### 2.2 Perfiles de Stakeholders

##### Empresario Odontología

|||
---------------|---------------
|Nombre|Gerente, dueño o persona encargada de la clínica odontológica.|
|Descripción|Garantiza y revisa que todos los procesos dentro de la empresa se están llevando de la forma correcta.|
|Responsabilidad|Revisar información de todos sus empleados, carpetas y clientes. Crear, eliminar, editar y actualizar, carpetas y empleados.|

##### Trabajador

|||
---------------|--------------- 
|Nombre|Odontólogo|
|Descripción|Se encarga de realizar los procesos dentales a los pacientes, de crear, editar pacientes y carpetas en la aplicación.|
|Responsabilidad|Consultar, actualizar y editar información de clientes y de sus carpetas. Crear y editar clientes.|

|||
---------------|---------------
|Nombre|Auxiliar de Odontología|
|Descripción|Se encarga de prestar servicio al cliente, del manejo de materiales y ayudante del odontólogo.Puede crear, editar pacientes y carpetas en la aplicación. |
|Responsabilidad|Consultar, actualizar y editar información de clientes y de sus carpetas. Crear y editar clientes.|


##### Cliente

|||
---------------|---------------
|Nombre|Persona que ya tiene un servicio con la clínica odontológica.|
|Descripción|Toda persona que desea adquirir un servicio de la clínica odontológica.|
|Responsabilidad|Entregar información personal y necesaria a Trabajadores o Empresarios para poder ser atendido.|

##### Desarrollador

|||
---------------|---------------
|Nombre	|Walter Alturo Aparício – Diego Andrés Alfonso Pérez|
|Descripción|Encargados de crear la interfaz grafica y documentación de la aplicación|
|Responsabilidad|Debe realizar los prototipos necesarios para desarrollar la aplicación|

#### 2.3. Requerimientos Funcionales del Sistema
|||
---------------|---------------
|RF-01|
|Nombre:|Crear Usuarios|
|Descripción:|El sistema debe permitir la creación de clientes, con todos los datos personales necesarios.|
|RF-02|
|Nombre:|Modificar Usuarios|
|Descripción:|El sistema debe permitir la modificación de cualquier dato de los clientes ya creados|
|RF-03|
|Nombre:|Eliminar Usuarios|
|Descripción:|El sistema debe permitir la eliminación de cualquier cliente ya creado|
 |RF-04|
|Nombre:|Ingresar al sistema|
|Descripción:|La aplicación debe solicitar un usuario y contraseña para permitir el ingreso a la aplicación y sus diferentes funcionalidades.|
|RF-05|
|Nombre:|Seleccionar Tipo de usuario a ver en tabla|
|Descripción:|Dentro del sistema, dependiendo el Rol del usuario, podrá seleccionar que usuarios desea observar, únicamente podrán hacer esto el empresario y el trabajador (ej. Un odontólogo puede observar una tabla con todos los pacientes que tenga)|

#### 2.4. Requerimientos No Funcionales de Sistema
|||
---------------|---------------
|RNF-01|
|Característica:|Concurrencia|
|Descripción:|Se debe poder usar en distintas máquinas|
|Prioridad:|Alta|
|RNF-02|
|Característica:|Usabilidad|
|Descripción:|Debe tener una interfaz gráfica lo suficientemente clara para ser usada con sencillez|
|Prioridad:|Alta|
|RNF-03|
|Característica:|Eficiencia|
|Descripción:|Debe proporcionar un desempeño optimo|
|Prioridad:|Alta|
|RNF-04|
|Característica:|Funcionalidad|
|Descripción:|Para que funcione la aplicación de la forma correcta se debe tener la información necesaria|
|Prioridad:|Alta|
|RNF-05|
|Característica:|Eficiencia|
|Descripción:|La aplicación debe ser capaz de operar adecuadamente con muchos usuarios a la vez|
|Prioridad:|Baja|

#### 2.5. Casos de Uso Requerimientos Funcionales del Sistema

|||
---------------|---------------
|RF-01| 
|Nombre:|Crear Usuarios| 
|Entrada:|Tendrá un formulario con los siguientes campos: Nombres, primer apellido, segundo apellido, cedula, numero de contacto, dirección de domicilio, correo electrónico, contraseña y repetir contraseña| 
|Salida:|Si el usuario no está creado, se mostrará un cuadro de aceptación, los datos se insertan en la base de datos. Si los datos ya existen o están en la base de datos, se envía un cuadro informando el problema| 
|Usuarios:|Empresario Odontología y Trabajador| 
|RF-02| 
|Nombre:|Modificar Usuarios|
|Entrada:|Tendrá una tabla con los siguientes campos: Nombres, cedula, usuario, contraseña.|
|Salida:|El usuario debe estar creado en la aplicación para poder modificar datos, al editarse se muestra un cuadro aceptando los cambios, los datos se almacenan en la base de datos.|
|Usuarios:|Empresario Odontología y Trabajador.|
|RF-03|
|Nombre:|Eliminar Usuarios|
|Entrada:|Tendrá un botón en el cual se dará clic, mostrará un cuadro de aceptación o cancelación.|
|Salida: |El usuario debe estar creado en la aplicación para poder eliminarlo, los datos e información del usuario se elimina de la base de datos.|
|Usuarios:|Empresario Odontología.|
|RF-04|
|Nombre:|Ingresar al sistema|
|Entrada:|Tendrá dos campos, uno para el usuario y otro para la contraseña|
|Salida:|El usuario debe estar creado en la aplicación, debe tener la información necesaria.Si no existe o no se ha registrado debe hacerlo, le saldrá un cuadro con dicho error.Si el usuario o contraseña están mal, un cuadro mostrará el error.|
|Usuarios:|Todos los usuarios|
|RF-05|
|Nombre:|Seleccionar Tipo de usuario a ver en tabla|
|Entrada:|Tendrá una lista en cual se dará clic, saldrán las opciones de los tipos de usuarios que se desean ver.|
|Salida:|Se mostrará la información de los usuarios señalados por su tipo.|
|Usuarios:|Empresario Odontología y Trabajador.|

### Mockup
- <a href="https://marvelapp.com/dh945da" target="_blank">FRUITHZ</a> 
