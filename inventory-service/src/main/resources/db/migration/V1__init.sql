CREATE TABLE venues (
    id BIGINT NOT NULL AUTO_INCREMENT,
    address VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    total_capacity INTEGER NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE events (
    id BIGINT NOT NULL AUTO_INCREMENT,
    left_capacity INTEGER NOT NULL,
    name VARCHAR(255) NOT NULL,
    total_capacity INTEGER NOT NULL,
    venue_id BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (venue_id) REFERENCES venues (id)
);