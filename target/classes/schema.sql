CREATE TABLE IF NOT EXISTS ITEM (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255),
    quantity INT
);

CREATE TABLE IF NOT EXISTS SHIPMENT (
    shipment_id BIGINT PRIMARY KEY,
    shipment_date DATE,
    status VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS SHIPMENT_ITEM_IDS (
    shipment_id BIGINT,
    item_ids BIGINT,
    FOREIGN KEY (shipment_id) REFERENCES SHIPMENT(shipment_id)
);

CREATE TABLE IF NOT EXISTS BILL (
    bill_id BIGINT PRIMARY KEY,
    shipment_id BIGINT,
    bill_date DATE,
    amount DOUBLE,
    FOREIGN KEY (shipment_id) REFERENCES SHIPMENT(shipment_id)
);

CREATE TABLE IF NOT EXISTS BILL_SHIPMENT (
    bill_shipment_id BIGINT PRIMARY KEY,
    shipment_id BIGINT,
    bill_date DATE,
    amount DOUBLE,
    FOREIGN KEY (shipment_id) REFERENCES SHIPMENT(shipment_id)
);