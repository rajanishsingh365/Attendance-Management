ALTER TABLE "myfirstmodule$leaverequestinfo" ADD "isapproved" BOOLEAN NULL;
UPDATE "myfirstmodule$leaverequestinfo"
 SET "isapproved" = false;
ALTER TABLE "myfirstmodule$leaverequestinfo" ADD "isdeny" BOOLEAN NULL;
UPDATE "myfirstmodule$leaverequestinfo"
 SET "isdeny" = false;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('896470eb-b720-4756-ba8d-b7e21bcd627d', 
'd7c7598b-f3ba-4506-af39-e37f0a932801', 
'IsDeny', 
'isdeny', 
10, 
0, 
'false', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('9201ea8d-d10b-46ef-b4bf-96fd1cc66aa2', 
'd7c7598b-f3ba-4506-af39-e37f0a932801', 
'IsApproved', 
'isapproved', 
10, 
0, 
'false', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20221230 16:28:07';
