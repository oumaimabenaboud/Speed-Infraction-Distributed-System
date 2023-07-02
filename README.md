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
11. [Demo video](#demo-video)

## Technical Architecture of the project

![ssss](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/5852c7d6-7311-4030-840b-f92bf77ca742)


## Global class diagram of the project

![classdiagram](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/72f329f2-3b21-4b5a-9fa5-790ffbe349ad)

## Immatriculation Microservice

### JPA entities and JpaRepository interface

| JPA entities | JpaRepository interface |
| --- | --- |
| ![entitiesJPA](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/0295a565-53e9-4dfd-b614-533b0d2752e3) | ![JpaRepositories](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/905eae8b-51fe-47e7-80b5-a68452436313) |

### The 4 web services (REST, GraphQL, SOAP, and gRPC)

| REST | GraphQL | SOAP | gRPC |
| --- | --- | --- | --- |
| ![ImmatriculationRest](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/af4c1b43-453d-4aa8-8505-bbdea3e5ac85) | ![immatriculationGraphQl](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/ae8d1ee5-a9c1-4266-9d87-cf6825e01721) | ![ImmatriculationSoap](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/9c572649-ac48-49b3-91da-178c03da4621) | ![immatriculatioGrpc](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/0bb74948-d3f3-48c0-b5c5-0b51885e6bd6) |

### Testing the 4 web services

#### Testing the REST web service using Postman

| List of all owners | Save new owner |
| --- | --- |
| ![listofAllOwnersPostman](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/a7e8ebd1-e206-4ce7-85ce-0f6d93c79df5) | ![saveNewOwnerPostman](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/760b0e97-d105-49e9-b5aa-5b59392f29d9) |

#### Testing the GraphQL web service using Graphiql

| List of all owners | Save new owner |
| --- | --- |
| ![GraphQLListofAllOwners](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/27590bb8-f474-41ac-ae72-b8534370dcb1) | ![saveNewOwner](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/598f5099-78d7-4210-ad29-69c31751d2aa) |

#### Testing the SOAP web service using SOAPUI

| List of all owners | Save new vehicle |
| --- | --- |
| ![ListOfAllOwners](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/191df5cc-5415-4b6a-b576-d1af8b61b661) | ![saveNewVehicle](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/d2e5bffa-c4f3-4bd3-b214-0c4fd4449831) |

#### Testing the gRPC web service using BloomRPC

| Update vehicle | Update Owner |
| --- | --- |
| ![updateVehicle](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/80d32cef-45af-48aa-a9a8-7d8ae40f26e1) | ![updateowner](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/edef6492-7b28-4541-9291-7ff31df1ea58) |

## Infractions Microservice

| Infractions Microservice | List of all infractions using Postman | Add new infraction using Postman |
| --- | --- | --- |
| ![microserviceInfraction](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/0cbf7e95-5c4e-40bd-98ad-6c29aed30e1e) | ![ListofAllInfractions](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/44182848-ca28-4c7d-bf5a-4b9df2ba32df) | ![addnewInfraction](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/c295a08e-d421-40ed-9e44-0057c56c105a) |

## Radar Microservice

| List of all infractions including the vehicles that exceeded the speed limit and their respective owners |
| --- |
| ![microserviceRadar](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/55d8cbf8-fe3b-408d-9df4-dccc16182b73) |


## JAVA client

JAVA client that simulates a radar that randomly generates speeding infractions and sends them via GRPC to the Radar service.

![ClientJavaGrpc](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/ee31a3af-7593-49ab-9b0b-6f68426ddd87)


## Technical services

The technical services of the microservice architecture (Gateway, Eureka Discovery service).

![eureka](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/cfb4347f-0564-40b2-a18b-af984ab83cfa)


## Front-end application

Front-end application with Angular.

| List of Radars | Add new Radar | Infractions detected by the Radar | Infraction detail |
| --- | --- | --- | --- |
| ![ListofRadars](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/f7b37083-4173-4697-b5ab-c448704ef410) | ![addNewRadar](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/c1ceaaea-d18f-4bfb-82c0-445957b9b138) | ![InfractionsdetectedofRadar](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/879ce706-9911-4bc5-9cbb-abb74c883e83) | ![Infractiondetail](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/4b2cd3f4-63a2-4444-bcf9-a93e199651a9) |

| List of Infractions | Add new Infraction | Infraction detail | Delete Infraction |
| --- | --- | --- | --- |
| ![listofInfractions](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/b86f7887-84c2-4667-86d2-81d91be4de29) | ![addNewInfractionAngular](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/bd2d1474-06c7-42da-b8ed-640acad88aea) | ![DetailsInfraction](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/2e45c130-df3d-4198-8817-af281bc4775d) | ![deleteInfraction](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/ac56cee6-6abf-4c0c-8477-48c9837ee25b) |



| List of Vehicles | Add new Vehicle | Vehicle's owner detail |
| --- | --- | --- |
| ![listOfVehicles](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/0692761d-9ce0-4fba-a43b-b3475a1d705a) | ![AddNewVehicle](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/edca61d7-aa99-48df-81d1-de0396e58d2a) | ![VehiclesOwner](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/f6c25c48-4ef4-4812-b228-d87cf470c7ad) |

## Securing the system

Securing the system with the Keycloak authentication system.

| Login Page | Home Page |
| --- | --- | 
| ![Capture d'écran 2023-07-01 224136](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/ec8d589c-7fdd-48c0-8e48-57b03f6db127) | ![Capture d'écran 2023-07-01 233904](https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/43b25d4c-e2ca-4f98-8803-58c2d8ec00da) |


## Docker deployment

The `docker-compose.yml` script to deploy the distributed system in Docker containers.

## Demo Video



https://github.com/oumaimabenaboud/Speed-Infraction-Distributed-System/assets/120368654/c23647c3-4c46-4693-a0ac-400b3e9da2d2

