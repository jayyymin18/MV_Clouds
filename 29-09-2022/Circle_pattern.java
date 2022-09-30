class Circle_pattern {
    public static void main(String[] args) {
        int radius = 8;
        double dist;
        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {

                dist = Math.sqrt((i - radius) * (i - radius) +
                        (j - radius) * (j - radius));
                if (dist > radius - 0.5 && dist < radius + 0.5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

    }
}