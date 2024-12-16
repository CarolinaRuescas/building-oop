# Edificio

Crea un programa que permita gestionar un edificio

## Beans

### Edificio

Campos:
- Dirección
- Municipio
- Apartamentos

Métodos:
- showInfo()
- findApartment(int floor, String door): Dado una planta y una puerta,
  devuelve el apartamento en esa planta y puerta. Si no existe dicho apartamento
  devuelve null.
- showFloorApartments(int floor): Dado un número de planta, muestra los
  apartamentos de esa planta
- findOwners(int floor, String door): Dado una planta y una puerta, devuelve
  los propietarios del apartamento de esa puerta y planta. Si no existe dicho
  apartamento devuelve null.

### Apartamento

Campos:
- Planta
- Puerta
- Propietarios

Métodos:
- showInfo()

### Propietario

Campos:
- NIF
- Nombre
- Apellidos

Métodos:
- showInfo()

## Componentes

### Readers

Haz un reader por cada bean

## BuikdingApp1
Tendrá un método run() que realice lo siguiente:
-Lee un edificio 
- Pide al usuario un piso y una planta
  - Busca el apartamento de en el piso y planta que ha pasado el usuario
    Si existe, muestra su información
    Si no existe muestra el mensaje "No se ha encontrado el apartamento"
- Después, muestra la información de los apartamentos de la segunda planta

### BuildingApp

Debe tener un método run() que haga:
- Pide los datos del edificio
- Inicia un bucle de menú con las siguientes opciones:
    - Muestra toda la información del edificio
    - Dado una planta y una puerto, devuelve el apartamento en esa planta y puerta. Si no existe dicho apartamento devuelve null.
    - Dado un número de planta, muestra los apartamentos de esa planta
    - Dado una planta y una puerto, devuelve los propietarios del apartamento de esa puerta y planta. Si no existe dicho apartamento devuelve null.
    - Muestra los datos del apartamento situado en una puerta y planta dados. Si no se encuentra muestra el mensaje "No existe el apartamento"
    - Muestra los propietarios de un apartamento situado en una planta y puerta dados. Si no se encuentra muestra el mensaje "No existe el apartamento"
