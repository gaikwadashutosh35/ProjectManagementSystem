# Project Management System(Frontend Part)

## Overview

This project is a Project Management System built using React for the frontend and includes various pages such as Home, Project Details, Issue Details, Subscription, and an authentication system with signup and login forms.

## Features

- 🚀 **Project Creation**: Users can create and manage projects seamlessly.
- 📧 **User Invitations**: Invite team members via email for project collaboration.
- 💬 **Real-Time Chat**: Instant communication among team members for effective collaboration.
- 💳 **Subscription Plans**: Manage project limits with free, monthly, and annual subscription options.
- 🔒 **Security**: Utilizes Spring Security and JWT for secure authentication.
- 🛠️ **Modern Design**: Implemented with Tailwind CSS for a responsive and user-friendly interface.

## Key Insights

- 💻 **Seamless User Experience**: The project highlights the importance of integrating both front-end (React) and back-end (Spring Boot) technologies to deliver a cohesive user experience.
- 🔗 **Enhanced Collaboration**: User invitations facilitate easy project onboarding for team members, promoting effective teamwork and communication.
- 💵 **Scalable Subscription Plans**: These plans allow users to manage project limits based on their needs, driving higher engagement.
- 🔒 **Data Security**: The implementation of JWT and Spring Security safeguards user data and restricts access to authenticated users.
- 📦 **Modern Design**: Utilizing Tailwind CSS and Shadcn UI enhances the aesthetics and usability of the application.
- 📈 **Instant Communication**: Real-time chat capabilities are crucial for efficient project management and quick issue resolution.
- 🔍 **Usability and Efficiency**: The ability to filter and search projects by various criteria improves task management and overall user experience.



## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Folder Structure](#folder-structure)
- [Available Scripts](#available-scripts)
- [Dependencies](#dependencies)
- [Contributing](#contributing)
- [License](#license)
  
## Installation

To set up the project locally, follow these steps:

1. **Clone the repository:**

   ```bash
   git clone https://github.com/gaikwadashutosh35/ProjectManagementSystem.git
   ```

   
2. **Navigate to the project directory:**
   
   ```bash
   cd your-repository
   ````

4. **Install dependencies:**
 
    ```bash
    npm install
   ```
## Usage
To run the application locally, use the following command:

   ```bash
   npm install
   ```
This will start the development server and open the application in your default browser. If it doesn't open automatically, navigate to http://localhost:3000.

## Folder Structure
Here is a brief overview of the project's folder structure:
```
├── public
│   ├── index.html
│   └── ...
├── src
│   ├── components
│   │   └── ui
│   │       └── button.jsx
│   ├── pages
│   │   ├── Auth
│   │   │   ├── Auth.jsx
│   │   │   ├── Signup.jsx
│   │   │   └── Login.jsx
│   │   ├── Home
│   │   │   └── Home.jsx
│   │   ├── Navbar
│   │   │   └── Navbar.jsx
│   │   ├── ProjectDetails
│   │   │   └── ProjectDetails.jsx
│   │   ├── IssueDetails
│   │   │   └── IssueDetails.jsx
│   │   ├── Subscription
│   │   │   └── Subscription.jsx
│   ├── App.css
│   ├── App.jsx
│   ├── index.css
│   ├── index.jsx
│   └── ...
├── package.json
└── ...
````

## Available Scripts

In the project directory, you can run:

- `npm start`: Runs the app in the development mode.
- `npm test`: Launches the test runner in the interactive watch mode.
- `npm run build`: Builds the app for production to the build folder.
- `npm run eject`: Removes the single build dependency from your project. 


## Dependencies

This project uses the following main dependencies:

- **React**: A JavaScript library for building user interfaces.
- **react-router-dom:** Declarative routing for React applications.
- **react-hook-form:** A performant, flexible, and extensible form library for React.


## Contributing

Contributions are welcome! Please follow these steps to contribute:

1. Fork the repository.
2. Create a new branch: `git checkout -b my-feature-branch`.
3. Make your changes and commit them: `git commit -m 'Add new feature'`.
4. Push to the branch: `git push origin my-feature-branch`.
5. Submit a pull request.

# Project Management System(Backend Part)

## Introduction
This is a comprehensive Project Management System designed to help teams manage their projects efficiently. The system includes features for task management, team collaboration, and project tracking.

## Features
- Task Creation and Assignment
- Project Timeline Management
- Team Collaboration Tools
- Progress Tracking
- User Authentication

## Technologies Used
- Java
- Spring Boot
- Hibernate
- MySQL
- Thymeleaf

## Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/gaikwadashutosh35/ProjectManagementSystem.git
    ```
2. Navigate to the project directory:
    ```bash
    cd ProjectManagementSystem/projectmanagementsystem
    ```
3. Configure the MySQL database in `application.properties`.
4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

## Usage
1. Open your browser and navigate to `http://localhost:8080`.
2. Register a new account or log in with existing credentials.
3. Start creating and managing your projects.

## Contributing
Contributions are welcome! Please create an issue or submit a pull request.

## License
This project is licensed under the MIT License.

## Contact
For any inquiries, please contact [Ashutosh Gaikwad](mailto:gaikwadashutosh35@gmail.com).

## License

This project is licensed under the MIT License. See the [LICENSE](../LICENSE) file for more details.
