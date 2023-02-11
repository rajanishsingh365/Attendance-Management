ALTER TABLE "attendancemanagement$leaverequestinfo" ADD "numberofdays" DECIMAL(28, 8) NULL;
UPDATE "attendancemanagement$leaverequestinfo"
 SET "numberofdays" = 0;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('714f7a8d-c5a1-490a-8230-306fae45f931', 
'd7c7598b-f3ba-4506-af39-e37f0a932801', 
'NumberOfDays', 
'numberofdays', 
5, 
0, 
'0', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20221230 18:49:01';
