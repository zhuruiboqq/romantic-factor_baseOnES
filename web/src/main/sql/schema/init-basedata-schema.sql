DROP TABLE IF EXISTS bas_AttachmentImage;;
DROP TABLE IF EXISTS bd_Artist;;
DROP TABLE IF EXISTS bd_ArtistWorks;;

CREATE TABLE bas_AttachmentImage (
  id INT(11) NOT NULL AUTO_INCREMENT,
  name VARCHAR(100),
  number VARCHAR(100),
  simpleName VARCHAR(100),
  createTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  creatorID INT(11),
  lastUpdateTime TIMESTAMP,
  lastUpdatorID INT(11),
  storePath VARCHAR(500),
  storeSmallPath VARCHAR(500),
  storeMidPath VARCHAR(500),
  displayURL VARCHAR(500),
  displaySmallURL VARCHAR(500),
  displayMidURL VARCHAR(500),
  permission VARCHAR(100),
  sizeInByte INT(11),
  size VARCHAR(100),
  extName VARCHAR(100),
  width INT(11),
  height INT(11),
  dataStatus varchar(30),
  PRIMARY KEY (id)
) ;;

CREATE TABLE bd_Artist (
  id INT(11) NOT NULL AUTO_INCREMENT,
  name VARCHAR(100),
  number VARCHAR(100),
   simpleName VARCHAR(100),
  createTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  creatorID INT(11),
  lastUpdateTime TIMESTAMP,
  lastUpdatorID INT(11),
  personImageID INT(11),
  region VARCHAR(100),
  organization VARCHAR(100),
  weixin VARCHAR(100),
  telephone VARCHAR(100),
  qq VARCHAR(100),
  degree VARCHAR(100),
   technical VARCHAR(100),
  content VARCHAR(1000),
  artistType VARCHAR(20),
  worksPath VARCHAR(200),
   priority INT(11),
   dataStatus varchar(30),
  PRIMARY KEY (id)
) ;;

CREATE TABLE bd_ArtistWorks (
  id INT(11) NOT NULL AUTO_INCREMENT,
  seq INT(11),
  artistID INT(11) NOT NULL,
  workID INT(11) NOT NULL,
  PRIMARY KEY (id)
) ;;
