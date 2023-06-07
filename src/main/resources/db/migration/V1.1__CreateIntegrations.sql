CREATE TABLE
    IF NOT EXISTS sys_integration (
        id BIGSERIAL PRIMARY KEY,
        name VARCHAR(200)
    );

CREATE TABLE
    IF NOT EXISTS sys_group_integration (
        id BIGSERIAL PRIMARY KEY,
        group_id BIGINT,
        integration_id BIGINT,
        CONSTRAINT group_id_fk FOREIGN KEY (group_id) REFERENCES sys_group(id),
        CONSTRAINT integration_id_fk FOREIGN KEY (integration_id) REFERENCES sys_integration(id)
    )