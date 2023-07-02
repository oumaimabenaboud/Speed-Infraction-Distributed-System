# Speed-Infractions-Distributed-System

Speed Infractions Distributed System is a microservices-based project aimed at managing and monitoring speed infractions. The system consists of multiple interconnected microservices that handle various tasks, including vehicle immatriculation, infraction recording, and radar monitoring.

##  :bookmark_tabs: Table of Contents 
1. [Technical Architecture of the project](#technical-architecture-of-the-project)
2. [Global class diagram of the project](#global-class-diagram-of-the-project)
3. [Immatriculation Microservice](#immatriculation-microservice)
    - JPA entities and JpaRepository interface based on Spring data
    - The 4 web services (REST, GraphQL, SOAP, and gRPC)
    - Testing the 4 web services
4. [Infractions Microservice](#infractions-microservice)
5. [Radar Microservice](#radar-microservice)
6. [JAVA client](#java-client)
7. [Technical services](#technical-services)
8. [Front-end application](#front-end-application)
9. [Securing the system](#securing-the-system)
10. [Docker deployment](#docker-deployment)

## Technical Architecture of the project

![ssss](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/eb79a081-54a7-4a6a-9f14-5d1b916eded4)


## Global class diagram of the project

![classdiagram](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/95815ae3-cc78-447d-a1cd-2035f67edf12)


## Immatriculation Microservice

### JPA entities and JpaRepository interface

| JPA entities | JpaRepository interface |
| --- | --- |
| ![entitiesJPA](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/0eb871cc-acd8-49f9-8127-fa7ada75dfc9) | ![JpaRepositories](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/a95abee7-5719-4db9-9ae7-ebbe1eb77751) |

### The 4 web services (REST, GraphQL, SOAP, and gRPC)

| REST | GraphQL | SOAP | gRPC |
| --- | --- | --- | --- |
| ![ImmatriculationRest](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/4aba780a-68d0-4313-87bc-a4d3daab02a3) | ![immatriculationGraphQl](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/a39023cd-df97-434a-9102-067170b8383f) | ![ImmatriculationSoap](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/db178b91-b467-4edb-b43b-39be0e32d24d) | ![immatriculatioGrpc](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/19e285e0-347b-47b8-b292-8da44cbdee47) |

### Testing the 4 web services

#### Testing the REST web service using Postman

| List of all owners | Save new owner |
| --- | --- |
| ![listofAllOwnersPostman](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/871ef92b-c47f-4898-a869-de28b51d9fb8) | ![saveNewOwnerPostman](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/36e78218-c46d-4171-b597-1b80553c8e06) |

#### Testing the GraphQL web service using Graphiql

| List of all owners | Save new owner |
| --- | --- |
| ![GraphQLListofAllOwners](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/7880e62f-5a5c-4be0-8453-1f30ab7cfc7f) | ![saveNewOwner](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/cd46556d-6a70-490c-80c9-db140edd3442) |

#### Testing the SOAP web service using SOAPUI

| List of all owners | Save new vehicle |
| --- | --- |
| ![ListOfAllOwners](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/42c56a8c-cfd9-424b-9998-67eb79d4b7e1) | ![saveNewVehicle](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/96f2272e-b181-4d70-89c9-987632c918b4) |

#### Testing the gRPC web service using BloomRPC

| Update vehicle | Update Owner |
| --- | --- |
| ![updateVehicle](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/8292a976-9761-4033-b974-5c87cdaa3e65) | ![updateowner](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/6b0589e6-d3be-4c64-a367-28face6be544) |

## Infractions Microservice

| Infractions Microservice | List of all infractions using Postman | Add new infraction using Postman |
| --- | --- | --- |
| ![microserviceInfraction](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/325a4210-af61-4199-a98a-11cbf7f38b6e) | ![ListofAllInfractions](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/a9c0e55c-cbeb-48b2-b176-8039afebc676) | ![addnewInfraction](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/e1625366-af97-46f4-89ce-27fd60633672) |

## Radar Microservice

| List of all infractions including the vehicles that exceeded the speed limit and their respective owners |
| --- |
| ![microserviceRadar](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/7e6bcd05-f244-465b-b772-e470a4069b60) |

## JAVA client

JAVA client that simulates a radar that randomly generates speeding infractions and sends them via GRPC to the Radar service.

![ClientJavaGrpc](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/217ba41e-5cb3-4c42-9cbf-29e86b466dc2)

## Technical services

The technical services of the microservice architecture (Gateway, Eureka Discovery service).

![eureka](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/03aa1160-a0b2-4587-9323-2d730043e44a)

## Front-end application

Front-end application with Angular.

| List of Radars | Add new Radar | Infractions detected by the Radar | Infraction detail |
| --- | --- | --- | --- |
| ![ListofRadars](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/c4f64def-e555-4517-8894-e54085ba8fc8) | ![addNewRadar](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/55a4660b-ec63-496a-a3bf-845b9753c4e7) | ![InfractionsdetectedofRadar](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/292aaca3-9cc3-4ae8-9c99-ce50ee7c9bb3) | ![Infractiondetail](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/24384bda-35ca-454c-a5c8-193195c10200) |

| List of Infractions | Add new Infraction | Infraction detail | Delete Infraction |
| --- | --- | --- | --- |
| ![listofInfractions](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/11db2002-60bb-488f-8c33-3e40137a12bb) | ![addNewInfractionAngular](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/25609132-7331-4e93-907d-48c53f7b0e3b) | ![DetailsInfraction](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/6204e786-eb05-48ce-9c7a-24773edd3871) | ![image](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/d3d21335-4615-43c9-b801-202d86c5d704)


| List of Vehicles | Add new Vehicle | Vehicle's owner detail |
| --- | --- | --- |
| ![listOfVehicles](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/e3bafea3-f226-444b-a19b-95f4ab6be27a) | ![AddNewVehicle](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/9fb8adca-6d9d-408b-9837-5b1bbea2c657) | ![VehiclesOwner](https://github.com/oumaimabenaboud/Speed-Infractions-Distributed-System/assets/120368654/83fca0b2-ba7d-4343-8c84-1c88d3b45815) |

## Securing the system

Securing the system with the Keycloak authentication system.

| Login Page | Home Page |
| --- | --- | 
| ![Capture d'écran 2023-07-01 224136](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/6af785c6-baa6-41bf-9921-f4ab0398e9a3) | ![Capture d'écran 2023-07-01 233904](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/43b25d4c-e2ca-4f98-8803-58c2d8ec00da) |


## Docker deployment

The `docker-compose.yml` script to deploy the distributed system in Docker containers.

