package se.lexicon;

import java.util.ArrayDeque;
import java.util.Queue;

public class ConcertQueue {
    void main() {
        /*
         Queue, because you want the first one to be the first one that gets out
         */

        Queue<String> queue = new ArrayDeque<>();

        queue.offer("Carl");
        queue.offer("Michael");
        queue.offer("Per");
        queue.offer("Ove");
        queue.offer("Carina");
        queue.offer("Ida");

        IO.println("Letting people into the concert:");

        IO.println(queue.poll() + " entered the concert.");
        IO.println(queue.poll() + " entered the concert.");

        IO.println("\nRemaining queue:");

        for (String person : queue) {
            IO.println(person);
        }
    }
}
