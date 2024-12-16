# ENSIM_webApp

## Description
### Spring Web
Permet de créer des applications web en Java. Il est basé sur le framework Spring et utilise le modèle MVC 
(Model-View-Controller). Il est utilisé pour créer des applications web dynamiques et flexibles. 
### JPA
Simple et rapide a utiliser pour manipuler les bases de données.
Il y a des requests dynamiques.
### Hibernate
Utilise JPA pour construire ORM (Object-Relational Mapping) en Java. 
Afin de simplifier la manipulation des bases de données.
### H2 Database
Base de données en mémoire, très rapide et légère.
### Spring Boot DevTools
Accélère le développement en permettant le rechargement automatique 
des classes et la mise à jour des ressources sans redémarrer l'application.
### Thymeleaf
Moteur de templates moderne et côté serveur, utilisé pour créer des pages HTML dynamiques dans les applications Spring. 
Facilite l'intégration avec les modèles de données.


## 1

```java
// Greeting montre le nom passé en paramètre dans l'URL
@GetMapping("/greeting")

// param name va etre sauvegardé dans la variable nameGET
public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String
nameGET, Model model) {

        // nameGET est le paramètre GET de l'URL
        // nom template c'est la variable dans notre template et on
        // lui assigne la valeur de nameGET
        model.addAttribute("nomTemplate", nameGET);

        // indique le nom de la template à utiliser
        return "templateName";
```
## 17.
J'ai remarqué que Tablau Address a été aparu dans la base de données.
Avec tous les attributes de la classe Address.
## 18
Hebernate a créé une table Address dans la base de données automatiquement.
## 20
Ce n'est fonctionne pas, car il "Table 'address' not found".
En ajoutant
```java
spring.jpa.defer-datasource-initialization=true
```
J'ai résolu le problème, car avant Hibernate a essayé de écrire dans la table avant la création de tableau.
## 22
Autowired permet de faire l'injection de dépendance
C'est-à-dire que Spring va s'occuper de créer une instance de AddressRepository
et de l'injecter dans notre contrôleur
## 30
J'ai utilisé le lien bootstrap pour l'importer tous les fichiers css et js.
En utilisant le lien suivant:
```html
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
```
Ce sont les cdn qui permettent d'importer les fichiers css et js de bootstrap.