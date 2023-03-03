CREATE TABLE `englishkurs`.`user` (
  `id` BIGINT(30) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE);



CREATE TABLE `englishkurs`.`users_roles` (
  `user_id` BIGINT(30) NOT NULL,
  `roles_id` BIGINT(30) NOT NULL,
  INDEX `fk_users_idx` (`user_id` ASC) VISIBLE,
  INDEX `fk_roles_idx` (`roles_id` ASC) VISIBLE,
  CONSTRAINT `fk_users`
    FOREIGN KEY (`user_id`)
    REFERENCES `englishkurs`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_roles`
    FOREIGN KEY (`roles_id`)
    REFERENCES `englishkurs`.`roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


INSERT INTO englishkurs.users_roles(user_id, roles_id) VALUES (1, 1);


CREATE TABLE `englishkurs`.`en_words` (
  `id` BIGINT(30) NOT NULL,
  `meaning` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `meaning_UNIQUE` (`meaning` ASC) VISIBLE);



CREATE TABLE `englishkurs`.`ru_words` (
  `id` BIGINT(30) NOT NULL AUTO_INCREMENT,
  `meaning` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `meaning_UNIQUE` (`meaning` ASC) VISIBLE);


CREATE TABLE `englishkurs`.`cards` (
  `id` BIGINT(30) NOT NULL AUTO_INCREMENT,
  `en_word_id` BIGINT(30) NOT NULL,
  `ru_word_id` BIGINT(30) NOT NULL,
  `rating` BIGINT(30) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_idx` (`en_word_id` ASC) VISIBLE,
  INDEX `fk_ru_word_idx` (`ru_word_id` ASC) VISIBLE,
  CONSTRAINT `fk_en_word`
    FOREIGN KEY (`en_word_id`)
    REFERENCES `englishkurs`.`en_words` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ru_word`
    FOREIGN KEY (`ru_word_id`)
    REFERENCES `englishkurs`.`ru_words` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


INSERT INTO englishkurs.en_words(meaning) VALUES ('hello');
INSERT INTO englishkurs.ru_words(meaning) VALUES ('привет');
INSERT INTO englishkurs.cards(en_word_id, ru_word_id, rating) VALUES (1, 1, 1);
