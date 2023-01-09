# Prospecta_Assignment
<li>I have developed this REST API for a getting details by category and adding new Entries. This API performs
  getting details by category and adding new entry</li>

# Tech Stack
- Java
- Spring Framework
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

# Modules

- Gettig by Category
- Adding new Entry

# Installation & Run
 - Before running the API server, you should update the database config inside the application.properties file.
- Update the port number, ownername and password as per your local database configuration.

```
    server.port=8880

    spring.datasource.url=jdbc:mysql://localhost:8880/foodplaza1;
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=root
```

# API Root Endpoint
```
https://localhost:8880/
```
```
# API Reference

# Sample API Response for Adding New Entry
### Request Type
```
POST
```

### Request URI
```
http://localhost:8880/entries
```

### Request Body
```
{
    "name":"Om Mishra",
   "email":"omanubhav@gmail.com",
   "password":"anubhav123"
}
```
### Response Body

```
{
            "API": "Anubhav",
            "Description": "A new entry added",
            "Auth": "apiKey",
            "HTTPS": true,
            "Cors": "yes",
            "Link": "https://www.adoptapet.com/public/apis/pet_list.html",
            "Category": "New"
  }
```
# Sample API Response for Getting By Category
### Request Type
```
GET
```

### Request URI
```
http://localhost:8880/entries/Animals
```
### Response Body

```
[
    {
        "title": "AdoptAPet",
        "description": "Resource to help get pets adopted"
    },
    {
        "title": "Axolotl",
        "description": "Collection of axolotl pictures and facts"
    },
    {
        "title": "Cat Facts",
        "description": "Daily cat facts"
    },
    {
        "title": "Cataas",
        "description": "Cat as a service (cats pictures and gifs)"
    },
    {
        "title": "Cats",
        "description": "Pictures of cats from Tumblr"
    },
    {
        "title": "Dog Facts",
        "description": "Random dog facts"
    },
    {
        "title": "Dog Facts",
        "description": "Random facts of Dogs"
    },
    {
        "title": "Dogs",
        "description": "Based on the Stanford Dogs Dataset"
    },
    {
        "title": "eBird",
        "description": "Retrieve recent or notable birding observations within a region"
    },
    {
        "title": "FishWatch",
        "description": "Information and pictures about individual fish species"
    },
    {
        "title": "HTTP Cat",
        "description": "Cat for every HTTP Status"
    },
    {
        "title": "HTTP Dog",
        "description": "Dogs for every HTTP response status code"
    },
    {
        "title": "IUCN",
        "description": "IUCN Red List of Threatened Species"
    },
    {
        "title": "MeowFacts",
        "description": "Get random cat facts"
    },
    {
        "title": "Movebank",
        "description": "Movement and Migration data of animals"
    },
    {
        "title": "Petfinder",
        "description": "Petfinder is dedicated to helping pets find homes, another resource to get pets adopted"
    },
    {
        "title": "PlaceBear",
        "description": "Placeholder bear pictures"
    },
    {
        "title": "PlaceDog",
        "description": "Placeholder Dog pictures"
    },
    {
        "title": "PlaceKitten",
        "description": "Placeholder Kitten pictures"
    },
    {
        "title": "RandomDog",
        "description": "Random pictures of dogs"
    },
    {
        "title": "RandomDuck",
        "description": "Random pictures of ducks"
    },
    {
        "title": "RandomFox",
        "description": "Random pictures of foxes"
    },
    {
        "title": "RescueGroups",
        "description": "Adoption"
    },
    {
        "title": "Shibe.Online",
        "description": "Random pictures of Shiba Inu, cats or birds"
    },
    {
        "title": "The Dog",
        "description": "A public service all about Dogs, free to use when making your fancy new App, Website or Service"
    },
    {
        "title": "xeno-canto",
        "description": "Bird recordings"
    },
    {
        "title": "Zoo Animals",
        "description": "Facts and pictures of zoo animals"
    }
]
```
# Thanks For Taking Time
