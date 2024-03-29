# Java Market Management System

## Description

This repository hosts a comprehensive Java market management system. The system is designed to facilitate the management of market operations, featuring a robust Graphical User Interface (GUI), inheritance hierarchies for product and user management, and effective use of overriding and overloading principles to enhance functionality. It also includes a suite of unit tests to ensure reliability and performance.
![java](https://github.com/EmreYesilkaya/Java-Market-Management-System/assets/89980393/8cb5af4f-3b97-4168-b2f1-dce37fc51804)


*An overview of the system architecture depicting the relationships between GUI components and business logic.*

## Features

- **Graphical User Interface (GUI)**: A user-friendly interface for interactive management of market operations, including product listings, orders, and payments.
- **Inheritance**: Utilizes object-oriented principles to create a clear hierarchy of products, including technological and food items, promoting code reusability and scalability.
- **Method Overriding**: Tailors inherited methods to specific needs of the market system, ensuring that the behavior of subclasses is appropriate for their context.
- **Method Overloading**: Provides multiple ways to use functionality within the system, like searching for products or processing payments, enhancing the system's flexibility.
- **Unit Testing**: Comprehensive tests using JUnit to validate each component's functionality and ensure robustness through automated testing practices.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your system.
- Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse.
- Familiarity with GUI development in Java.

### Installation
1. Clone the repository to your local machine.
2. Open the project in your IDE.
3. Resolve any dependencies that are required (e.g., JUnit for testing).

### Running the Application
- Navigate to the `Main` class and run the program to launch the market management system.
- Explore different modules such as product addition, user management, and order processing through the GUI.

## Documentation

### Market Management System Structure
- **UML Diagram**: The above diagram illustrates the system's structure and the relationships between different classes.
- **Product Classes**: `TeknolojikUrun` and `GidaUrunu` are subclasses inheriting from `Urun`, demonstrating the system's use of inheritance.
- **User Management**: `User` class with `GUI_User` providing the interface elements for user interactions, managed by `KontrolorUser`.
- **Order and Payment Processing**: `SiparisVeOdeme` handles order taking and payments, with a dedicated GUI component `GUI_SiparisVeOdeme`.

### GUI Components
- `GUI_Urun`: Manages the product-related user interface.
- `GUI_Musteri`: Handles customer management operations.
- `GUI_User`: Provides authentication and user management interface.

### Testing
- Unit tests for each component ensure the system is tested and ready for deployment.
- Examples include `UrunTest`, `MusteriTest`, and `KontrolorTest`, which ensure that the logic for products, customers, and controllers is functioning correctly.

## Contributing
We welcome contributions that help improve the system. Please ensure that any contributions follow the existing code structure and include appropriate tests.

## License
This project is licensed under the MIT License - see the LICENSE.md file for details.
# Terimlerin İngilizce-Türkçe Karşılıkları

Aşağıda, projenin UML diyagramında kullanılan İngilizce terimlerin Türkçe karşılıkları bir tablo halinde verilmiştir.

| English            | Türkçe                  |
|-----------------------|-------------------------|
| Order                 | Sipariş                 |
| Payment               | Ödeme                   |
| Product               | Ürün                    |
| Customer              | Müşteri                 |
| User                  | Kullanıcı               |
| Order and Payment     | Sipariş ve Ödeme        |
| Product Test          | Ürün Testi              |
| Customer Test         | Müşteri Testi           |
| User Test             | Kullanıcı Testi         |
| Controller            | Kontrolör               |
| Product Controller    | Ürün Kontrolörü         |
| Customer Controller   | Müşteri Kontrolörü      |
| User Controller       | Kullanıcı Kontrolörü    |
| GUI Order and Payment | GUI Sipariş ve Ödeme    |
| GUI Product           | GUI Ürün                |
| GUI Customer          | GUI Müşteri             |
| GUI User              | GUI Kullanıcı           |
| Technological Product | Teknolojik Ürün         |
| Cleaning Product      | Temizlik Ürünü          |
| Food Product          | Gıda Ürünü              |
| Controller Test       | Kontrolör Testi         |
| GUI Product Test      | GUI Ürün Testi          |
| GUI Customer Test     | GUI Müşteri Testi       |
| GUI User Test         | GUI Kullanıcı Testi     |

Bu tablo, kodun daha iyi anlaşılabilmesi için terimlerin çevirilerini içermektedir.

