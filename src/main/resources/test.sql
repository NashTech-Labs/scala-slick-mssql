CREATE DATABASE test;

CREATE TABLE user_profiles (
  id         INT IDENTITY (1, 1) PRIMARY KEY,
  first_name VARCHAR(100) NOT NULL,
  last_name  VARCHAR(100) NOT NULL
);
