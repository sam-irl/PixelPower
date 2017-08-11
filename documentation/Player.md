# Player.java

## Attributes
### id
The Player's `id`. Can be `0` (Player 1) or `1` (Player 2).
### location
The Player's location, in an `[x, y]` array. Can be set using:
```
Player().setLocation(double[] location);

Player().setLocation(double x, double y);

Player().setLocation(util.makeArray(double x, double y));
```