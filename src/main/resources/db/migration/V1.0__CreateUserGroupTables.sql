CREATE TABLE
    IF NOT EXISTS sys_user (
        id BIGSERIAL PRIMARY KEY,
        uid VARCHAR(200)
    );

CREATE TABLE
    IF NOT EXISTS sys_group (
        id BIGSERIAL PRIMARY KEY,
        name VARCHAR(200)
    );

CREATE TABLE
    IF NOT EXISTS sys_membership (
        id BIGSERIAL PRIMARY KEY,
        group_id BIGINT,
        user_id BIGINT,
        CONSTRAINT group_id_fk FOREIGN KEY (group_id) REFERENCES sys_group(id),
        CONSTRAINT user_id_fk FOREIGN KEY (user_id) REFERENCES sys_user(id)
    )