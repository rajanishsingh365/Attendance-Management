ALTER TABLE "myfirstmodule$attendancedetails_account" DROP CONSTRAINT "uniq_myfirstmodule$attendancedetails_account_myfirstmodule$attendancedetailsid";
DROP INDEX "idx_myfirstmodule$attendancedetails_account_administration$account_myfirstmodule$attendancedetails";
ALTER TABLE "myfirstmodule$leaverequestinfo_account" DROP CONSTRAINT "uniq_myfirstmodule$leaverequestinfo_account_myfirstmodule$leaverequestinfoid";
DROP INDEX "idx_myfirstmodule$leaverequestinfo_account_administration$account_myfirstmodule$leaverequestinfo";
ALTER TABLE "myfirstmodule$attendancedetails" RENAME TO "attendancemanagement$attendancedetails";
ALTER TABLE "myfirstmodule$attendancedetails_account" RENAME TO "attendancemanagement$attendancedetails_account";
ALTER TABLE "myfirstmodule$leaverequestinfo" RENAME TO "attendancemanagement$leaverequestinfo";
ALTER TABLE "myfirstmodule$leaverequestinfo_account" RENAME TO "attendancemanagement$leaverequestinfo_account";
UPDATE "mendixsystem$entity"
 SET "entity_name" = 'AttendanceManagement.AttendanceDetails', 
"table_name" = 'attendancemanagement$attendancedetails', 
"superentity_id" = NULL, 
"remote" = false, 
"remote_primary_key" = false
 WHERE "id" = '29221cc0-b6a2-4a46-a3c6-c38f55663fbe';
ALTER TABLE "attendancemanagement$attendancedetails_account" ALTER COLUMN "myfirstmodule$attendancedetailsid" RENAME TO "attendancemanagement$attendancedetailsid";
CREATE INDEX "idx_attendancemanagement$attendancedetails_account_administration$account_attendancemanagement$attendancedetails" ON "attendancemanagement$attendancedetails_account" ("administration$accountid" ASC,"attendancemanagement$attendancedetailsid" ASC);
ALTER TABLE "attendancemanagement$attendancedetails_account" ADD CONSTRAINT "uniq_attendancemanagement$attendancedetails_account_attendancemanagement$attendancedetailsid" UNIQUE ("attendancemanagement$attendancedetailsid");
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_myfirstmodule$attendancedetails_account_myfirstmodule$attendancedetailsid';
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_attendancemanagement$attendancedetails_account_attendancemanagement$attendancedetailsid', 
'3c7d4a5c-2ce4-4831-b6db-caab4274dae9', 
'f520ff06-eb7d-3757-ae0b-f18e5e4a01a3');
UPDATE "mendixsystem$association"
 SET "association_name" = 'AttendanceManagement.AttendanceDetails_Account', 
"table_name" = 'attendancemanagement$attendancedetails_account', 
"parent_entity_id" = '29221cc0-b6a2-4a46-a3c6-c38f55663fbe', 
"child_entity_id" = '3078a23e-13b2-4a9b-84e4-2881fdee53c6', 
"parent_column_name" = 'attendancemanagement$attendancedetailsid', 
"child_column_name" = 'administration$accountid', 
"pk_index_name" = NULL, 
"index_name" = 'idx_attendancemanagement$attendancedetails_account_administration$account_attendancemanagement$attendancedetails'
 WHERE "id" = '3c7d4a5c-2ce4-4831-b6db-caab4274dae9';
UPDATE "mendixsystem$entity"
 SET "entity_name" = 'AttendanceManagement.LeaveRequestInfo', 
"table_name" = 'attendancemanagement$leaverequestinfo', 
"superentity_id" = NULL, 
"remote" = false, 
"remote_primary_key" = false
 WHERE "id" = 'd7c7598b-f3ba-4506-af39-e37f0a932801';
ALTER TABLE "attendancemanagement$leaverequestinfo_account" ALTER COLUMN "myfirstmodule$leaverequestinfoid" RENAME TO "attendancemanagement$leaverequestinfoid";
CREATE INDEX "idx_attendancemanagement$leaverequestinfo_account_administration$account_attendancemanagement$leaverequestinfo" ON "attendancemanagement$leaverequestinfo_account" ("administration$accountid" ASC,"attendancemanagement$leaverequestinfoid" ASC);
ALTER TABLE "attendancemanagement$leaverequestinfo_account" ADD CONSTRAINT "uniq_attendancemanagement$leaverequestinfo_account_attendancemanagement$leaverequestinfoid" UNIQUE ("attendancemanagement$leaverequestinfoid");
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_myfirstmodule$leaverequestinfo_account_myfirstmodule$leaverequestinfoid';
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_attendancemanagement$leaverequestinfo_account_attendancemanagement$leaverequestinfoid', 
'c0851826-21a8-4fa6-bc35-6bff3a0abf43', 
'2bd9cd44-e77f-3f47-a9d0-2f96a87852b8');
UPDATE "mendixsystem$association"
 SET "association_name" = 'AttendanceManagement.LeaveRequestInfo_Account', 
"table_name" = 'attendancemanagement$leaverequestinfo_account', 
"parent_entity_id" = 'd7c7598b-f3ba-4506-af39-e37f0a932801', 
"child_entity_id" = '3078a23e-13b2-4a9b-84e4-2881fdee53c6', 
"parent_column_name" = 'attendancemanagement$leaverequestinfoid', 
"child_column_name" = 'administration$accountid', 
"pk_index_name" = NULL, 
"index_name" = 'idx_attendancemanagement$leaverequestinfo_account_administration$account_attendancemanagement$leaverequestinfo'
 WHERE "id" = 'c0851826-21a8-4fa6-bc35-6bff3a0abf43';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20221230 17:10:09';
