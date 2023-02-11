CREATE TABLE "imagecreator$links" (
	"id" BIGINT NOT NULL,
	"imagelinks" VARCHAR_IGNORECASE(500) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('953f83ce-b436-4126-8492-e5682dfe1f0f', 
'ImageCreator.Links', 
'imagecreator$links', 
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
 VALUES ('1ff79587-9dc1-4fac-bb67-dffcee04140f', 
'953f83ce-b436-4126-8492-e5682dfe1f0f', 
'ImageLinks', 
'imagelinks', 
30, 
500, 
'', 
false);
CREATE TABLE "imagecreator$links_image" (
	"imagecreator$linksid" BIGINT NOT NULL,
	"imagecreator$imageid" BIGINT NOT NULL,
	PRIMARY KEY("imagecreator$linksid","imagecreator$imageid"),
	CONSTRAINT "uniq_imagecreator$links_image_imagecreator$linksid" UNIQUE ("imagecreator$linksid"));
CREATE INDEX "idx_imagecreator$links_image_imagecreator$image_imagecreator$links" ON "imagecreator$links_image" ("imagecreator$imageid" ASC,"imagecreator$linksid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('64fe2caa-4489-46bd-b39b-4605aed085c9', 
'ImageCreator.Links_Image', 
'imagecreator$links_image', 
'953f83ce-b436-4126-8492-e5682dfe1f0f', 
'2146d2e9-d01f-4fc5-a204-e87ac0e27adf', 
'imagecreator$linksid', 
'imagecreator$imageid', 
'idx_imagecreator$links_image_imagecreator$image_imagecreator$links');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_imagecreator$links_image_imagecreator$linksid', 
'64fe2caa-4489-46bd-b39b-4605aed085c9', 
'3efd69e1-8418-39fd-9bec-4f44549d9114');
CREATE TABLE "imagecreator$image" (
	"id" BIGINT NOT NULL,
	"changeddate" TIMESTAMP NULL,
	"createddate" TIMESTAMP NULL,
	"size" VARCHAR_IGNORECASE(200) NULL,
	"numberofimages" INT NULL,
	"imagedetails" VARCHAR_IGNORECASE(2147483647) NULL,
	"system$owner" BIGINT NULL,
	"system$changedby" BIGINT NULL,
	PRIMARY KEY("id"));
CREATE INDEX "idx_imagecreator$image_system$owner" ON "imagecreator$image" ("system$owner" ASC,"id" ASC);
CREATE INDEX "idx_imagecreator$image_system$changedby" ON "imagecreator$image" ("system$changedby" ASC,"id" ASC);
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('2146d2e9-d01f-4fc5-a204-e87ac0e27adf', 
'ImageCreator.Image', 
'imagecreator$image', 
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
 VALUES ('80da0aa9-e740-3b2e-bedc-3649ca11e60b', 
'2146d2e9-d01f-4fc5-a204-e87ac0e27adf', 
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
 VALUES ('cbb528d9-fc3f-3234-968d-563739f20668', 
'2146d2e9-d01f-4fc5-a204-e87ac0e27adf', 
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
 VALUES ('a621d776-65a3-459d-bfe9-479a515fb3bc', 
'2146d2e9-d01f-4fc5-a204-e87ac0e27adf', 
'Size', 
'size', 
30, 
200, 
'1024x1024', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('0df6f7a0-e86b-4b03-9f5c-b806e9a95170', 
'2146d2e9-d01f-4fc5-a204-e87ac0e27adf', 
'NumberOfImages', 
'numberofimages', 
3, 
0, 
'1', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('92a3ea66-1952-40f2-b7af-fffdbee97c29', 
'2146d2e9-d01f-4fc5-a204-e87ac0e27adf', 
'ImageDetails', 
'imagedetails', 
30, 
0, 
'', 
false);
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('4a6efb6f-a68a-30f3-b050-58471bdc78e6', 
'2146d2e9-d01f-4fc5-a204-e87ac0e27adf', 
'idx_imagecreator$image_system$owner');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('4a6efb6f-a68a-30f3-b050-58471bdc78e6', 
'49acd8f5-8f8d-3a61-9944-aaf219addf9c', 
false, 
0);
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('98474ab4-be5b-3c4a-8968-c89d13845c19', 
'2146d2e9-d01f-4fc5-a204-e87ac0e27adf', 
'idx_imagecreator$image_system$changedby');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('98474ab4-be5b-3c4a-8968-c89d13845c19', 
'e71daf2c-91b5-3e77-882b-acd0cf9dfcc9', 
false, 
0);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name")
 VALUES ('49acd8f5-8f8d-3a61-9944-aaf219addf9c', 
'System.owner', 
'system$owner', 
'2146d2e9-d01f-4fc5-a204-e87ac0e27adf', 
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
 VALUES ('e71daf2c-91b5-3e77-882b-acd0cf9dfcc9', 
'System.changedBy', 
'system$changedby', 
'2146d2e9-d01f-4fc5-a204-e87ac0e27adf', 
'282e2e60-88a5-469d-84a5-ba8d9151644f', 
'id', 
'system$changedby');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20230115 19:16:43';
