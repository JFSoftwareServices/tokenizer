### Assumptions
Special characters should not be counted as words, however I have only implemented this with full stop characters,
due to time constraints.

The methods return the first occurrence of words and lengths. For example the method that returns the longest word in 
the sentence "The cow slowly jumped over the moon." will return "slowly" and 6.

### Running Tests
To build and execute tests:

mvn clean test

### Additional Work
Use a data driven approach to testing, i.e run the same test with different data sets. I did not do this due to time 
constraints.

Implement removal of special characters, other than full stop, from the sentence.

Implement tests using JUnit5