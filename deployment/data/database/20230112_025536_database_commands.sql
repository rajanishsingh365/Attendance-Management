CREATE TABLE "chat$message" (
	"id" BIGINT NOT NULL,
	"changeddate" TIMESTAMP NULL,
	"createddate" TIMESTAMP NULL,
	"text" VARCHAR_IGNORECASE(200) NULL,
	"system$owner" BIGINT NULL,
	"system$changedby" BIGINT NULL,
	PRIMARY KEY("id"));
CREATE INDEX "idx_chat$message_system$owner" ON "chat$message" ("system$owner" ASC,"id" ASC);
CREATE INDEX "idx_chat$message_system$changedby" ON "chat$message" ("system$changedby" ASC,"id" ASC);
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('5cdd2d85-d270-4efd-93f6-a00d6fba91ea', 
'Chat.Message', 
'chat$message', 
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
 VALUES ('97eee47e-1b54-3402-a4cc-9138a256a240', 
'5cdd2d85-d270-4efd-93f6-a00d6fba91ea', 
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
 VALUES ('6118c3b7-0d87-3ac1-8119-bbd1e5f3c956', 
'5cdd2d85-d270-4efd-93f6-a00d6fba91ea', 
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
 VALUES ('46c79c97-7b54-4df9-94d2-86bb453a16f5', 
'5cdd2d85-d270-4efd-93f6-a00d6fba91ea', 
'Text', 
'text', 
30, 
200, 
'', 
false);
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('8952d953-97ce-346c-b317-35fe7158d4c0', 
'5cdd2d85-d270-4efd-93f6-a00d6fba91ea', 
'idx_chat$message_system$owner');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('8952d953-97ce-346c-b317-35fe7158d4c0', 
'42b42061-ba8c-34e6-a472-86e95a656a5e', 
false, 
0);
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('c316ffa6-e60b-347c-9831-2567a2a5bd8a', 
'5cdd2d85-d270-4efd-93f6-a00d6fba91ea', 
'idx_chat$message_system$changedby');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('c316ffa6-e60b-347c-9831-2567a2a5bd8a', 
'ec88e0c3-12f5-3fb0-9668-862e85ab984d', 
false, 
0);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name")
 VALUES ('42b42061-ba8c-34e6-a472-86e95a656a5e', 
'System.owner', 
'system$owner', 
'5cdd2d85-d270-4efd-93f6-a00d6fba91ea', 
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
 VALUES ('ec88e0c3-12f5-3fb0-9668-862e85ab984d', 
'System.changedBy', 
'system$changedby', 
'5cdd2d85-d270-4efd-93f6-a00d6fba91ea', 
'282e2e60-88a5-469d-84a5-ba8d9151644f', 
'id', 
'system$changedby');
CREATE TABLE "chat$message_account_reciever" (
	"chat$messageid" BIGINT NOT NULL,
	"administration$accountid" BIGINT NOT NULL,
	PRIMARY KEY("chat$messageid","administration$accountid"),
	CONSTRAINT "uniq_chat$message_account_reciever_administration$accountid" UNIQUE ("administration$accountid"),
	CONSTRAINT "uniq_chat$message_account_reciever_chat$messageid" UNIQUE ("chat$messageid"));
CREATE INDEX "idx_chat$message_account_reciever_administration$account_chat$message" ON "chat$message_account_reciever" ("administration$accountid" ASC,"chat$messageid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('40a87698-de5d-4e2d-902d-ea5a4e0f8fa6', 
'Chat.Message_Account_Reciever', 
'chat$message_account_reciever', 
'5cdd2d85-d270-4efd-93f6-a00d6fba91ea', 
'3078a23e-13b2-4a9b-84e4-2881fdee53c6', 
'chat$messageid', 
'administration$accountid', 
'idx_chat$message_account_reciever_administration$account_chat$message');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_chat$message_account_reciever_administration$accountid', 
'40a87698-de5d-4e2d-902d-ea5a4e0f8fa6', 
'36011b06-330a-3e35-abb4-68c300b3b1ed');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_chat$message_account_reciever_chat$messageid', 
'40a87698-de5d-4e2d-902d-ea5a4e0f8fa6', 
'2cfe77b8-9fc8-34b9-9179-a33c265bf784');
CREATE TABLE "chat$message_account_sender" (
	"chat$messageid" BIGINT NOT NULL,
	"administration$accountid" BIGINT NOT NULL,
	PRIMARY KEY("chat$messageid","administration$accountid"),
	CONSTRAINT "uniq_chat$message_account_sender_administration$accountid" UNIQUE ("administration$accountid"),
	CONSTRAINT "uniq_chat$message_account_sender_chat$messageid" UNIQUE ("chat$messageid"));
CREATE INDEX "idx_chat$message_account_sender_administration$account_chat$message" ON "chat$message_account_sender" ("administration$accountid" ASC,"chat$messageid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('baf4684d-4867-40d0-859f-8be3123e7c7c', 
'Chat.Message_Account_Sender', 
'chat$message_account_sender', 
'5cdd2d85-d270-4efd-93f6-a00d6fba91ea', 
'3078a23e-13b2-4a9b-84e4-2881fdee53c6', 
'chat$messageid', 
'administration$accountid', 
'idx_chat$message_account_sender_administration$account_chat$message');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_chat$message_account_sender_administration$accountid', 
'baf4684d-4867-40d0-859f-8be3123e7c7c', 
'cbb01d6f-6501-32a8-92a1-b417872417d5');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_chat$message_account_sender_chat$messageid', 
'baf4684d-4867-40d0-859f-8be3123e7c7c', 
'19a87908-761b-3d59-add3-1e85a6db7f6b');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20230112 02:55:36';
