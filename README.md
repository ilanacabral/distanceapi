 ## DIO.me - API Rest de calcula distância entre cidades do Brasil

## Requisitos:

- Java 8
- Heroku
- Postgres
- Docker
- https://start.spring.io/
- Spring Web
- Spring Data JPA
- PostgreSQL Driver
  
## Intruções para o banco de dados

- Postgres Docker Hub
     ```     
     docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=dio -e POSTGRES_PASSWORD=dio -e POSTGRES_DB=diodb postgres
     ```  
- SQL
  ```
    git clone https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL
 

    cd ~/workspace/sql-paises-estados-cidades/PostgreSQL

    docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash

    psql -h localhost -U dio diodb -f /tmp/pais.sql
    psql -h localhost -U dio diodb -f /tmp/estado.sql
    psql -h localhost -U dio diodb -f /tmp/cidade.sql

    psql -h localhost -U dio diodb

    CREATE EXTENSION cube; 
    CREATE EXTENSION earthdistance;

    psql -U dio diodb   

    Query Earth Distance
    - Point

        select ((select lat_lon from cidade where id = 4929) <@> (select lat_lon from cidade where id=5254)) as distance;

    - Cube

        select earth_distance(
            ll_to_earth(-21.95840072631836,-47.98820114135742), 
            ll_to_earth(-22.01740074157715,-47.88600158691406)
        ) as distance;```

## Endpoints

- City resource : 
    - Find all cities : http://localhost:8080/cities/
    - Find city by id : http://localhost:8080/cities/2

- State resource :
    - Find all states : http://localhost:8080/states/
    - Find state by id : http://localhost:8080/cities/2

- Country resource :
    - Find all countries : http://localhost:8080/countries/
    - Find country by id : http://localhost:8080/cities/2

- Distance: http://localhost:8080/distance/{type}/{from}/{to}
    - Find distance use points calculate : http://localhost:8080/distance/points/2/3    
    - Find distance use cube calculate :  http://localhost:8080/distance/cube/2/3
