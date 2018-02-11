SELECT t.*, n.name
FROM task t
INNER JOIN task_name n
ON t.id = n.task_id
  AND n.out >= /* now */now()
  AND n.thru >= /* now */now()
WHERE t.out >= /* now */now()

