# TaskManagerWebApp 
## Spring Data JPA + Hibernate + PostgreSQL + Spring MVC
**Project description:** Task manager is Java application for creating task and saving it in database. Task consists of: task name, task description, task status, task priority, task date.

## Demo
**task table**

CREATE TABLE task
(
  id bigint NOT NULL,
  date timestamp without time zone NOT NULL,
  description character varying(256),
  name character varying(256) NOT NULL,
  priority character varying(256) NOT NULL,
  status character varying(256) NOT NULL,
  CONSTRAINT task_pkey PRIMARY KEY (id)
)

https://drive.google.com/file/d/0B8idIAISylXFUXZBaEdvSGhielk/view?usp=sharing

**view**

https://drive.google.com/file/d/0B8idIAISylXFQXE0R3dqcFNVQzA/view?usp=sharing

https://drive.google.com/open?id=0B8idIAISylXFRG1NZFRMeGJITkU



