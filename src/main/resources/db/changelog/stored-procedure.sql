CREATE OR REPLACE FUNCTION some_procedure(some_id VARCHAR)
    RETURNS BIGINT
    LANGUAGE PLPGSQL
    SECURITY DEFINER
AS
$$
DECLARE
    gen_id bigint;
BEGIN
    gen_id = 3;
    RETURN gen_id;
END;
$$;