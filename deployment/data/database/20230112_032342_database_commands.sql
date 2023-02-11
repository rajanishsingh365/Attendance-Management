ALTER TABLE "chat$message_account_reciever" DROP CONSTRAINT "uniq_chat$message_account_reciever_administration$accountid";
ALTER TABLE "chat$message_account_sender" DROP CONSTRAINT "uniq_chat$message_account_sender_administration$accountid";
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_chat$message_account_reciever_administration$accountid';
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_chat$message_account_sender_administration$accountid';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20230112 03:23:42';
