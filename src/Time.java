public class Time {
    /** The number of hours in the current time */
    private int hours;

    /** The number of minutes in the current time */
    private int minutes;

    /** The number of seconds in the current time */
    private int seconds;

    /** Creates a new Time object.
     * @param h The number of hours in the time
     * @param m The number of minutes in the time
     * @param s The number of seconds in the time
     */
    public Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    /** Increments the time by one second. Adjusts time as necessary if seconds exceeds 59, minutes exceeds 59, or hours exceeds 23 */
    public void tick() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
        }
        if (minutes == 60) {
            minutes = 0;
            hours++;
        }
        if (hours == 24) {
            hours = 0;
        }
    }

    /** Adds the given amount of time onto the current time. Adjusts time as necessary if seconds exceeds 59, minutes exceeds 59, or hours exceeds 23
     * @param a The Time being added onto the current time
     */
    public void add(Time a) {
        hours += a.getHours();
        minutes += a.getMinutes();
        seconds += a.getSeconds();
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        }
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
        if (hours >= 24) {
            hours = hours % 24;
        }
    }

    /** Overrides the toString method and represents the current time placed in a proper format.
     * @return Returns the time represented in the proper format.
     */
    public String toString() {
        String hourFormat = Integer.toString(hours);
        String minFormat = Integer.toString(minutes);
        String secFormat = Integer.toString(seconds);
        if (hourFormat.length() != 2) {
            hourFormat = "0" + hourFormat;
        }
        if (minFormat.length() != 2) {
            minFormat = "0" + minFormat;
        }
        if (secFormat.length() != 2) {
            secFormat = "0" + secFormat;
        }
        return hourFormat + ":" + minFormat + ":" + secFormat;
    }

    /** Getter method for the private hours variable
     * @returns Returns the number of hours in the current time.
     */
    public int getHours() {
        return hours;
    }

    /** Getter method for the private minutes variable
     * @returns Returns the number of minutes in the current time.
     */
    public int getMinutes() {
        return minutes;
    }

    /** Getter method for the private seconds variable
     * @returns Returns the number of seconds in the current time.
     */
    public int getSeconds() {
        return seconds;
    }
}
