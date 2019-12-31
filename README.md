- **Spring Web Flow** est un sous-projet de Spring Framework. Il permet de définir et d'exécuter des enchaînements de pages dans une application web. Il est utilisable de façon autonome, mais on peut aussi l'intégrer avec un MVC web.
- **Spring Data JPA** fournit une implémentation de la couche d’accès aux données pour une application Spring. C’est une brique très pratique car elle permet de ne pas réinventer la roue de l’accès aux données à chaque nouvelle application et donc de se concentrer sur la partie métier.
- **H2** est un système de gestion de base de données relationnelles écrit en Java. Il peut être intégré à une application Java ou bien fonctionner en mode client-serveur. Son fichier jar est petit : environ 1 Mo.
- **Spring Boot DevTools** inclut un serveur LiveReload intégré. LiveReload est un protocole simple qui permet à votre application de déclencher automatiquement une actualisation du navigateur chaque fois que les choses changent.
- **Thymeleaf** est un moteur de template, sous licence Apache 2.0, écrit en Java pouvant générer du XML/XHTML/HTML5. Thymeleaf peut être utilisé dans un environnement web (utilisant l'API Servlet) ou non web. Son but principal est d'être utilisé dans un environnement web pour la génération de vue pour les applications web basées sur le modèle MVC. 


Etape 13 :
1. La partie du code avec laquelle nous avons parametre l’url d’appel /greeting est le " @GetMapping("/greeting") "  dans le HelloWorldController.java..
2. La partie du code avec laquelle nous avons choisi le fichier HTML à afficher est le " return "greeting"; " dans le HelloWorldController.java.
3. Nous envoyons le nom à qui nous disons bonjour avec le second lien à travers "model.addAttribute("nomTemplate", nameGET);" dans le HelloWorldController.java, et nous la récupérons avec "<p th:text="'Bonjour ' + ${nomTemplate} + ' !'" />" dans greeting.html

Etape 17 :
Dans la console de H2 on remarque la création de la table Address

Etape 18 :
Dès qu'on a crée la classe Adress avec l'annotation @Entity, le framework crée automatiquement une table dans la BDD qui apparait dans la console H2.

Etape 20:
Nous remarquons que les requêtes Insert ont été pris en compte dans la console H2

Etape 23 :
C’est une annotation qui nous permet de faire l’injection de dépendances entre les beans de l’application (Spring va tout faire), il suffit juste d’annoter un constructeur ou une méthode avec cette dernière. et le conteneur Spring va faire la suite(La creation du bean, le chercher et l’injecter automatiquement…).
Etape 30 :
Pour  ajouter Bootstrap on ajoute les dépendances adéquates dans le pom.xml

Etape 6 (2/2):
- Oui nous avons besoin d'une clé pour l'API DarkSky
- https://api.darksky.net/forecast/key/latitude,longitude
- HTTP Get
- On passe les paramètres d'appel dans l'URL : "https://api.darksky.net/forecast/77a4d6f96ed3dbca6d44eefba7c48238/"+lat+","+lon+"?lang=fr&exclude=hourly&exclude=daily&exclude=flags&units=si"
- Pour afficher la température : ${meteo.currently.temperature}
- Pour afficher la prévision de la météo : ${meteo.currently.summary}
Etape 7 (2/2) :
https://github.com/ZinebKa/DM_POO