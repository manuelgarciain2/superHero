# superHero

### postman request examples

1) to get all the Super heroes 

    -Method GET 
    -URL localhost:8080/api/superheroes/
2) to Get a Super Hero by Id

    -Method GET
    -URL localhost:8080/api/superheroes/2
3) to Get all Super Heroes that in super hero name containg "man"

    -Method GET
    -URL localhost:8080/api/superheroes/findLike/man
4) to delete one super hero by id

    -Method Delete
    -URL localhost:8080/api/superheroes/delete/2
5) to update one Super Hero

    -Method Put
    -URL localhost:8080/api/superheroes/update
    -Body "raw" "JSON" {"id":"2" "firstName": "Bruce 2","superHeroName": "Hulk 2","lastName": "Banner"}
6) to create new Super Hero

    -Method Post
    -URL localhost:8080/api/superheroes/create
    -Body  "raw" "JSON" {"firstName": "Barry","superHeroName": "Flash","lastName": "Allen"}
