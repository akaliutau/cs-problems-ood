
About 
======

I created this repository with aim to demonstrate the best practices in low-level OOD. In OOD these are 24 canonical patterns initially proposed by gang of four, plus various secondary, less-known patterns which are popular in designing complex systems. For example, search functionality in JPA is implemented using Specification pattern.

There are many opinions regarding usefulness of these patterns in solving real problems. Sometimes (not always, but sometimes) there makes sense to add extra complexity into system, bearing in mind all future improvements, additions and complexities - it is not easy to make changes, and better of all anticipate and include them into Grand Design from the day zero.

Sometimes following these patterns is not the best that you could do. In fact, to invent a new approach to solve specific use-case is often much better then to try adopting standard one. This is all about trade-offs. If design patterns lead to more complex architecture, follow your own way.
  
The best approach in this situation could be as said by one old man long time ago:

<i>Everything should be made as simple as possible, but no simpler.</i> (c) Einstein  

Structure
========== 
 
Package <b>com.design.usecases</b> includes the examples of OOD for different use-cases.

Package <b>com.design.patterns</b> contains implementation of different popular design patterns (total 29):

abstractfactory <p/>
adapter <p/>
bridge <p/>
builder <p/>
command <p/>
composite <p/>
converter <p/>
decorator <p/>
facade <p/>
factory <p/>
flyweight <p/>
interpreter <p/>
iterator <p/>
mediator <p/>
memento <p/>
nullobject <p/>
objectpool <p/>
observer <p/>
pipeline <p/>
property <p/>
prototype <p/>
proxy <p/>
chain of responsibilities <p/>
singleton <p/>
specification <p/>
state <p/>
strategy <p/>
template <p/>
visitor <p/>

This repository does not include architectural patterns and programming idioms.

