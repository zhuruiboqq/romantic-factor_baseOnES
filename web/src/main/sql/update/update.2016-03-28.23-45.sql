--历史脚本
alter table bas_AttachmentImage add rate DECIMAL(10,4);;
update bas_AttachmentImage set rate = width*100/height;;