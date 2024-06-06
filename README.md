# Project Management System

## Overview

This project is a Project Management System built using React for the frontend and includes various pages such as Home, Project Details, Issue Details, Subscription, and an authentication system with signup and login forms.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Folder Structure](#folder-structure)
- [Available Scripts](#available-scripts)
- [Dependencies](#dependencies)
- [Contributing](#contributing)

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
---

- `npm start`: Runs the app in the development mode.
- `npm test`: Launches the test runner in the interactive watch mode.
- `npm run build`: Builds the app for production to the build folder.
- `npm run eject`: Removes the single build dependency from your project. 
--- 

## Dependencies
This project uses the following main dependencies:

---
- **React**: A JavaScript library for building user interfaces.
- **react-router-dom:** Declarative routing for React applications.
- **react-hook-form:** A performant, flexible, and extensible form library for React.
---

## Contributing
Contributions are welcome! Please follow these steps to contribute:
---
- Fork the repository.
- Create a new branch: `git checkout -b my-feature-branch`.
- Make your changes and commit them: `git commit -m 'Add new feature'`.
- Push to the branch: `git push origin my-feature-branch`.
- Submit a pull request.
---

