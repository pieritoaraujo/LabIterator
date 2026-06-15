Sistema de Catalogo de Peliculas - Patron Iterator
-
El sistema para visualizar peliculas acceden a la lista de películas para ver el contenido recomendado según sus preferencias.
Lo que busco es un recorrido de las películas almacenadas en el catalogo sin acceder a la estructura interna donde se almacenan.

#### Aplicaciones:

#### Gestión de visualizaciones
#### Gestión de recomendaciones por categorias
#### Gestión de peliculas
#### Lista de favoritos


Patrón de Diseño que he utilizado es Iterator ya que este proporciona una forma de acceder a los elementos en secuencia sin presentar la estructura interna.


Para eso, utilice arbol binario de categorias, ya que cada nodo del arbol representa una categoria de peliculas y contiene una lista de peliculas asociadas.


Además, se utilizó para organizar las categorias de peliculas:
Cada nodo contiene una categoria, una lista de peliculas, un hijo izquierdo y un hijo derecho.

Osea, dentro de cada categoria utilice un ArrayList para almacenar las peliculas asociadas.
La clase PeliculaIterator utiliza una estructura Stack para recorrer el arbol y visitar las categorias durante la iteracion.

### Iterator
-hasNext()
-next()

### Agregado
-createIterator()

### Clases
#### Pelicula
Atributos:
-titulo
-genero
-ranking

#### NodoCategoria
Atributos:
-categoria
-peliculas
-izquierda
-derecha

#### Catalogo
Esto es implementada por la interfaz Agregado
Además, es responsable de
Construir el arbol de categorias
Almacenar las peliculas
Crear el iterator

#### PeliculaIterator
Implementa la interfaz Iterator

Responsable de:
Recorrer las peliculas almacenadas en el arbol
Gestionar la posición actual del recorrido
Retornar cada película de forma secuencial

#### Main
Aquí es donde se encarga de ejecutar el sistema y mostrar los resultados

#### Funcionamiento
Lo que el cliente observa es el iterador mediante el metodo:
Iterator iteratorr = catologo.createIterator()
Para luego recorrer la coleccion utilizando:
while(iterator.hasNext));

Lo que hace que el cliente desconozca como estan almacenadas las peliculas internamente.