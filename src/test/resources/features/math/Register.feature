@Register
Feature: Register
  As a user
  I want to register new account
  So i can create new account

  Scenario: User open register page
    Given i click Selanjutnya icon
    When i click Selanjutnya icon
    And i click Ayo Mulai icon
    And i click daftar icon
    Then i go to register page

  Scenario: User create new account with valid input
    Given i click Selanjutnya icon
    When i click Selanjutnya icon
    And i click Ayo Mulai icon
    And i click daftar icon
    And i input valid nama lengkap
    And i input valid email
    And i input valid nomer ponsel
    And i input valid password
    Then i click daftar

  Scenario: User create new account with null input
    Given i click Selanjutnya icon
    When i click Selanjutnya icon
    And i click Ayo Mulai icon
    And i click daftar icon
    And i input null nama lengkap
    And i input null email
    And i input null nomer ponsel
    And i input null password
    And i click daftar
    Then i get error message nama lengkap tidak boleh kosong

  Scenario: User create new account with nama lengkap only
    Given i click Selanjutnya icon
    When i click Selanjutnya icon
    And i click Ayo Mulai icon
    And i click daftar icon
    And i input valid nama lengkap
    And i input null email
    And i input null nomer ponsel
    And i input null password
    And i click daftar
    Then i get error message email tidak boleh kosong

  Scenario: User create new account with email only
    Given i click Selanjutnya icon
    When i click Selanjutnya icon
    And i click Ayo Mulai icon
    And i click daftar icon
    And i input null nama lengkap
    And i input valid email
    And i input null nomer ponsel
    And i input null password
    And i click daftar
    Then i get error message nama lengkap tidak boleh kosong

  Scenario: User create new account with nomor ponsel only
    Given i click Selanjutnya icon
    When i click Selanjutnya icon
    And i click Ayo Mulai icon
    And i click daftar icon
    And i input null nama lengkap
    And i input null email
    And i input valid nomer ponsel
    And i input null password
    And i click daftar
    Then i get error message nama lengkap tidak boleh kosong

  Scenario: User create new account with password only
    Given i click Selanjutnya icon
    When i click Selanjutnya icon
    And i click Ayo Mulai icon
    And i click daftar icon
    And i input null nama lengkap
    And i input null email
    And i input null nomer ponsel
    And i input valid password
    And i click daftar
    Then i get error message nama lengkap tidak boleh kosong

  Scenario: User create new account with nama lengkap and email only
    Given i click Selanjutnya icon
    When i click Selanjutnya icon
    And i click Ayo Mulai icon
    And i click daftar icon
    And i input valid nama lengkap
    And i input valid email
    And i input null nomer ponsel
    And i input null password
    And i click daftar
    Then i get error message nomor ponsel tidak boleh kosong

  Scenario: User create new account with nomor ponsel and password only
    Given i click Selanjutnya icon
    When i click Selanjutnya icon
    And i click Ayo Mulai icon
    And i click daftar icon
    And i input null nama lengkap
    And i input null email
    And i input valid nomer ponsel
    And i input valid password
    And i click daftar
    Then i get error message email tidak boleh kosong

  Scenario: User create new account with nama lengkap and nomor ponsel only
    Given i click Selanjutnya icon
    When i click Selanjutnya icon
    And i click Ayo Mulai icon
    And i click daftar icon
    And i input valid nama lengkap
    And i input null email
    And i input valid nomer ponsel
    And i input null password
    And i click daftar
    Then i get error message email tidak boleh kosong

  Scenario: User create new account with nama lengkap and password only
    Given i click Selanjutnya icon
    When i click Selanjutnya icon
    And i click Ayo Mulai icon
    And i click daftar icon
    And i input valid nama lengkap
    And i input null email
    And i input null nomer ponsel
    And i input valid password
    And i click daftar
    Then i get error message email tidak boleh kosong

  Scenario: User create new account with email and nomor ponsel only
    Given i click Selanjutnya icon
    When i click Selanjutnya icon
    And i click Ayo Mulai icon
    And i click daftar icon
    And i input null nama lengkap
    And i input valid email
    And i input valid nomer ponsel
    And i input null password
    And i click daftar
    Then i get error message nama lengkap tidak boleh kosong

  Scenario: User create new account with email and password only
    Given i click Selanjutnya icon
    When i click Selanjutnya icon
    And i click Ayo Mulai icon
    And i click daftar icon
    And i input null nama lengkap
    And i input valid email
    And i input null nomer ponsel
    And i input valid password
    And i click daftar
    Then i get error message nama lengkap tidak boleh kosong

  Scenario: User create new account with invalid email
    Given i click Selanjutnya icon
    When i click Selanjutnya icon
    And i click Ayo Mulai icon
    And i click daftar icon
    And i input valid nama lengkap
    And i input invalid email
    And i input valid nomer ponsel
    And i input valid password
    And i click daftar
    Then i get error message masukkan email dengan benar