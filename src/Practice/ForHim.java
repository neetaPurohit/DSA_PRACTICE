package Practice;

public class ForHim {
      // Method to print text like a typewriter
        static void typeWriter(String text, int delay) throws InterruptedException {
            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i));
                Thread.sleep(delay);
            }
            System.out.println();
        }

        public static void main(String[] args) throws InterruptedException {

            System.out.println("🎬 Starting message...\n");
            Thread.sleep(1000);

            typeWriter("Hello 👋", 100);
            Thread.sleep(1200);

            typeWriter("What are you doing", 90);
            Thread.sleep(1500);

            typeWriter("When will you come? 🤔", 100);
            Thread.sleep(1500);

            typeWriter("Waiting here like...", 120);
            Thread.sleep(1000);

            typeWriter("⏳ ⏳ ⏳", 400);
            Thread.sleep(1000);

            typeWriter("Okay okay 😅", 100);
            Thread.sleep(800);

            typeWriter("come soon! 🚀💙", 90);

        }
    }


