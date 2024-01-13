grammar PhotoDSL;

start: photoSession;

photoSession: 'photoSession' STRING_LITERAL '{' commands '}';

commands: (command ';')*;

command: photoCommand | cameraCommand | filmCommand | settingsCommand;

photoCommand: 'photo' '{' photoDetails '}';
cameraCommand: 'camera' STRING_LITERAL;
filmCommand: 'film' STRING_LITERAL isoCommand?;
settingsCommand: 'settings' '{' exposureCommand apertureCommand '}';

photoDetails: 'date' STRING_LITERAL 'time' STRING_LITERAL 'location' STRING_LITERAL;
exposureCommand: 'exposureTime' FLOAT_LITERAL;
apertureCommand: 'aperture' FLOAT_LITERAL;
isoCommand: 'iso' INT_LITERAL;

STRING_LITERAL: '"' [a-zA-Z0-9 ]* '"';
FLOAT_LITERAL: '-'? [0-9]+ ('.' [0-9]+)?;
INT_LITERAL: '-'? [0-9]+;
