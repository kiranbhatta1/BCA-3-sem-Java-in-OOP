class Time {
    int hours, minutes, seconds;

    Time(int h, int m, int s) {
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
        normalize();
    }

    void normalize() {
        minutes += seconds / 60;
        seconds %= 60;

        hours += minutes / 60;
        minutes %= 60;
    }

    Time add(Time t) {
        return new Time(this.hours + t.hours, this.minutes + t.minutes, this.seconds + t.seconds);
    }

    Time subtract(Time t) {
        int total1 = this.hours * 3600 + this.minutes * 60 + this.seconds;
        int total2 = t.hours * 3600 + t.minutes * 60 + t.seconds;
        int diff = Math.abs(total1 - total2);

        return new Time(diff / 3600, (diff % 3600) / 60, diff % 60);
    }

    void display() {
        System.out.printf("Time: %02d:%02d:%02d\n", hours, minutes, seconds);
    }
}

public class ClassTimeToDisplayTheVariable {
    public static void main(String[] args) {
        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(1, 30, 30);

        Time sum = t1.add(t2);
        Time diff = t1.subtract(t2);

        System.out.println("Added Time:");
        sum.display();

        System.out.println("Difference Time:");
        diff.display();
    }
}
