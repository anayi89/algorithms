function isMerge(s, part1, part2) {
 // loop through the string, s
 for (var i = 0; i < s.length; i++) {
  // if part1 is longer than part2, loop through part1
  if (part1.length > part2.length) {
   for (var j = 0; j < part1.length; j++) {
    // check if the character of the string, s, at index 0 is the same as the character of the string, part1, at index 0
    if (s.charAt(i) == part1.charAt(j)) {
     return true;
    }
    // else, check if the character of the string, s, at index 0 is the same as the character of the string, part2, at index 0
    else if (s.charAt(i) == part2.charAt(j)) {
     return true;
    }
    else {
     return false;
    }
   }
  }
  else {
   for (var k = 0; k < part2.length; k++) {
    // check if the character of the string, s, at index 0 is the same as the character of the string, part1, at index 0
    if (s.charAt(i) == part1.charAt(k)) {
     return true;
    }
    // else, check if the character of the string, s, at index 0 is the same as the character of the string, part2, at index 0
    else if (s.charAt(i) == part2.charAt(k)) {
     return true;
    }
    else {
     return false;
    }
   }
  }
 }
}
