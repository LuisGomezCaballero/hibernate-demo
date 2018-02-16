
CREATE TABLE `mytable` (
  `myId` int(11) NOT NULL,
  `myString` varchar(32) NOT NULL,
  `myDate` date NOT NULL,
  `myFloat` float(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

ALTER TABLE `mytable`
  ADD PRIMARY KEY (`myId`);

ALTER TABLE `mytable`
  MODIFY `myId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;
