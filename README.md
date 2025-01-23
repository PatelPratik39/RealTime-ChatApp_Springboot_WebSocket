# Real-Time Chat Application (Spring Boot & WebSocket)

## Overview

This project is a **real-time chat application** built with **Spring Boot** and **WebSocket** technology. The application enables users to join a chatroom, send messages, 
and receive messages in real-time. It leverages STOMP (Simple Text Oriented Messaging Protocol) for communication and SockJS for fallback options when WebSocket is unavailable.

---

## Features

- Real-time messaging using WebSocket.
- User-friendly interface to join chatrooms with a username.
- Displays sent and received messages in the chatroom.
- Integration with Spring's WebSocket support.
- Dynamic user handling with session attributes.

---

## Architecture

The application is built with a three-tier architecture:

1. **Frontend**: A lightweight HTML/JavaScript-based UI for interacting with the chatroom.
2. **Backend**: Spring Boot application handling WebSocket communication and message routing.
3. **WebSocket Endpoint**: Establishes and manages WebSocket connections for real-time communication.

---

## Tech Stack

- **Backend**: Spring Boot, WebSocket
- **Frontend**: HTML, CSS, JavaScript, SockJS, and STOMP.js
- **Build Tool**: Maven
- **Java Version**: Java 21

---

## Setup Instructions

### Prerequisites

- Java 21 or higher
- Maven

### Steps to Run

1. Clone the repository.
2. Build the project using Maven.
3. Run the application.
4. Access the application in the browser at `http://localhost:8080`.

---

## Key Components

### Backend

1. WebSocket Configuration:
    - Configures STOMP endpoints and message brokers.

2. Chat Controller:
    - Handles incoming messages and user events.

3. WebSocket Event Listener:
    - Tracks WebSocket connection events.

### Frontend

1. HTML File:
    - The entry point for the chat application.
2. JavaScript:
    - Handles WebSocket connection, message sending, and subscription.

---

## Key Endpoints

1. **WebSocket Endpoint**:
    - `/ws`: For establishing WebSocket connections.
2. **Message Mappings**:
    - `/chat.sendMessage`: Sends messages to the chatroom.
    - `/chat.addUser`: Adds a user to the chatroom.

---

## Known Issues

1. **Ambiguous Mapping**:
    - Ensure that all `@MessageMapping` annotations have unique paths.
2. **WebSocket Session Attributes**:
    - Ensure the username is properly set in the session during `/chat.addUser`.

---

## Future Enhancements

- Add private messaging between users.
- Improve UI/UX with frameworks like React or Angular.
- Add database support to persist messages.
- Implement authentication and authorization.

---

## License

This project is licensed under the MIT License. See the LICENSE file for details.

---

## Contributors

- [Pratik Patel](mailto:ptl.pratik717@gmail.com)

