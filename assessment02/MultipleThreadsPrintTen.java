public class MultipleThreadsPrintTen extends Thread {

    @Override
    public void run() {
        System.out.println (this.getName ());
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            MultipleThreadsPrintTen t = new MultipleThreadsPrintTen ();
            t.setName (Integer.toString (i));
            t.start ();
            try {
                t.join ();
            } catch (InterruptedException e) {
                System.err.println (e);
            }
        }

    }
}
