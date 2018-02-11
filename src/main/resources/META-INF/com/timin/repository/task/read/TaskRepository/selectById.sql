SELECT *
FROM task t
INNER JOIN task_name ON t.id = n.task_id
WHERE t.out >= now();
