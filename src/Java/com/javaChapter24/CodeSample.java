package Java.com.javaChapter24;

public class CodeSample {
    /**
     * -> DEFINITION
     * A database is an organised collection of data.
     * A database management System (DBMS) provides an efficient way of organising, storing and retrieving user data.
     *
     * -> JDBC (Java Database Connectivity)
     *  Java programs interact with databases using the JDBC.
     *  A JDBC driver enables java applications to connect to database ina particular DBMS and allows you to manipulate
     *  that DB using JDBC API.
     *
     *  -> RELATIONAL DB
     *  A relational DB is a logical representation of data that allows the data to be accessed
     *  without the consideration of its physical structure.
     *  A relational DB stores data in tables.
     *
     *  -> DATA MODEL
     *  A data model is a diagram that shows the representation of tables and their relationship.
     *  It helps us understand the purpose of the table as well as their dependencies.
     *
     *  -> STAGES OF DATA MODEL
     *  1. Conceptual Data Model -> These are Entities that are square in shape,
     *      with a line connecting them to indicate their relationship. Highly abstract.
     *
     *  2. Logical Data Model -> The Entities are represented as squares with additional information on the entities.
     *
     *  3. Physical Data Model -> These are tables model that is specific to a DB.
     *
     *  -> KEYS
     *  1. Primary Key -> A column of group of columns with a value unique for each row.
     *
     *  2. Foreign Key -> A column in a tables that matches the primary key column of another table.
     *
     *  3. Composite Key Primary Key -> Two columns that are primary key on another table.
     *  NOTE ->
     *  ===> Auto_increment columns are so-called identity columns.
     *  ===> A goal when designing a database is to minimize the amount of duplicate data among the database's tables.
     *  ===> Rule of Referential Integrity state that " Every foreign key mush appear as another table's primary key value"
     *  ===> Rule of Entity Integrity state that "Every rows must have a primary key value, and that value must be unique in the table"
     *
     *
     * -> RELATIONSHIP BETWEEN TABLES
     * 1. One-To-Many
     * 2. Many-To-One
     * 3. One-To-One
     * 4. Many-To-Many
     *
     *
     */
}
