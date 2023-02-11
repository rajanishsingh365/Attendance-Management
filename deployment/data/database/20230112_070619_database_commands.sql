ALTER TABLE "administration$account" ADD "tempdate" TIMESTAMP NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('bc2b5faf-3ec1-41e3-855b-9437cfe40ce0', 
'3078a23e-13b2-4a9b-84e4-2881fdee53c6', 
'TempDate', 
'tempdate', 
20, 
0, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20230112 07:06:19';
