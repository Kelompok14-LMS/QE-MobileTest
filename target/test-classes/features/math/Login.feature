@Login
Feature: Login
  As a user
  I want to login
  So i can access my dashboard

  Scenario: User login with null email and password
    Given i click Selanjutnya icon
    When i click Selanjutnya icon
    And i click Ayo Mulai icon
    And i input null emaill
    And i input null passwordd
    And i click masuk icon
    Then i get email tidak boleh kosong

  Scenario: User login with valid email and null password
    Given i click Selanjutnya icon
    When i click Selanjutnya icon
    And i click Ayo Mulai icon
    And i input valid emaill
    And i input null passwordd
    And i click masuk icon
    Then i get password tidak boleh kosong

  Scenario: User login with null email and valid password
    Given i click Selanjutnya icon
    When i click Selanjutnya icon
    And i click Ayo Mulai icon
    And i input null emaill
    And i input valid passwordd
    And i click masuk icon
    Then i get email tidak boleh kosong