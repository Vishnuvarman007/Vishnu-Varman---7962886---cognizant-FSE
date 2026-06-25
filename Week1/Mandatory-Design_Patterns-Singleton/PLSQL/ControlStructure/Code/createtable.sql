CREATE TABLE customers (
                           customer_id NUMBER PRIMARY KEY,
                           customer_name VARCHAR2(100),
                           age NUMBER,
                           balance NUMBER,
                           isvip VARCHAR2(5)
);

CREATE TABLE loans (
                       loan_id NUMBER PRIMARY KEY,
                       customer_id NUMBER,
                       interest_rate NUMBER,
                       due_date DATE,
                       FOREIGN KEY (customer_id)
                           REFERENCES customers(customer_id)
);