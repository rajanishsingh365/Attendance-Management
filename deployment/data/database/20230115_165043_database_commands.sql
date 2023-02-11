CREATE TABLE "chatbot$chat" (
	"id" BIGINT NOT NULL,
	"answer" VARCHAR_IGNORECASE(2147483647) NULL,
	"changeddate" TIMESTAMP NULL,
	"createddate" TIMESTAMP NULL,
	"questions" VARCHAR_IGNORECASE(2147483647) NULL,
	"system$owner" BIGINT NULL,
	"system$changedby" BIGINT NULL,
	PRIMARY KEY("id"));
CREATE INDEX "idx_chatbot$chat_system$owner" ON "chatbot$chat" ("system$owner" ASC,"id" ASC);
CREATE INDEX "idx_chatbot$chat_system$changedby" ON "chatbot$chat" ("system$changedby" ASC,"id" ASC);
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('d1ea4739-64cd-42ee-ace9-c27c34fcd4c7', 
'ChatBot.Chat', 
'chatbot$chat', 
false, 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('6ec0228a-6be5-4084-9c3d-457c2315d556', 
'd1ea4739-64cd-42ee-ace9-c27c34fcd4c7', 
'Answer', 
'answer', 
30, 
0, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('af6f96af-a69d-3b16-8c40-0c710a5aa813', 
'd1ea4739-64cd-42ee-ace9-c27c34fcd4c7', 
'changedDate', 
'changeddate', 
20, 
0, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('8ca2d1de-8ed0-3bb3-b32b-8924f5cdfc83', 
'd1ea4739-64cd-42ee-ace9-c27c34fcd4c7', 
'createdDate', 
'createddate', 
20, 
0, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('e9331b8f-efc1-42d6-9ac9-6fad26cfc28d', 
'd1ea4739-64cd-42ee-ace9-c27c34fcd4c7', 
'Questions', 
'questions', 
30, 
0, 
'', 
false);
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('6c3703a8-f529-3143-9a3b-72f21896bd5a', 
'd1ea4739-64cd-42ee-ace9-c27c34fcd4c7', 
'idx_chatbot$chat_system$owner');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('6c3703a8-f529-3143-9a3b-72f21896bd5a', 
'0b6e5f7a-dcb9-3aba-a61f-53f9eb745c8f', 
false, 
0);
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('0565908d-f6c8-3695-92e5-6ed11af225a7', 
'd1ea4739-64cd-42ee-ace9-c27c34fcd4c7', 
'idx_chatbot$chat_system$changedby');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('0565908d-f6c8-3695-92e5-6ed11af225a7', 
'51c2f742-d9bd-307c-94e9-d42f74dbd4e5', 
false, 
0);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name")
 VALUES ('0b6e5f7a-dcb9-3aba-a61f-53f9eb745c8f', 
'System.owner', 
'system$owner', 
'd1ea4739-64cd-42ee-ace9-c27c34fcd4c7', 
'282e2e60-88a5-469d-84a5-ba8d9151644f', 
'id', 
'system$owner');
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name")
 VALUES ('51c2f742-d9bd-307c-94e9-d42f74dbd4e5', 
'System.changedBy', 
'system$changedby', 
'd1ea4739-64cd-42ee-ace9-c27c34fcd4c7', 
'282e2e60-88a5-469d-84a5-ba8d9151644f', 
'id', 
'system$changedby');
CREATE TABLE "chatbot$chat_account" (
	"chatbot$chatid" BIGINT NOT NULL,
	"administration$accountid" BIGINT NOT NULL,
	PRIMARY KEY("chatbot$chatid","administration$accountid"),
	CONSTRAINT "uniq_chatbot$chat_account_chatbot$chatid" UNIQUE ("chatbot$chatid"));
CREATE INDEX "idx_chatbot$chat_account_administration$account_chatbot$chat" ON "chatbot$chat_account" ("administration$accountid" ASC,"chatbot$chatid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('7f9b4016-6eb4-430e-aff0-b75793db3c20', 
'ChatBot.Chat_Account', 
'chatbot$chat_account', 
'd1ea4739-64cd-42ee-ace9-c27c34fcd4c7', 
'3078a23e-13b2-4a9b-84e4-2881fdee53c6', 
'chatbot$chatid', 
'administration$accountid', 
'idx_chatbot$chat_account_administration$account_chatbot$chat');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_chatbot$chat_account_chatbot$chatid', 
'7f9b4016-6eb4-430e-aff0-b75793db3c20', 
'956bf424-aaa7-3a73-a314-4afada925dbd');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20230115 16:50:43';
