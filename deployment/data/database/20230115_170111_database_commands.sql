ALTER TABLE "chatbot$chat" ALTER COLUMN "questions" RENAME TO "question";
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'd1ea4739-64cd-42ee-ace9-c27c34fcd4c7', 
"attribute_name" = 'Question', 
"column_name" = 'question', 
"type" = 30, 
"length" = 0, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = 'e9331b8f-efc1-42d6-9ac9-6fad26cfc28d';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20230115 17:01:11';
