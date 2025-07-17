# Harold Bryan Santos

## 🐾 Zoo Simulation REST API Endpoints

---

### 📌 Visitor Endpoints

| Resource | HTTP Verb | Resource URL                             | Use Case                          |
|----------|-----------|------------------------------------------|-----------------------------------|
| Visitor  | POST      | /api/visitors                            | Create/register a new visitor     |
| Visitor  | GET       | /api/visitors                            | List all visitors                 |
| Visitor  | GET       | /api/visitors/{visitorId}                | Get visitor by ID                 |
| Visitor  | PUT       | /api/visitors/{visitorId}                | Update visitor information        |
| Visitor  | DELETE    | /api/visitors/{visitorId}                | Delete visitor record             |

---

### 🎟️ Ticket Endpoints

| Resource | HTTP Verb | Resource URL                                         | Use Case                          |
|----------|-----------|------------------------------------------------------|-----------------------------------|
| Ticket   | POST      | /api/visitors/{visitorId}/tickets                    | Create ticket for a visitor       |
| Ticket   | GET       | /api/visitors/{visitorId}/tickets                    | List visitor’s tickets            |
| Ticket   | GET       | /api/visitors/{visitorId}/tickets/{ticketId}         | Get a specific ticket             |
| Ticket   | DELETE    | /api/visitors/{visitorId}/tickets/{ticketId}         | Cancel/delete a visitor ticket    |

---

### 🚪 Zoo Entry/Exit

| Resource   | HTTP Verb | Resource URL            | Use Case              |
|------------|-----------|-------------------------|-----------------------|
| Zoo Entry  | POST      | /api/zoo/{zooId}/entry  | Visitor enters the zoo |
| Zoo Exit   | POST      | /api/zoo/{zooId}/exit   | Visitor exits the zoo  |

---

### 🦓 Enclosure Endpoints

| Resource   | HTTP Verb | Resource URL                            | Use Case                       |
|------------|-----------|-----------------------------------------|--------------------------------|
| Enclosure  | GET       | /api/enclosures                         | List all enclosures            |
| Enclosure  | GET       | /api/enclosures/{enclosureId}          | Get details of an enclosure    |
| Enclosure  | POST      | /api/enclosures                         | Create a new enclosure         |
| Enclosure  | PUT       | /api/enclosures/{enclosureId}          | Update enclosure details       |
| Enclosure  | DELETE    | /api/enclosures/{enclosureId}          | Remove an enclosure            |

---

### 🐘 Animal Endpoints

| Resource | HTTP Verb | Resource URL                                       | Use Case                           |
|----------|-----------|----------------------------------------------------|------------------------------------|
| Animal   | GET       | /api/animals                                       | List all animals                   |
| Animal   | GET       | /api/animals/{animalId}                            | Get animal details                 |
| Animal   | POST      | /api/enclosures/{enclosureId}/animals              | Add an animal to an enclosure      |
| Animal   | PUT       | /api/animals/{animalId}                            | Update animal health/info          |
| Animal   | DELETE    | /api/animals/{animalId}                            | Remove an animal                   |
| Animal   | POST      | /api/animals/{animalId}/feed                       | Feed an animal                     |
| Animal   | POST      | /api/animals/{animalId}/exercise                   | Exercise an animal (handler only)  |
| Animal   | POST      | /api/animals/{animalId}/examine                    | Examine an animal (handler only)   |

---

### 🏥 Hospital Endpoints

| Resource  | HTTP Verb | Resource URL                              | Use Case                        |
|-----------|-----------|-------------------------------------------|---------------------------------|
| Hospital  | GET       | /api/hospitals                            | List hospitals                  |
| Hospital  | GET       | /api/hospitals/{hospitalId}               | Get hospital details            |
| Hospital  | POST      | /api/hospitals                            | Create a new hospital           |
| Room      | GET       | /api/hospitals/{hospitalId}/rooms         | Get rooms in a hospital         |
| Room      | POST      | /api/hospitals/{hospitalId}/rooms         | Create new room in a hospital   |

---

### 👨‍⚕️ Veterinarian Endpoints

| Resource      | HTTP Verb | Resource URL                                               | Use Case                 |
|---------------|-----------|------------------------------------------------------------|--------------------------|
| Veterinarian  | POST      | /api/veterinarians/{vetId}/animals/{animalId}/heal        | Heal a sick animal       |
| Veterinarian  | GET       | /api/veterinarians/{vetId}/lecture                        | Vet gives a lecture      |

---

### 🧑‍🌾 Handler Endpoints

| Resource | HTTP Verb | Resource URL                                               | Use Case                   |
|----------|-----------|------------------------------------------------------------|----------------------------|
| Handler  | POST      | /api/handlers/{handlerId}/animals/{animalId}/feed         | Handler feeds an animal    |
| Handler  | POST      | /api/handlers/{handlerId}/animals/{animalId}/exercise     | Handler exercises an animal|
| Handler  | POST      | /api/handlers/{handlerId}/animals/{animalId}/examine      | Handler examines an animal |

---

### 🛍️ Shop & Item Endpoints

| Resource | HTTP Verb | Resource URL                                          | Use Case                          |
|----------|-----------|-------------------------------------------------------|-----------------------------------|
| Shop     | GET       | /api/shops                                            | List all shops                    |
| Shop     | GET       | /api/shops/{shopId}                                   | Get shop details                  |
| Shop     | POST      | /api/shops                                            | Create a new shop                 |
| Item     | GET       | /api/shops/{shopId}/items                             | Get items in a shop               |
| Item     | POST      | /api/shops/{shopId}/items                             | Add new item to a shop            |
| Item     | GET       | /api/items/{itemId}                                   | Get item details                  |
| Item     | PUT       | /api/items/{itemId}                                   | Update item info                  |
| Item     | DELETE    | /api/items/{itemId}                                   | Remove item from system           |
| Purchase | POST      | /api/shops/{shopId}/items/{itemId}/purchase          | Purchase a shop item              |

---

### 👩‍💼 Manager Endpoints

| Resource | HTTP Verb | Resource URL              | Use Case         |
|----------|-----------|---------------------------|------------------|
| Manager  | POST      | /api/zoo/{zooId}/open     | Open the zoo     |
| Manager  | POST      | /api/zoo/{zooId}/close    | Close the zoo    |
