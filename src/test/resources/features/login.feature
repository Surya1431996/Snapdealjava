Feature: Login Functionality
  Scenario: Login_with_all_ registered fields
    Given i navigated to siginpage
    When i navigate to register page
    When i eneter to frame field
    When i enter mobile "9560432706" field
    When i enter to continue button
    When i enter to otp button
    Then i enter to validationonepage

  Scenario: Login_with_all_ not registered mail fields
    Given i navigated to siginpage
    When i navigate to register page
    When i eneter to frame field
    When i enter mobile "asshahi1991@gmail.com" fieldone
    When i enter to continueone button
    Then i enter to validationtwopage

  Scenario: Login_with_all_ not valid mail fields
    Given i navigated to siginpage
    When i navigate to register page
    When i eneter to frame field
    When i enter mobile "ast.com" fieldtwo
    When i enter to continueone button
    Then i enter to validationthreepage

  Scenario: Login_with_all_ empty fields
    Given i navigated to siginpage
    When i navigate to register page
    When i eneter to frame field
    When i enter mobile " " fieldthree
    When i enter to continueone button
    Then i enter to validationfourpage

  Scenario: Login_with_un registered gmail fields
    Given i navigated to siginpage
    When i navigate to register page
    When i eneter to frame field
    When i enter to google field
    When i enter to email "ast9849098490@gmail.com" field
    When i eneter to next
    When i enter to password "surya@123" field
    When i enter to pass next
    Then i enter to validation five page

  Scenario: Login_with_registered gmail fields
    Given i navigated to siginpage
    When i navigate to register page
    When i eneter to frame field
    When i enter to google field
    When i enter to email "ast984904@gmail.com" fieldone
    When i eneter to next
    When i enter to password "surya@123" field
    When i enter to pass next
    Then i enter to validation six page




