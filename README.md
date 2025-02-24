#Projeto Para bootcamp
```mermaid
classDiagram
    class User {
        - String name
        - String address
        - Cart cart
        - Category[] categories
        - Store[] stores
    }

    class Cart {
        - float total
        - int items
    }

    class Category {
        - String icon
        - String description
    }


    class Store {
        - String icon
        - String description
    }

    User "1" *-- "1" Cart
    User "1" *-- "N" Category 
    User "1" *-- "N" Promotion
    User "1" *-- "N" Store 
```
