# PhoenixFunds API

> Where your finances rise from the ashes, just like a phoenix.

## Business Functionalities

### Account Initialization:

- When a user registers, their account should be initialized with an initial balance, which can be set to zero or a predefined amount.
- Implement a notification service to inform user, the account initialized
- Account could be any type of currency

### Deposit Functionality:

- Users should be able to deposit funds into their accounts.
    Specify the allowed deposit methods (e.g., credit card, bank transfer, etc.).
- Implement validation checks to ensure the deposited amount is valid and within defined limits.
- Provide a confirmation mechanism for successful deposits.
- Implement a notification service to inform user, the account got a deposit

### Withdrawal Functionality:

- Users should be able to withdraw funds from their accounts.
- Specify withdrawal methods and limits.
- Implement validation checks to ensure the withdrawal amount is valid and within available balance limits.
- Provide a confirmation mechanism for successful withdrawals.
- Implement a notification service to inform user, the a withdraw initialized 

### Transaction History:

- Maintain a transaction history for each user, including details such as transaction type (deposit/withdrawal), amount, date, and any relevant transaction ID.
- Users should be able to retrieve their transaction history.
- Users should be able to retrieve their transaction detail by transaction id.

### Balance Inquiry:

- Users should be able to check their current account balance at any time.
- Ensure that the balance returned is accurate and reflects the latest transactions.
- Include a timestamp in balance inquiry responses to indicate the last update time.

### [DRAFT] Exchange Functionality:

- User should be able to exchange currencies between accounts
- In each exchange there should be a withdrawal, deposit and exchange records
- When user exchange currencies if there is a applicable tax then there should be a separate withdraw record

## Technical Side 

### Endpoints

``````
[GET]  accounts/                                        //returns all the account user has
[GET]  accounts/:account-id/                            //returns specific account
[POST] accounts/                                        //creates new acount
[POST] accounts/:account-id/withdraw                    //creates a withdraw request
[POST] accounts/:account-id/deposit                     //creates a deposit request
[GET]  accounts/:account-id/history                     //returns account history
[GET]  accounts/:account-id/history/:transaction-id     //returns specific account transaction
``````

### Tech Stack

- Java Spring
- PostgreSQL
- HTTP Rest and gRPC endpoints
- Redis 

### Must have 

- Integration tests
- Unit Tests
- Dockerfile
- Docker compose file local environment
- Swagger
- Health endpoint
- Monitoring endpoint
- Logging
- JWT Authorization and Authentication
- Other microservice integration (like notification, auth service etc. as a mock just log the request actually send it)