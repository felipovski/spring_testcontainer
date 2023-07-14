CREATE DATABASE customerdb;

CREATE TABLE customer (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    phone VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL
);


INSERT INTO customer (name, email, phone, address)
VALUES
    ('John Doe', 'john.doe@example.com', '1234567890', '123 Main St'),
    ('Jane Smith', 'jane.smith@example.com', '0987654321', '456 Elm St'),
    ('Michael Johnson', 'michael.johnson@example.com', '9876543210', '789 Oak Ave'),
    ('Emily Davis', 'emily.davis@example.com', '5678901234', '321 Maple Ln'),
    ('David Wilson', 'david.wilson@example.com', '6789012345', '654 Pine Rd'),
    ('Sarah Anderson', 'sarah.anderson@example.com', '3456789012', '987 Cedar Blvd'),
    ('Robert Thompson', 'robert.thompson@example.com', '4567890123', '210 Birch Ave'),
    ('Jennifer Garcia', 'jennifer.garcia@example.com', '2345678901', '543 Oak St'),
    ('William Martinez', 'william.martinez@example.com', '9012345678', '876 Elm Dr'),
    ('Jessica Robinson', 'jessica.robinson@example.com', '1234902345', '109 Maple Rd');