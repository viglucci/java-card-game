# java-card-game

Introductory Java programming challenge to implement a "card game" where a dealer shuffles a deck of cards and then deals "hands" to each player.

The running program with all tests passing should produce the below output:

```
Nick has the below cards in their hand:
  Six of Diamonds
  Ten of Hearts
  Two of Clubs
  Three of Spades
  King of Diamonds

Tommy has the below cards in their hand:
  Seven of Clubs
  Five of Hearts
  Four of Clubs
  Two of Diamonds
  Queen of Spades
```

## Challenge

Fork this repository and implement the Java class methods that satisfy all of the unit tests in the `tests/` directory.

## Java Version

This project expects Java version `11` or greater. You can modify the Java version in `pom.xml` to match your installed version of Java by editing the `<release>11</release>` value for the `<artifactId>maven-compiler-plugin</artifactId>` plugin.

### IDE

This project was setup with the IntelliJ IDEA IDE in mind, however you should be able to run Maven commands without IntelliJ IDEA if you have Maven installed on your machine.

## Branches

- The `main` branch has failing tests which need implementation to satisfy.
- The `solution` branch has implementations that satisfy all tests.
