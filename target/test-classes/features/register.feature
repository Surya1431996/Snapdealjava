Feature: Register Functionality
  Scenario: Registration_with_all_fields
    Given i navigate to siginpage
    When i navigated to register page
    When i eneter to frameone field
    When i enter mobileno "teja05863@gmail.com" field
    When i eneter to continue button
    When i enters email "9560432707" field
    When i enetrs name "surya" field
    When i enters dob field
    When i enters password "Surya@123" field
    When i enters pass continue field
    Then i eneters to validation  page

  Scenario: Registration with invalid email
    Given i navigate to siginpage
    When i navigated to register page
    When i eneter to frameone field
    When i enter mobileno "teja05863@gmail" field
    When i eneter to continue button
    Then it shows  validationone page

  Scenario: Registration with registered email
    Given i navigate to siginpage
    When i navigated to register page
    When i eneter to frameone field
    When i enter mobileno "ast98490@gmail.com" field
    When i eneter to continue button
    Then it show  validationtwo page

  Scenario: Registration with invalid mobile no
    Given i navigate to siginpage
    When i navigated to register page
    When i eneter to frameone field
    When i enter mobileno "teju89011@gmail.com" field
    When i eneter to continue button
    When i enters email "956043270" field
    When i enetrs name "surya" field
    When i enters dob field
    When i enters password "Surya@123" field
    When i enters pass continue field
    Then i eneters to validationThree page

  Scenario: Registration with registered mobile no
    Given i navigate to siginpage
    When i navigated to register page
    When i eneter to frameone field
    When i enter mobileno "teju89011@gmail.com" field
    When i eneter to continue button
    When i enters email "9560432706" field
    When i enetrs name "surya" field
    When i enters dob field
    When i enters password "Surya@123" field
    When i enters pass continue field
    Then i eneters to validationfour  page

  Scenario: Registration with invalid name
    Given i navigate to siginpage
    When i navigated to register page
    When i eneter to frameone field
    When i enter mobileno "teju89011@gmail.com" field
    When i eneter to continue button
    When i enters email "9560432706" field
    When i enetrs name "s" field
    When i enters dob field
    When i enters password "Surya@123" field
    When i enters pass continue field
    Then i eneters to validationfive  page

  Scenario: Registration with invalid password
    Given i navigate to siginpage
    When i navigated to register page
    When i eneter to frameone field
    When i enter mobileno "teju89011@gmail.com" field
    When i eneter to continue button
    When i enters email "9560432706" field
    When i enetrs name "surya" field
    When i enters dob field
    When i enters password "Sur" field
    When i enters pass continue field
    Then i eneters to validationsix  page


  Scenario: Registration with valid no invalid name and password
    Given i navigate to siginpage
    When i navigated to register page
    When i eneter to frameone field
    When i enter mobileno "teju89011@gmail.com" field
    When i eneter to continue button
    When i enters email "9560432706" field
    When i enetrs name "" field
    When i enters dob field
    When i enters password "" field
    When i enters pass continue field
    Then i eneters to validationseven  page


  Scenario: Registration with valid name invalid no and password
    Given i navigate to siginpage
    When i navigated to register page
    When i eneter to frameone field
    When i enter mobileno "teju89011@gmail.com" field
    When i eneter to continue button
    When i enters email "" field
    When i enetrs name "surya " field
    When i enters dob field
    When i enters password "" field
    When i enters pass continue field
    Then i eneters to validationeight  page

  Scenario: Registration with valid pass invalid no and name
    Given i navigate to siginpage
    When i navigated to register page
    When i eneter to frameone field
    When i enter mobileno "teju89011@gmail.com" field
    When i eneter to continue button
    When i enters email "" field
    When i enetrs name "" field
    When i enters dob field
    When i enters password "Surya@123 " field
    When i enters pass continue field
    Then i eneters to validationnine  page

  Scenario: Registration with valid mob invalid pass and valid name
    Given i navigate to siginpage
    When i navigated to register page
    When i eneter to frameone field
    When i enter mobileno "teju89011@gmail.com" field
    When i eneter to continue button
    When i enters email "9560432706" field
    When i enetrs name "surya" field
    When i enters dob field
    When i enters password "" field
    When i enters pass continue field
    Then i eneters to validationten  page

  Scenario: Registration with valid mob invalid name and valid pass
    Given i navigate to siginpage
    When i navigated to register page
    When i eneter to frameone field
    When i enter mobileno "teju89011@gmail.com" field
    When i eneter to continue button
    When i enters email "9560432706" field
    When i enetrs name "" field
    When i enters dob field
    When i enters password "Surya@123" field
    When i enters pass continue field
    Then i eneters to validationeleven  page

  Scenario: Registration with valid nam invalid no and valid pass
    Given i navigate to siginpage
    When i navigated to register page
    When i eneter to frameone field
    When i enter mobileno "teju89011@gmail.com" field
    When i eneter to continue button
    When i enters email "" field
    When i enetrs name "surya" field
    When i enters dob field
    When i enters password "Surya@123" field
    When i enters pass continue field
    Then i eneters to validationtweleve  page

  Scenario: Registration with empty fields
    Given i navigate to siginpage
    When i navigated to register page
    When i eneter to frameone field
    When i enter mobileno "teju89011@gmail.com" field
    When i eneter to continue button
    When i enters email "" field
    When i enetrs name "" field
    When i enters dob field
    When i enters password "" field
    When i enters pass continue field
    Then i enetesr to validationthirteen  page

