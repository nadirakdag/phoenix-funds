# PhoenixFunds API

> Where your finances rise from the ashes, just like a phoenix.

## Business Requirements

### Account Initialization:

- When a user registers, their account should be initialized with an initial balance, which can be set to zero or a predefined amount.
- Implement a notification service to inform user, the account initialized
- Account could be any type of currency including crypto

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

## Technical Requirements 

### Endpoints

``````
[GET]  account/:account-id/ 
[POST] account/
[POST] account/:account-id/withdraw
[POST] account/:account-id/deposit
[GET]  account/:account-id/history
[GET]  account/:account-id/history/:transaction-id
``````

