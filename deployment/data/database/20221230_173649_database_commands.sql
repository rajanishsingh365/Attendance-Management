ALTER TABLE "attendancemanagement$leaverequestinfo" ADD "leavestatus" VARCHAR_IGNORECASE(8) NULL;
UPDATE "attendancemanagement$leaverequestinfo"
 SET "leavestatus" = 'Pending';
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('8e7101d7-2640-44c6-bab0-58258e326483', 
'd7c7598b-f3ba-4506-af39-e37f0a932801', 
'LeaveStatus', 
'leavestatus', 
40, 
8, 
'Pending', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20221230 17:36:49';
