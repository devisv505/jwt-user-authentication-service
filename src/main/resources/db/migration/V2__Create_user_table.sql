CREATE TABLE IF NOT EXISTS users (
    id            SERIAL        NOT NULL PRIMARY KEY,
    user_login    VARCHAR(255)  NOT NULL,
    user_pass     VARCHAR(1000) NOT NULL,
    creation_at   TIMESTAMP     NOT NULL DEFAULT now(),
    removal_at    TIMESTAMP,
    last_login_at TIMESTAMP,
    active        BOOLEAN       NOT NULL DEFAULT FALSE
);
