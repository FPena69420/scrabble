# Scrabble

![http://creativecommons.org/licenses/by/4.0/](https://i.creativecommons.org/l/by/4.0/88x31.png)

Interactive graphic programming language heavily inspired by 
[Scratch](https://scratch.mit.edu).
This work is licensed under a
[Creative Commons Attribution 4.0 International License](http://creativecommons.org/licenses/by/4.0/), 
and aims purely to be used with the purpose of teaching in the context of the course 
_CC3002 Metodologías de Diseño y programación_ of the 
[_Computer Sciences Department (DCC)_](https://www.dcc.uchile.cl) of the 
_University of Chile_.

---

**The rest of the documentation is left for the users of this template to complete**

Aquí Francisco Peña, el autor de este código. Aquí entrego instrucciones para aquellos que quieran saber
como ocupar mi código.

-.ttfunction(): estas son las funciones por defecto para pasar de un tipo de la tarea a otro, 
i.e., si quiero transformar mi Binary B1 a String, lo que hago es ocupar
ttString() de la siguiente manera "B2= B1.ttString()", en cuyo caso, B2 ahora almacena
el valor String que vino de transformar B1 a String.

-.operation(): estas son las funciones que retornan la operación entre dos valores, 
por ejemplo B1.sum(F2) retorna la suma entre el Binary B1 y el Float F2 (uso esas 
notaciones por convención, o mejor dicho, las comencé a ocupar a mitad de camino) 

A.minus(B) retorna la resta A-B, A.mult(B) retorna la multiplicación entre ambos 
y A.dived_by(B) retorna A/B. Todas estas funciones son de double dispatch. 

Nótese que .dived_by() sobresale porque "está al revés". Pero hace mucho más 
sentido (al menos para mi) decir que "A.dived_by(B)" es "A dividido por B" y 
"A.{A_tipe}div(B)" es "A divide a B". No así, por ejemplo "A.minus(B)", "A menos B", 
y "A.minused_by(B)" que es "A fue impuesto un signo negativo en la operación 
con B"

Documenté todas las funciones que suponía que eran difíciles de entender a primera 
vista; las demás son evidentes en su funcionamiento

-Num.java: esta es una clase abstracta en la que almacené diversos algoritmos
que ayudan a la transformacion entre valores numéricos, en teoría habría de ocupar
dichos métodos en las tres clases que heredan de ella, pero al final el código no
resultó como lo esperaba; esto tiene fácil solución, en Float.java, podría
modificarse ttBinary para que, en vez de que la variable Int sea de tipo Int, y 
en cambio, sea de tipo int y almacene el valor que venga de transformar this.value
por las funciones ceil y floor como un simple valor numérico. Luego, al construir 
el Binary de retorno se podrían ocupar NegIntToBinary, PosIntToBinary, etc.

Nótese que tengo algoritmos para transformar Floats a Binarys

Es por esto que mi código quedó algo distinto a como se podría esperar, pero esto
vino de mi suposicón de que como los Binarys se podían transformar a Float, 
entonces significaba que Binary tambíen puede almacenar binarios para 
números con parte decimal. Luego, como podrán notar, todas las tranformaciones 
de Binary a valor numérico retornan en formato float, excepto, claro, la vieja
confiable ttInt(), que al aplicarse sobre un Binary que represente un int 
válido (sin "." y nada despúes de él), retorna Ints válidos también.

Esto tiene un par de consecuencias que noté luego de hacer los tests de 
LogicTheGathering.java, y eso es que (supongo yo) en principio ustedes los 
evaluadores querían que Int + Binary retornara Int. Aquí no es posible, debido a 
lo que mencioné anteriormente, y por tanto, esta operación retorna un Binary, 
de acuerdo a las reglas dadas. 

Siendo sincero, fué un dolor de cabeza pensar en todos esos algoritmos de 
traducción de Float a Binary y viceversa, pero ya los tenía hechos para cuando 
me di cuenta que no eran necesarios, así que los dejé así.

No hay más que decir que mi programa se comporta tal y como lo pidieron en el 
enunciado (con lagunas legales como la anterior) y lo que está puesto como 
extra está bien documentado y escrito cosa que quienes jueguen con mi 
código puedan entender que es lo que hace cada cosa.

---Actualización tarea 2---

Hola, vengo a presentar mi codigo de nuevo.

Lo más notorio en esta entrega es probablemente la carpeta OpsTree que contiene 
mil y una clases. Me gustaría destacar cuatro:

-Nodo.java: la clase padre (abstracta) de todos los nodos implementados para 
esta tarea. De aquí heredan directamente NodoBinario.java, NodoUnario.java y 
NodedValue.java. Esta clase en sí no contiene mucho, debido a que es demasiado 
general, pero demarca todo lo que los nodos hijos deben tener.

-NodedValue.java: esta clase almacena valores descendientes de Value (Binary, 
Float, Bool, Variable, etc) en un nodo. eval() retorna el mismo nodo en 
concordancia con las operaciones eval() de NodoBinario.java y NodoUnario.java. 
para almacenar un valor en un nodo basta llamar a new NodedValue(new {clase 
hija de Value})

-NodoBinario.java: de aquí heredan todos los nodos de operaciones binarias (
suma, resta, and, etc). Es una clase abstracta, así que para generar operaciones
entre NodedValues es necesario crear nodos hijos de esta, i.e. si queremos 
instanciar una multiplicacion de NodedValues, creamos un nuevo NodoMult. Y así
con los demás descendientes de esta clase. Para obtener el NodedValue resultante
basta con llamar a eval() sobre el nodo.

-NodoUnario.java: clase también abstracta, de aquí heredan todas las operaciones 
unarias (negación, ttfunctions). Para crear una operación unaria de NodedValues
basta en instanciar un nodo descendiente de esta clase y llamar a eval().

Tenemos también adiciones como Tree.java que es la clase usada para generar 
árboles AST. Para evaluar un árbol, basta con llamar a eval(). Se crean
entrgando el nodo raíz al método constructor, es decir, los nodos deben estar
bien definidos antes de crear el árbol. Es imposible modificar el árbol 
modificando los nodos después de haberlo creado. Lo que puede llegar a ser algo
tedioso.

Para el package Values tenemos modificaciones, debido a que convertí la clase
Num.java en la clase estática NumericMethods.java. Ahora me hace más sentido
dejarla así, debido a que decidí crear la clase Value.java, que hace la creación
de variables más homogénea. Así, ahora todos los tipos de variables (Binary, 
Float, Variable) heredan de Value. Luego, NumericMethods es una clase que 
contiene funciones que ayudan a transformar números. Generalmente no se debería
ocupar en interacciones directas con usuarios.

Una nueva adición inútil es Variable.java. Es algo truculenta, debido a que es
una clase hija de Value, que almacena clases hijas de Value. En un principio
pensé que cuando decían en enunciado que el árbol debería ser capaz de 
almacenar variables, se referían a variables en el sentido de ecuaciones; 
signos que se ocupan para demarcar un valor no definido todavía. Por tanto, 
hice justo eso.

-setFunctions(): funciones que se ocupan para definir el valor de una instancia
de Variable. El método constructor las inicia almacenando null. Por tanto, si 
quiero crear una variable que almacene el binario "010", debo proceder como 
sigue:

X1= new Variable();
X1.setBinary("010");

Estas variables funcionan bien con todo tipo de operación que pueda incluir a 
su valor almacenado, i.e., puedo llamar a X1.sum(someValue), a X1.and(someValue) 
y a X1.negate(), que retornan los valores adecuados dependiendo del valor 
almacenado en X1 al momento.

Pero como dije, esta clase es inútil porque nació de una confusión, y me di
cuenta de ello solo al comenzar a escribir esta actualización. :|

Por último, tenemos ValueVault, la clase que almacena valores creados. Ahora, 
para hacer uso de esta, los valores creados deben pasar por ella primero:

ValueVault vault= new ValueVault();
Value V1= vault.initialize(new Binary("010"));

La primera linea de codigo crea la nueva ValueVault, y la segunda añade el nuevo 
Binario a esta para que pueda ser reusado luego, y además lo retorna, por lo 
que V1 ahora almacena el binario.

-getCode(aValue): según enunciado, cada valor almacenado en ValueVault 
tiene un codigo, y esta función retorna el int que lo representa. Esta función
no sirve para encontrar Variables vacías, por lo que si una se introduce una a 
ValueVault, debe de dejarse alguna manera de rescatarla/operarla de antemano.
(No pienso arreglar esto porque Variable es redundante)

-getElementByCode(aCode): retorna el valor asociado al código. 

Con estas dos funciones es fácil reutilizar valores; si se conoce el código de 
una variable, se recupera y se instancia con la segunda, y si no se sabe el  
codigo de esta, se recupera con la primera.

Con esto concluyo la exposición de mi código. Para mayor información, mirar las
clases mismas o los tests.
