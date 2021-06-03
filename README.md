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

