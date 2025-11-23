INSERT INTO ITEM (id, name, quantity) VALUES (1, 'Laptop', 10);
INSERT INTO ITEM (id, name, quantity) VALUES (2, 'Mouse', 50);
INSERT INTO ITEM (id, name, quantity) VALUES (3, 'Keyboard', 20);

INSERT INTO SHIPMENT (shipment_id, shipment_date, status) VALUES (1001, '2025-11-01', 'pending');
INSERT INTO SHIPMENT (shipment_id, shipment_date, status) VALUES (1002, '2025-11-12', 'dispatched');

INSERT INTO SHIPMENT_ITEM_IDS (shipment_id, item_ids) VALUES (1001, 1);
INSERT INTO SHIPMENT_ITEM_IDS (shipment_id, item_ids) VALUES (1001, 2);
INSERT INTO SHIPMENT_ITEM_IDS (shipment_id, item_ids) VALUES (1002, 3);

INSERT INTO BILL (bill_id, shipment_id, bill_date, amount) VALUES (50001, 1001, '2025-11-02', 25000.00);
INSERT INTO BILL (bill_id, shipment_id, bill_date, amount) VALUES (50002, 1002, '2025-11-13', 3000.00);

INSERT INTO BILL_SHIPMENT (bill_shipment_id, shipment_id, bill_date, amount) VALUES (60001, 1001, '2025-11-03', 25500.00);
INSERT INTO BILL_SHIPMENT (bill_shipment_id, shipment_id, bill_date, amount) VALUES (60002, 1002, '2025-11-14', 3050.00);